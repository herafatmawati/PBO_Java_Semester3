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
public abstract class BangunRuang {
    public abstract double hitungluasPermukaan();
    public abstract double hitungVolume();
    public void tampilHasilRuang(){
        System.out.println("Luas Permukaannya: "+this.hitungluasPermukaan());
        System.out.println("Volumenya: "+this.hitungVolume());
    }
}
