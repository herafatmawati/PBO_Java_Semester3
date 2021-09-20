/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author user
 */
public class PersegiPanjang {
    //Atribut
    public int panjang;
    public int lebar;
    
    //Method
    public void hitungLuas(){
        int hitung = panjang * lebar;
        System.out.println("Luas Persegi Panjang adalah: " + hitung);
    }
    public void hitungKeliling(){
        int hitung = 2*panjang + 2*lebar;
        System.out.println("Keliling Persegi Panjang adalah: " + hitung);
    }
}
