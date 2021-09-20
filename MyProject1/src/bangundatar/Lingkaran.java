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
public class Lingkaran {
    //Atribut
    public double phi=3.14;
    public double r;
    
    //Method
    public void hitungLuas(){
        double hasil = phi*r*r;
        System.out.println("Luas Lingkaran adalah "+hasil);
    }
    public void hitungKeliling(){
        double hasil = 2*phi*r;
        System.out.println("Keliling Lingkaran adalah "+hasil);
    }
    
    //Operasi
    
    
    
}
