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
public abstract class BangunDatar {
    public void tampilHasil(){
        System.out.println("Luasnya: "+this.hitungLuas());
        System.out.println("Kelilingnya: "+this.hitungKeliling());
    }
     
    public abstract double hitungLuas();
    public abstract double hitungKeliling();
    
   
}
