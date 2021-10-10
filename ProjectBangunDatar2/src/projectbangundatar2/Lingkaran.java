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
public class Lingkaran {
    void hitungLuas(int r){
        double luas=3.14*Math.pow(r,2);
        System.out.println("Luas lingkaran jejari " +r+ " adalah : " + luas+ " satuan luas");
    }
    void hitungLuas(double r){
        double luas=3.14*Math.pow(r,2);
        System.out.println("Luas lingkaran jejari " +r+ " adalah : " +luas+ " satuan luas");
    }
    
    void hitungKeliling(int r){
        double keliling=2*3.14*r;
        System.out.println("Keliling lingkaran jejari " +r+ " adalah : " +keliling);
        System.out.println("");
    }
    void hitungKeliling(double r){
        double keliling=2*3.14*r;
        System.out.println("Keliling lingkaran jejari " +r+ " adalah : " +keliling);
        System.out.println("");
    }
}
