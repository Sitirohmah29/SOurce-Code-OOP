package Pertemuan1;

public class User {
//	    String nama;
//	    int level;
//
//	    public void setUser(String setNama, int setLevel) {
//	        nama  = setNama;
//	        level = setLevel;
//	    }
//
//	    public void getUser() {
//	        System.out.println("Nama  : " + nama);
//	        System.out.println("Level : " + level);
//	    }
//
//	    public static void main(String[] args) {
//	        User usr = new User();
//	        usr.setUser("John Doe", 5);
//	        usr.getUser();
//	    }
	
	
	    // static variable dapat ditetapkan nilainya di dalam block khusus static
	    public static int level;

	    // static final, nilainya tetap dan tidak dirubah.
	    public static final String username = "masgani.com";

	    public static void main(String[] args) {
	        level = 5;
	        System.out.println("Username : " + username);
	        System.out.println("Level    : " + level);
	    }


}
