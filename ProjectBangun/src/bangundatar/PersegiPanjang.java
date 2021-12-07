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
public class PersegiPanjang extends BangunDatar{
    //atribut panjang dan lebar
    public double p, l;
    
    //method untuk hitung Luas PP
    public double hitungLuas(){
        double luas = this.p*this.l;
        return luas;
    }
    
    //method untuk m=hitung keliling
    public double hitungKeliling(){
        double keliling = 2 * (this.p+this.l);
        return keliling;
    }
    public void tampilHasil(){
        System.out.println("Luas Persegi Panjang : "+this.hitungLuas());
        System.out.println("Keliling Persegi Panjang : "+this.hitungKeliling());
        System.out.println("");
    }
}
