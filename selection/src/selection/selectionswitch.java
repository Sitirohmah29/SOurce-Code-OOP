package selection;

import java.util.Scanner;

public class selectionswitch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		String merek = "Samsung";
//		Integer battery = 10;
//		int stock;
//		Boolean isSell = false;
//		
//		System.out.print("Enter name of phone: ");
//		String tipe = input.nextLine();
//		
//		System.out.print("Enter color of phone: ");
//		String color = input.nextLine();
//		
//		System.out.print("Enter battery health: ");
//		battery = input.nextInt();
//		
//		switch(color) {
//		case "red" :{
//			stock = 5; isSell = true;
//			break;
//		}
//		case "blue" :{
//			stock = 2; isSell = true;
//			break;
//		}
//		default:
//			stock = 0;
//		}
//		
//		System.out.println("\n======"+merek+"-"+tipe+"======");
//		System.out.println("Baterai "+battery+"% ");
//		if(battery < 20){
//			System.out.print("(need charging)");
//		}
//		System.out.println("Color "+color+"\nStock: "+stock);
//		System.out.println("======"+((isSell) ? "for sale" : "sold").toUpperCase() + "======");
		
		int angka;
		
		
		for(int i =1; i< angka; i++) {
			for(int j = 1; j < angka; j++) {
				System.out.println(" *");
			}
		}
			
		System.out.println("input angka"+angka);
		angka = input.nextInt();
		
		input.close();
	}
}
