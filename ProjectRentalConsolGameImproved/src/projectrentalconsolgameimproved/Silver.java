/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrentalconsolgameimproved;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Silver {
    private int tglpinjam, blnpinjam, thnpinjam, tglkembali, blnkembali, thnkembali;
    protected int totalhari;
    private int biayasewa, poin;
    private double diskon;
    private Scanner input1 = new Scanner(System.in);
    
    public void setTglPinjam(){
        System.out.print("Masukkan Tanggal Pinjam (1-31)  : ");
        tglpinjam = input1.nextInt();
        if(this.tglpinjam >0){
           this.tglpinjam = tglpinjam;
        } else{
            this.tglpinjam =1;
        }
    }
    public void setBlnPinjam(){
        System.out.print("Masukkan Bulan Pinjam (1-12)    : ");
        blnpinjam = input1.nextInt();
        if(this.blnpinjam >0){
           this.blnpinjam = blnpinjam;
        } else{
            this.blnpinjam =1;
        }
    }
    public void setThnPinjam(){
        System.out.print("Masukkan Tahun Pinjam           : ");
        thnpinjam = input1.nextInt();
        if(this.thnpinjam >0){
           this.thnpinjam = thnpinjam;
        } else{
            this.thnpinjam =1;
        }
    }
    public void setTglKembali(){
        System.out.print("Masukkan Tanggal Kembali (1-31) : ");
        tglkembali = input1.nextInt();
        if(this.tglkembali >0){
           this.tglkembali = tglkembali;
        } else{
            this.tglkembali =1;
        }
    }
    public void setBlnKembali(){
        System.out.print("Masukkan Bulan Kembali (1-12)   : ");
        blnkembali = input1.nextInt();
        if(this.blnkembali >0){
           this.blnkembali = blnkembali;
        } else{
            this.blnkembali =1;
        }
    }
    public void setThnKembali(){
        System.out.print("Masukkan Tahun Kembali          : ");
        thnkembali = input1.nextInt();
        if(this.thnkembali >0){
           this.thnkembali = thnkembali;
        } else{
            this.thnkembali =1;
        }
        System.out.println("");
        System.out.println("------------------------------------------------");
        System.out.println("");
    }
    
    public int getTglPinjam(){
        return this.tglpinjam;
    }
    public int getBlnPinjam(){
        return this.blnpinjam;
    }
    public int getThnPinjam(){
        return this.thnpinjam;
    }
    public int getTglKembali(){
        return this.tglkembali;
    }
    public int getBlnKembali(){
        return this.blnkembali;
    }
    public int getThnKembali(){
        return this.thnkembali;
    }
    
    //public int hitungsewa(){
        //LocalDate from = LocalDate.of(this.thnpinjam, this.blnpinjam, this.tglpinjam);
        //LocalDate to = LocalDate.of(this.thnkembali, this.blnkembali, this.tglkembali);
        //Period day = Period.between(from,to);
        //this.totalhari= day.getDays();
        //System.out.println("Lama Sewa           : "+totalhari+" hari");
       // System.out.println(" ");
       // return totalhari;
    //}
    
    public void sethari(){
        LocalDate from = LocalDate.of(this.thnpinjam, this.blnpinjam, this.tglpinjam);
        LocalDate to = LocalDate.of(this.thnkembali, this.blnkembali, this.tglkembali);
        Period day = Period.between(from,to);
        this.totalhari= day.getDays();
    }
    public int gethari(){
        return this.totalhari;
    }
    public void totalsewa(int biayasewa,double diskon){    
        double totalsewa = (biayasewa *totalhari)-(biayasewa*totalhari*diskon);
        System.out.println("Total Sewa          : Rp "+totalsewa);
    }
    
    public void hitungpoint(int poin){
        int jmlpoin = poin * totalhari;
        System.out.println("Jumlah Poin         : "+jmlpoin);
    }
    
    
}
