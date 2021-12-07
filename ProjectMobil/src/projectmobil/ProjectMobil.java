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
public class ProjectMobil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sedan s = new Sedan();
        s.namamobil = "A";
        s.tujuan = "Kudus";
        s.jarak = 112.6;
        s.kecepatan = 60;
        s.HitungbahanBakar();
        s.HitunglamaWaktu();
        s.tampilHasil();
        
        Sedan s2 = new Sedan();
        s.namamobil = "B";
        s.tujuan = "Jakarta";
        s.jarak = 553.5;
        s.kecepatan = 65;
        s.HitungbahanBakar();
        s.HitunglamaWaktu();
        s.tampilHasil();
        
        SUV v = new SUV();
        v.namamobil = "C";
        v.tujuan = "Banten";
        v.jarak = 673.5;
        v.kecepatan = 57;
        v.HitungbahanBakar();
        v.HitunglamaWaktu();
        v.tampilHasil();
        
        SUV v2 = new SUV();
        v2.namamobil = "D";
        v2.tujuan = "Bandung";
        v2.jarak = 552;
        v2.kecepatan = 62;
        v2.HitungbahanBakar();
        v2.HitunglamaWaktu();
        v2.tampilHasil();
        
        MPV m = new MPV();
        m.namamobil = "E";
        m.tujuan = "Banyuwangi";
        m.jarak = 505.3;
        m.kecepatan = 64;
        m.HitungbahanBakar();
        m.HitunglamaWaktu();
        m.tampilHasil();
        
        MPV m2 = new MPV();
        m2.namamobil = "F";
        m2.tujuan = "Jember";
        m2.jarak = 420.1;
        m2.kecepatan = 53;
        m2.HitungbahanBakar();
        m2.HitunglamaWaktu();
        m2.tampilHasil();
    }
    
}
