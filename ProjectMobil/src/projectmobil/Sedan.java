/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmobil;

/**
 *
 * @author user
 */
public class Sedan extends Mobil {
    private int bensin = 10;
    String namamobil, tujuan;
    double jarak;
    int kecepatan;
    
    
    @Override
    public double HitungbahanBakar() {
        double bahanbakar =  this.jarak / bensin;
        return bahanbakar;
    }

    @Override
    public double HitunglamaWaktu() {
        double waktu = Math.round(this.jarak) / this.kecepatan;
        return waktu;
    }
    
    public void tampilHasil(){
        System.out.println("Mobil "+this.namamobil+ " jenis Sedan");
        System.out.println("Banyaknya bahan bakar minimal dari Solo menuju "+this.tujuan + " = "+this.HitungbahanBakar()+ " Liter") ;
        System.out.println("Lama waktu perjalanan mobil ke tujuan dengan kecepatan "+this.kecepatan+ " km/jam = "+this.HitunglamaWaktu() + " jam");
        System.out.println("");
    }
}
