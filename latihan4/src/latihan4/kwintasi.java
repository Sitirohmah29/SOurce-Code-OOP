package latihan4;

import java.util.Date;
import java.text.SimpleDateFormat;

public class kwintasi {
	public static void main(String[] args) {
	    Integer jml = 5;
	    String item = "ROTI ENAK";
	    double diskon = 0, totalBayar = 0, hargaBarang = 6300,totalHarga;
	    totalHarga = hargaBarang * jml;
	    Date waktuSaatIni = new Date();
	    SimpleDateFormat dateFormat = new SimpleDateFormat(); 
	    
	 	System.out.println("=============================================");
		System.out.println("              TOKO SERBAGUNA IBIK           ");
		System.out.println("=============================================");
		System.out.println("Masukan jumlah produk yang dibeli : "+jml);
		System.out.println("\n"+dateFormat.format(waktuSaatIni));
		System.out.println("ITEM         QTY      HARGA         TOTAL");
		System.out.println("=============================================");
		System.out.println(item+"     " +jml+"    Rp "+hargaBarang+"      Rp " +totalHarga);
		System.out.println("---------------------------------------------");
		if(jml % 3 == 0) {
        	diskon = totalHarga * 0.05;
        	System.out.println("Diskon: 5%");
        	totalBayar = totalHarga - diskon;
        }else {
        	diskon = totalHarga * 0.010;
        	System.out.println("Diskon: 10%");
        	totalBayar = totalHarga - diskon;
        }
		System.out.println("Sub Total: Rp "+totalBayar);
	}
}
