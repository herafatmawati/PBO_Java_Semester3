/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author user
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Hitung Persegi Panjang
        PersegiPanjang pp = new PersegiPanjang();
        pp.hitungLuas(10, 5);
        pp.hitungKeliling(10, 5);
        
        pp.hitungLuas(3.6, 8);
        pp.hitungKeliling(3.6, 8);
        
        pp.hitungLuas(6, 8.3);
        pp.hitungKeliling(6, 8.3);
        
        pp.hitungLuas(5.6, 8.8);
        pp.hitungKeliling(5.6, 8.8);
        
        //Hitung Persegi
        Persegi p = new Persegi();
        p.hitungLuas(4.5);
        p.hitungKeliling(4.5);
        
        p.hitungLuas(7);
        p.hitungKeliling(7);
        
        //Hitung Lingkaran
        Lingkaran l = new Lingkaran();
        l.hitungLuas(5);
        l.hitungKeliling(5);
        
        l.hitungLuas(7.4);
        l.hitungKeliling(7.4);
        
        //Hitung Segitiga
        Segitiga t = new Segitiga();
        t.hitungLuas(8, 10);
        t.hitungKeliling(8, 10);
        
        t.hitungLuas(8, 11.5);
        t.hitungKeliling(8,11.5);
        
        t.hitungLuas(12.2, 9);
        t.hitungKeliling(12.2, 9);
        
        t.hitungLuas(13.9, 20.7);
        t.hitungKeliling(13.9, 20.7);
    }
    
    
}
