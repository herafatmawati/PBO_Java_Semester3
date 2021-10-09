/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author user
 */
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PROJECT 1
        System.out.println("PROJECT 1");
        //menghitung luas bangun gabungan persegi + lingkaran
        //menhitung luas persegi
        Persegi A = new Persegi();
        A.s=42;
        System.out.println("luas persegi: "+A.hitungLuas()+" cm persegi");
        
        //menghitung luas lingkaran
        Lingkaran B = new Lingkaran();
        B.r=21;
        
        //menghitung total luas 4 bangun stengah lingkaran
        double totallingkaran=4 * B.hitungLuas();
        System.out.println("luas lingkaran : "+totallingkaran+" cm persegi");
        
        //menghitung total luas bangun
        double totalbangun=A.hitungLuas()+totallingkaran;
        System.out.println("Luas gabungan bangun 1 persegi dan 4 setengah lingkaran adalah "+totalbangun +" cm persegi");
        System.out.println(" ");
        
        //PROJECT 2
        System.out.println("PROJECT 2");
        //menghitung luas setengah lingkaran besar
        Lingkaran besar = new Lingkaran();
        besar.r= 14;
        System.out.println("Luas lingkaran besar: "+besar.hitungLuas()+ " cm persegi");
        
        //menghitung luas setengah lingkaran kecil
        Lingkaran kecil = new Lingkaran();
        kecil.r=7;
        
        //menghitung total setengah lingkaran kecil
        double jumlahlingk_kecil= 2*kecil.hitungLuas();
        System.out.println("Luas 2 lingkaran kecil: "+jumlahlingk_kecil+" cm persegi");
        
        //menghitung luas bangun abu- abu
        double luas_abu= besar.hitungLuas() - jumlahlingk_kecil;
        System.out.println("Luas area berwarna abu: "+luas_abu+" cm persegi");
    }
    
}
