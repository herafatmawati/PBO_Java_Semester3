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
public class HargaBeli {
    int harga_beli = 8000;
    int biaya_pembelian;

    
    //Method
    public int hargaBeli(int jumlah_pasokan){
       biaya_pembelian = jumlah_pasokan*harga_beli;
       System.out.println("Jumlah Beli = " + biaya_pembelian);
       return biaya_pembelian;
    }
}
