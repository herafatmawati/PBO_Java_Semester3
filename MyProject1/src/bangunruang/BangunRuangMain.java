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
public class BangunRuangMain {
    public static void main(String[] args){
        Bola b1 = new Bola();
        b1.r = 10;
        b1.hitungVol();
        b1.hitungLuasSelimut();
        
        Kerucut k1 = new Kerucut();
        k1.jari=10;
        k1.tinggi=24;
        k1.hitungVol();
        k1.s=6;
        k1.hitungLuasSelimut();
        
        Tabung t1 = new Tabung();
        t1.jejari=21;
        t1.t=50;
        t1.hitungVol();
        t1.hitungLuasSelimut();
    }
}
