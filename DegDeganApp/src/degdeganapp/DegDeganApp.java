/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package degdeganapp;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class DegDeganApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        Scanner input = new Scanner(System.in);
        System.out.println("-- DegDeganApp hitung harga jual degan satuan --");
        System.out.println("Isikan Data Pemasokan Pak Amir");

        System.out.println(" ");
        System.out.println("Nama Kota ke-1 : Boyolali");
        System.out.print("Jarak: ");
        int jarak1;
        jarak1 = input.nextInt();
        System.out.print("Jumlah Pasokan: ");
        int jumlah_pasokan1;
        jumlah_pasokan1 = input.nextInt();
        
        System.out.println(" ");
        System.out.println("Nama Kota ke-2 : Salatiga");
        System.out.print("Jarak: ");
        int jarak2;
        jarak2 = input.nextInt();
        System.out.print("Jumlah Pasokan: ");
        int jumlah_pasokan2;
        jumlah_pasokan2= input.nextInt();
        
        System.out.println(" ");
        System.out.println("Nama Kota ke-3 : Klaten");
        System.out.print("Jarak (masukkan dalam bentuk desimal( x.0)) : ");
        double jarak3;
        jarak3 = input.nextDouble();
        System.out.print("Jumlah Pasokan: ");
        int jumlah_pasokan3;
        jumlah_pasokan3= input.nextInt();
        
        System.out.println(" ");
        System.out.println("Nama Kota ke-4 : Kudus");
        System.out.print("Jarak (masukkan dalam bentuk desimal( x.0)) : ");
        double jarak4;
        jarak4= input.nextDouble();
        System.out.print("Jumlah Pasokan: ");
        int jumlah_pasokan4= input.nextInt();
        
        System.out.println(" ");
        System.out.println("=========================================");
        System.out.println(" ");
        
        System.out.println("1. Boyolali");
        BiayaKirim biaya1 = new BiayaKirim();
        biaya1.totalBiayaKirim(jumlah_pasokan1, jarak1);
        HargaBeli h1 = new HargaBeli();
        h1.hargaBeli(jumlah_pasokan1);
        System.out.println(" ");
        
        System.out.println("2. Salatiga");
        BiayaKirim biaya2 = new BiayaKirim();
        biaya2.totalBiayaKirim(jumlah_pasokan2, jarak2);
        HargaBeli h2 = new HargaBeli();
        h2.hargaBeli(jumlah_pasokan2);
        System.out.println(" ");
        
        System.out.println("3. Klaten");
        BiayaKirim biaya3 = new BiayaKirim();
        biaya3.totalBiayaKirim(jumlah_pasokan3, jarak3);
        HargaBeli h3 = new HargaBeli();
        h3.hargaBeli(jumlah_pasokan3);
        System.out.println(" ");
        
        System.out.println("4. Kudus");
        BiayaKirim biaya4 = new BiayaKirim();
        biaya4.totalBiayaKirim(jumlah_pasokan4, jarak4);
        HargaBeli h4 = new HargaBeli();
        h4.hargaBeli(jumlah_pasokan4);
        System.out.println(" ");
        
        int TotalPasokan;
        TotalPasokan = jumlah_pasokan1 + jumlah_pasokan2 + jumlah_pasokan3 + jumlah_pasokan4;
        System.out.println("Jumlah Seluruh Pasokan = " + TotalPasokan);
        
        int TotalModalBeliDegan;
        TotalModalBeliDegan = h1.hargaBeli(jumlah_pasokan1) + h2.hargaBeli(jumlah_pasokan2) + h3.hargaBeli(jumlah_pasokan3) + h4.hargaBeli(jumlah_pasokan4);
        
        double TotalBiayaKirim;
        TotalBiayaKirim = biaya1.totalBiayaKirim(jumlah_pasokan1, jarak1) + biaya2.totalBiayaKirim(jumlah_pasokan2, jarak2) + biaya3.totalBiayaKirim(jumlah_pasokan3, jarak3) + biaya4.totalBiayaKirim(jumlah_pasokan4, jarak4);
        
        double TotalSeluruhModal;
        TotalSeluruhModal = TotalModalBeliDegan + TotalBiayaKirim;
        
        double HargaJualKeseluruhan;
        HargaJualKeseluruhan =  15000000 + TotalSeluruhModal;
        
        double HargaJualSatuan;
        HargaJualSatuan = HargaJualKeseluruhan / TotalPasokan;
        
        System.out.println(" ");
        System.out.println("Jika pak Amir menginginkan keuntungan kisaran 15 juta maka disarankan menentukan ");
        System.out.println("Harga Jual per Degan minimum adalah = Rp " + HargaJualSatuan);
        
    }
    
}
