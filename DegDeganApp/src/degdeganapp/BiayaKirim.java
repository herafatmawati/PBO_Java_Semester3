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
public class BiayaKirim {
//Untuk menghitung biaya kirim ke kota tujuan    

//Atribut
    int berat_satuan = 1200;
    int batas_maks = 3000;
    int km_antar = 5;
    int ongkos_kirim = 700000;
    
    
    //Method dengan Overloading 
    
    int totalBiayaKirim(int jumlah_pasokan, int jarak){
        int berat = (int) (jumlah_pasokan*berat_satuan/1000);
        int kaliantaran;
        kaliantaran = berat / batas_maks;
        int jarakantar;
        jarakantar = jarak / km_antar;
        int biayasekaliantar;
        biayasekaliantar = jarakantar*ongkos_kirim;
        int totalbiayakirim;
        totalbiayakirim = biayasekaliantar * kaliantaran;
        System.out.println("Biaya Kirim = " + totalbiayakirim);
        return totalbiayakirim;
    }
    
    double totalBiayaKirim(int jumlah_pasokan, double jarak){
        int berat; 
        berat = jumlah_pasokan*berat_satuan/1000;
        int kaliantaran;
        kaliantaran = berat / batas_maks;
        double jarakantar;
        jarakantar = jarak / km_antar;
        double biayasekaliantar;
        biayasekaliantar = jarakantar*ongkos_kirim;
        double totalbiayakirim;
        totalbiayakirim = biayasekaliantar * kaliantaran;
        System.out.println("Biaya Kirim = " + totalbiayakirim);
        return totalbiayakirim;
    }
   
}
