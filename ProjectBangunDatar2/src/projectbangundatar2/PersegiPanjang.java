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
public class PersegiPanjang {
    void hitungLuas(int p, int l){
        int luas=p*l;
        System.out.println("Luas persegi panjang dengan p " +p+ " dan l " +l+ " adalah : " +luas+ " satuan luas");
    }
    void hitungLuas(double p, int l){
        double luas=p*l;
        System.out.println("Luas persegi panjang dengan p " +p+ " dan l " +l+ " adalah : " +luas+ " satuan luas");
    }
    void hitungLuas(int p, double l){
        double luas=p*l;
        System.out.println("Luas persegi panjang dengan p " +p+ " dan l " +l+ " adalah : " +luas+ " satuan luas");
    }
    void hitungLuas(double p, double l){
        double luas=p*l;
        System.out.println("Luas persegi panjang dengan p " +p+ " dan l " +l+ " adalah : " +luas+ " satuan luas");
    }
    
    void hitungKeliling(int p, int l){
        int keliling=2*p+2*l;
        System.out.println("Keliling persegi panjang dengan p " +p+ " dan l " +l+ " adalah : " +keliling);
        System.out.println(" ");
    }
    void hitungKeliling(double p, int l){
        double keliling=2*p+2*l;
        System.out.println("Keliling persegi panjang dengan p " +p+ " dan l " +l+ " adalah : " +keliling);
        System.out.println(" ");
    }
    void hitungKeliling(int p, double l){
        double keliling=2*p+2*l;
        System.out.println("Keliling persegi panjang dengan p " +p+ " dan l " +l+ " adalah : " +keliling);
        System.out.println(" ");
    }
    void hitungKeliling(double p, double l){
        double keliling=2*p+2*l;
        System.out.println("Keliling persegi panjang dengan p " +p+ " dan l " +l+ " adalah : " +keliling);
        System.out.println(" ");
    }
}
