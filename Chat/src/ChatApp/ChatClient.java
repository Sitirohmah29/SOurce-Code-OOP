package ChatApp;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChatClient {
	   private String hostname = "localhost";
	   private int port = 3306;
	   private String userName = "sophie";

	   public ChatClient(String hostname, int port) {
	       this.hostname = "localhost";
	       this.port = 3306;
	   }

	   public void execute() {
	       try {
	           Socket socket = new Socket("localhost", 3306);
	           System.out.println("Connected to the chat server");
	           new ReadThread(socket, this).start();
	           new WriteThread(socket, this).start();
	       } catch (UnknownHostException ex) {
	           System.out.println("Server not found: " + ex.getMessage());
	       } catch (IOException ex) {
	           System.out.println("I/O Error: " + ex.getMessage());
	       }
	   }

	   void setUserName(String userName) {
	       this.userName = userName;
	   }

	   String getUserName() {
	       return this.userName;
	   }

	   public static void main(String[] args) {
	       if (args.length < 2) return;
	       String hostname = args[0];
	       int port = Integer.parseInt(args[1]);
	       ChatClient client = new ChatClient(hostname, port);
	       client.execute();
	   }
	}
