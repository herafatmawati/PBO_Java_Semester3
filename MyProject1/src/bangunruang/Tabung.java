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
public class Tabung {
    //Atribut
    public int jejari;
    public int t;
    public double phi=3.14;
    
    //Method
    public void hitungVol(){
        double hitung= phi*jejari*jejari*t;
        System.out.println("Volume Tabung : "+ hitung);
    }
    public void hitungLuasSelimut(){
        double hitung= 2*phi*jejari*t;
        System.out.println("Luas Selimut Tabung : "+hitung);
    }
}
