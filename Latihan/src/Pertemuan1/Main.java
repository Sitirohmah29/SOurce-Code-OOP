package Pertemuan1;
import java.util.Scanner;
//import java.util.Locale;
public class Main {

	  public static void main(String args[]){
	            
	    Scanner input = new Scanner(System.in);
	       
	    System.out.println("##  Program Java Menghitung Luas Lingkaran  ##");
	    System.out.println("==============================================");
	    System.out.println();
	      
	    double r, luas;
	  
	    System.out.print("Input jari-jari lingkaran: ");
	    r = input.nextDouble();
	   
	    luas = 3.14 * r * r;
	       
	    System.out.println("Luas lingkaran: "+luas);
	  
	  }


}
