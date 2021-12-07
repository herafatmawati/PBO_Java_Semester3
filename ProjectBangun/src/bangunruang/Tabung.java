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
public class Tabung extends BangunRuang{
    //atribut tabung
    public double r,t;

    @Override
    public double hitungluasPermukaan() {
        double luasPermukaan = 2 * Math.PI * this.r *(this.r+this.t);
        return luasPermukaan;
    }

    @Override
    public double hitungVolume() {
        double volume = Math.PI * this.r * this.r * this.t;
        return volume;
    }
    
    public void tampilHasilRuang(){
        System.out.println("Luas Permukaan Tabung : "+this.hitungluasPermukaan());
        System.out.println("Volume Tabung : "+this.hitungVolume());
        System.out.println("");
    }
}
