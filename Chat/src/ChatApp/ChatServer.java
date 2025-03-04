package ChatApp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;

public class ChatServer {
    private int port;
    private Set<String> userNames = new HashSet<>();
    private Set<UserThread> userThreads = new HashSet<>();

    public ChatServer(int port) {
        this.port = port;
    }

    public void execute() {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Chat Server is listening on port " + port);
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("New user connected");
                UserThread newUser = new UserThread(socket, this);
                userThreads.add(newUser);
                newUser.start();
            }
        } catch (IOException ex) {
            System.out.println("Error in the server: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Syntax: java ChatServer <port-number>");
            System.exit(0);
        }
        int port = Integer.parseInt(args[0]);
        ChatServer server = new ChatServer(port);
        server.execute();
    }

    // Modified the synchronized block to avoid concurrent modification issues
    void broadcast(String message, UserThread excludeUser) {
        synchronized (userThreads) {
            for (UserThread aUser : userThreads) {
                if (aUser != excludeUser) {
                    aUser.sendMessage(message);
                }
            }
        }
    }

    // Modified the synchronized block to avoid concurrent modification issues
    void addUserName(String userName) {
        synchronized (userNames) {
            userNames.add(userName);
        }
    }

    // Modified the synchronized block to avoid concurrent modification issues
    void removeUser(String userName, UserThread aUser) {
        synchronized (userNames) {
            boolean removed = userNames.remove(userName);
            if (removed) {
                synchronized (userThreads) {
                    userThreads.remove(aUser);
                }
                System.out.println("The user " + userName + " quitted");
            }
        }
    }

    Set<String> getUserNames() {
        synchronized (userNames) {
            return new HashSet<>(this.userNames);
        }
    }

    boolean hasUsers() {
        synchronized (userNames) {
            return !this.userNames.isEmpty();
        }
    }
}
