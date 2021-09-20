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
public class Bola {
    //Atribut
    public int r;
    
    //Method
    public void hitungVol(){
        double hitung= 4/3*3.14*r*r*r;
        System.out.println("Volume Bola : " + hitung);
    }
    public void hitungLuasSelimut(){
        double hitung=4*3.14*r*r;
        System.out.println("Luas Selimut Bola : "+hitung);
    }
}
