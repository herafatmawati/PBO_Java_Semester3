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
public class Bola extends BangunRuang{
    //atribut bola 
    public double r;

    @Override
    public double hitungluasPermukaan() {
        double luasPermukaan = 4 * (Math.PI *this.r * this.r) ;
        return luasPermukaan;
    }

    @Override
    public double hitungVolume() {
        double volume = 4/3 * (Math.PI * this.r *this.r*this.r);
        return volume;
    }
    public void tampilHasilRuang(){
        System.out.println("Luas Permukaan Bola : "+this.hitungluasPermukaan());
        System.out.println("Volume Bola : "+this.hitungVolume());
        System.out.println("");
    }
    
}
