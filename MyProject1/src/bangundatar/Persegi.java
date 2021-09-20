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
public class Persegi {
    //Atribut
    public int sisi;
    
    //Method
    public void hitungLuas(){
        int hitung = sisi*sisi;
        System.out.println("luas Persegi adalah: "+hitung);
    }
    public void hitungKeliling(){
        int hitung = 4*sisi;
        System.out.println("Keliling Persegi adalah: "+hitung);
    }
}
