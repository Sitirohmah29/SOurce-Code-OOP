package Quiz1;
import java.util.Scanner; 

public class Looping {
//	  public static void main(String args[]){
//		  Scanner input = new Scanner(System.in);
//		  System.out.println("##  Program Java Belah Ketupat Bintang  ##");
//		  System.out.println("==========================================");
//		  System.out.println();
//		  
//		  int lebar_belah_ketupat,i,j,k;
//		  System.out.print("Input lebar belah ketupat: ");
//	      lebar_belah_ketupat = input.nextInt();
//	      System.out.println();
//	      for(i=1; i<=lebar_belah_ketupat; i++) {
//	    	  for(j=1; j<=lebar_belah_ketupat-i; j++) {
//	    		  System.out.print(" ");
//	      }
//	    	  for(k=1; k<=i; k++) {
//	    		  System.out.print(" *");
//	      }
//	    	  System.out.println();
//	    }
//	      for(i=1; i<lebar_belah_ketupat; i++) {
//	    	  for(j=1; j<=i; j++) {
//	    		  System.out.print(" ");
//	      }
//	    	  for(k=1; k<=lebar_belah_ketupat-i; k++) {
//	    		  System.out.print(" *");
//	      }
//	    	  System.out.println();
//	    }    
//	     input.close(); 
//	  }
	


	
	    public static void main(String[] args) {
	        // Menggunakan Scanner untuk menerima input dari pengguna
	        Scanner scanner = new Scanner(System.in);
	        
	        // Meminta input tinggi segitiga
	        System.out.print("Masukkan tinggi segitiga: ");
	        int n = scanner.nextInt(); // Membaca input tinggi
	        
	        // Membuat segitiga terbalik
	        for (int i = n; i >= 1; i--) { // Loop untuk baris
	            for (int j = 0; j < n - i; j++) { // Loop untuk spasi
	                System.out.print(" ");
	            }
	            for (int k = 1; k <= i; k++) { // Loop untuk mencetak bintang
	                System.out.print("* ");
	            }
	            System.out.println(); // Pindah ke baris berikutnya
	        }

	        // Menampilkan jumlah baris (tinggi segitiga) yang dimasukkan
	        System.out.println();	        
	        // Menutup Scanner
	        scanner.close();
	    }
	


}


