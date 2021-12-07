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
public class Balok extends BangunRuang{
    //Atribut balok
    public double p, l, t;
    
    @Override
    public double hitungluasPermukaan() {
        double luasPermukaan = 2 * ((this.p*this.l) + (this.p*this.t) + (this.l*this.t));
        return luasPermukaan;
    }

    @Override
    public double hitungVolume() {
        double volume = this.p * this.l * this.t;
        return volume;
    }
    public void tampilHasilRuang(){
        System.out.println("Luas Permukaan Balok : "+this.hitungluasPermukaan());
        System.out.println("Volume Balok : "+this.hitungVolume());
        System.out.println("");
    }
}
