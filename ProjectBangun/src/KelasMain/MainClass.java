/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KelasMain;

import bangundatar.BangunDatar;
import bangundatar.Lingkaran;
import bangundatar.Persegi;
import bangundatar.PersegiPanjang;
import bangunruang.Balok;
import bangunruang.Bola;
import bangunruang.Tabung;


/**
 *
 * @author user
 */
public class MainClass {
    public static void main(String[] args) {  
        
       Persegi p = new Persegi();
       p.sisi = 4;
       System.out.println("Persegi");
       p.hitungKeliling();
       p.hitungLuas();
       p.tampilHasil();
       
       Lingkaran l = new Lingkaran();
       l.r = 14;
       l.hitungKeliling();
       l.hitungLuas();
       l.tampilHasil();

       PersegiPanjang pp = new PersegiPanjang();
       pp.l = 8;
       pp.p = 4;
       System.out.println("Persegi Panjang");
       pp.hitungKeliling();
       pp.hitungLuas();
       pp.tampilHasil();
        
       Balok b = new Balok();
       b.p = 6;
       b.l = 2;
       b.t = 4;
       System.out.println("Balok");
       b.hitungluasPermukaan();
       b.hitungVolume();
       b.tampilHasilRuang();
        
      Bola o = new Bola();
      o.r = 9;
      System.out.println("Bola");
      o.hitungluasPermukaan();
      o.hitungVolume();
      o.tampilHasilRuang();
      
      Tabung tab = new Tabung();
      tab.t = 10;
      tab.r = 5;
      System.out.println("Tabung");
      tab.hitungluasPermukaan();
      tab.hitungVolume();
      tab.tampilHasilRuang();
       
    }
}
