package tugas_selection_repetition;

import java.util.Scanner; 

public class coba {

//		    public static void main(String[] args) {
//		        Scanner input = new Scanner(System.in);
//		        System.out.print("Masukkan tinggi belah ketupat (ganjil): ");
//		        int tinggi = input.nextInt();
//
//		        if (tinggi % 2 == 0) {
//		            System.out.println("Tinggi harus ganjil!");
//		        } else {
//		            int setengahTinggi = tinggi / 2 + 1;
//		            int i = 0;
//
//		            // Segitiga atas
//		            while (i < setengahTinggi) {
//		                int j = 0;
//
//		                // Cetak spasi
//		                while (j < tinggi - i - 1) {
//		                    System.out.print(" ");
//		                    j++;
//		                }
//
//		                int k = 0;
//
//		                // Cetak bintang atau spasi
//		                while (k < 2 * i + 1) {
//		                    if (i == 0 || k == 0 || k == 2 * i) {
//		                        System.out.print("*");
//		                    } else {
//		                        System.out.print(" ");
//		                    }
//		                    k++;
//		                }
//
//		                // Cetak bintang di luar sisi bolongan
//		                j = 0;
//		                while (j < i) {
//		                    System.out.print("*");
//		                    j++;
//		                }
//
//		                System.out.println();
//		                i++;
//		            }
//
//		            i = setengahTinggi - 2;
//
//		            // Segitiga bawah
//		            while (i >= 0) {
//		                int j = 0;
//
//		                // Cetak spasi
//		                while (j < tinggi - i - 1) {
//		                    System.out.print(" ");
//		                    j++;
//		                }
//
//		                int k = 0;
//
//		                // Cetak bintang atau spasi
//		                while (k < 2 * i + 1) {
//		                    if (i == tinggi / 2 || k == 0 || k == 2 * i) {
//		                        System.out.print("*");
//		                    } else {
//		                        System.out.print(" ");
//		                    }
//		                    k++;
//		                }
//
//		                // Cetak bintang di luar sisi bolongan
//		                j = 0;
//		                while (j < i) {
//		                    System.out.print("*");
//		                    j++;
//		                }
//
//		                System.out.println();
//		                i--;
//		            }
//		        }
//		    }
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i + 1; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * i - 2; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= rows - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = rows - 1; i >= 1; i--) {
            for (int j = i; j <= rows; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= (2 * i) - 2; k++) {
                System.out.print(" ");
            }
            for (int j = i; j <= rows; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
       
    }
		}
