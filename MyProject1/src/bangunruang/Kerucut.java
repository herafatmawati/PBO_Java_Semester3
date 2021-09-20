/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author user
 */
public class Kerucut {
    //Atribut
    public int jari;
    public int tinggi;
    public int s;
    public double phi=3.14;
   
    
    //Method
    
    public void hitungVol(){
        double hitung = phi*jari*jari*tinggi/3;
        System.out.println("Volume Kerucut : "+ hitung);
    }
    public void hitungLuasSelimut(){
        double hitung=phi*jari*s;
        System.out.println("Luas Selimut Kerucut : "+ hitung);
    }
}
