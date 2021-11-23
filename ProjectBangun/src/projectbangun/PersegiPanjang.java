/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangun;

/**
 *
 * @author user
 */
public class PersegiPanjang {
    public int panjang;
    public int lebar;
    private int luas;
    private int keliling;
    
    private void hitungLuas(){
        this.luas = this.panjang * this.lebar;
    }
    
    private void hitungKeliling(){
        this.keliling = 2 * (this.panjang + this.lebar);
    }
    
    public void output(){
        this.hitungLuas();
        this.hitungKeliling();
        System.out.println("Luas persegi panjang     : "+this.luas);
        System.out.println("Keliling persegi panjang : "+this.keliling);
    }
}
