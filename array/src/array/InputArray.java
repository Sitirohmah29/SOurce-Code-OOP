package array;

import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        // Membuat Scanner untuk mengambil input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk menentukan ukuran array
        System.out.print("Masukkan jumlah elemen dalam array: ");
        int n = input.nextInt();

        // Deklarasi array dengan ukuran yang dimasukkan pengguna
        int[] array = new int[n];

        // Meminta pengguna untuk mengisi elemen-elemen array
        System.out.println("Masukkan " + n + " elemen:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        // Menampilkan elemen-elemen array yang telah diinput
        System.out.println("\nElemen-elemen array yang dimasukkan:");
        for (int i = 0; i < n; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }

        // Menutup scanner
        input.close();
    }
}
