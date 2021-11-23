/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalgame;

/**
 *
 * @author user
 */
import java.time.*;
import java.util.Scanner;

public class Silver {
    //atribut
    protected int tglpinjam, blnpinjam, thnpinjam, tglkembali, blnkembali, thnkembali, totalhari;    
    protected int biayasewa, poin;
    protected double diskon;
    
    //method
    protected void input(){
        Scanner input1 = new Scanner(System.in);
        System.out.print("Masukkan Tanggal Pinjam (1-31)  : ");
        tglpinjam = input1.nextInt();
        System.out.print("Masukkan Bulan Pinjam (1-12)    : ");
        blnpinjam = input1.nextInt();
        System.out.print("Masukkan Tahun Pinjam           : ");
        thnpinjam = input1.nextInt();
        System.out.print("Masukkan Tanggal Kembali (1-31) : ");
        tglkembali = input1.nextInt();
        System.out.print("Masukkan Bulan Kembali (1-12)   : ");
        blnkembali = input1.nextInt();
        System.out.print("Masukkan Tahun Kembali          : ");
        thnkembali = input1.nextInt();
        System.out.println("");
        System.out.println("------------------------------------------------");
        System.out.println("");
    }
    
    protected int hitungsewa(){
        LocalDate from = LocalDate.of(thnpinjam, blnpinjam, tglpinjam);
        LocalDate to = LocalDate.of(thnkembali, blnkembali, tglkembali);
        Period day = Period.between(from,to);
        totalhari= day.getDays();
        System.out.println("Tanggal Pinjam      : "+tglpinjam+"-"+blnpinjam+"-"+thnpinjam);
        System.out.println("Tanggal Kembali     : "+tglkembali+"-"+blnkembali+"-"+thnkembali);
        System.out.println("Lama Sewa           : "+totalhari+" hari");
        System.out.println(" ");
        return totalhari;
    }
    
    protected void totalsewa(int biayasewa,double diskon){    
        double totalsewa = (biayasewa *totalhari)-(biayasewa*totalhari*diskon);
        System.out.println("Total Sewa          : Rp "+totalsewa);
    }
    
    protected void hitungpoint(int poin){
        int jmlpoin = poin * totalhari;
        System.out.println("Jumlah Poin         : "+jmlpoin);
    }
}
