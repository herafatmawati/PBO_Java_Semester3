/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datakaryawanapp;

/**
 *
 * @author hera fatmawati
 */

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Scanner;
import java.text.ParseException;


public class OlahDataMenu {
    ArrayList<ProfileKaryawan> listkaryawan = new ArrayList<ProfileKaryawan>();
    Scanner inputan = new Scanner(System.in);
    
    int pilihan;
    String kode, nama;
    
    //Pilihan Menu Utama
    void pilihanMenuUtama() throws ParseException
    {
        boolean pilihanMenuUtama = true;
        while(pilihanMenuUtama){
        System.out.println("Menu Utama \n" +
                           "1. Tambah Data\n"+
                           "2. Hapus Data\n"+
                           "3. Cari Data\n"+
                           "4. Lihat Data\n"+
                           "5. Exit");
        System.out.println(" ");
        System.out.print("Masukkan menu pilihan : ");
        this.pilihan = inputan.nextInt();
        inputan.nextLine();
        
        switch(pilihan){
            case 1: //tambah data
                char case1 ='y';
                while(case1 == 'y'){
                    tambahDataKary();
                }
                break;
            case 2: //hapus data berdasar kode
                hapusDataKary();
                break;
            case 3: //cari data berdasar kode
                cariDataKary();
                break;
            case 4: //lihat list data
                lihatDataKary();               
                break;
            case 5: //exit
                System.exit(0);
            default:
                System.out.println("Pilihan Anda tidak ada di menu utama");
            }
        }
    }
    
    public void pilihanSubMenu(String submenu){ 
        System.out.println(" ");
        System.out.println("Pilih SubMenu: \n"+
                "1.Kembali ke menu utama \n"+
                "2."+submenu+ " Data Kembali \n"
                );
        System.out.println(" ");
        System.out.print("Menu Pilihan: ");
        pilihan = inputan.nextInt();
    }
    
    //method pilihan tambah data kary
    public void tambahDataKary() throws ParseException{
        String alamat, gol;
        int usia, status, jmlanak;
        DateFormat tgl,bln,thn;
        Date date;
        String input;

        tgl = new SimpleDateFormat("dd");
        bln = new SimpleDateFormat("MM");
        thn = new SimpleDateFormat("yyyy");
        date = new Date();
        
        System.out.println("Tambah Data Karyawan\n");
        System.out.print("Masukkan Kode Karyawan                                         : ");
        this.kode = inputan.nextLine();
        System.out.print("Masukkan Nama Karyawan                                         : ");
        this.nama = inputan.nextLine();
        System.out.print("Masukkan Alamat                                                : ");
        alamat = inputan.nextLine();
        System.out.print("Masukkan Tanggal Lahir (YYYY-MM-DD)                            : ");
        input = inputan.nextLine();
        System.out.print("Masukkan Golongan ( A | B | C )                                : ");
        gol = inputan.nextLine();
        System.out.print("Masukkan Status Menikah (0 = belum menikah | 1 = sudah menikah : ");
        status = inputan.nextInt();
        jmlanak = 0;
        if (status==1){
            System.out.print("Masukkan Jumlah Anak                                           : ");
            jmlanak = inputan.nextInt();
        } else if (status == 0 ){
            jmlanak = 0;
        }
        
        //Konversi tanggal
       int tgllhr = Integer.parseInt(input.substring(8,10));
       int blnlhr = Integer.parseInt(input.substring(5,7));
       int thnlhr = Integer.parseInt(input.substring(0,4));
       
       int tglHari = Integer.parseInt(tgl.format(date));
       int blnHari = Integer.parseInt(bln.format(date));
       int thnHari = Integer.parseInt(thn.format(date));
       
       usia = thnHari - thnlhr;
       if(blnHari - blnlhr < 0){
           usia -= 1;
       }
        
        //masukkan inputan ke array
        this.listkaryawan.add(new ProfileKaryawan(kode,nama,gol,usia,status,jmlanak));
        
        //munculkan sub menu
        this.pilihanSubMenu("Tambah");
        switch(pilihan){
            case 1:
                this.pilihanMenuUtama();
                break;
            case 2:
                tambahDataKary();
                break;
            default:
                this.pilihanMenuUtama();
                break;
        }
    }
    
    //method pilihan hapus data dengan kode
    public void hapusDataKary() throws ParseException{
        boolean nemu = false;
        int index = -1;
        System.out.println("Hapus Data Karyawan\n");
        System.out.print("Kode Karyawan yang mau dihapus   : ");
        this.kode = inputan.nextLine();
        System.out.println("please wait...");
        
        for(int i=0; i<this.listkaryawan.size(); i++){
            if(this.listkaryawan.get(i).kodeKary.equals(kode)){
                index = i;
                nemu = true;
            }
        }
        
        if (nemu == true){
            this.listkaryawan.removeIf(item -> item.kodeKary.equals(kode));
            System.out.println("Data karyawan kode "+ kode+ "berhasil dihapus");
        } else {
            System.out.println("Gagal dihapus. Tidak ditemukan data karyawan kode "+ kode);
        }     
        
        this.pilihanSubMenu("Hapus");
        switch(pilihan){
            case 1:
                this.pilihanMenuUtama();
                break;
            case 2:
                hapusDataKary();
                break;
            default:
                this.pilihanMenuUtama();
                break;
        }
    }
    
    //method pilihan cari data dengan kode
    public void cariDataKary() throws ParseException{
        boolean nemu = false;
        int index = -1;
        
        System.out.println("Cari Data Karyawan\n");
        System.out.print("Masukkan Kode Karyawan      : ");
        this.kode = inputan.nextLine();
        System.out.println("please wait...\n");
        
        for(int i=0; i<this.listkaryawan.size(); i++){
            if(this.listkaryawan.get(i).kodeKary.equals(kode)){
                index = i;
                nemu = true;
            }
        }
        
        if (nemu == true){
            this.listkaryawan.get(index).tampilDataUtama();
            this.listkaryawan.get(index).tampilGaji();
        } else {
            System.out.println("Data Karyawan tidak ditemukan");
        }     
        
        System.out.println(" ");
        System.out.println("Pilih SubMenu: \n"+
                "1.Kembali ke menu utama \n"
                );
        System.out.print("Menu Pilihan: ");
        pilihan = inputan.nextInt();
        switch(pilihan){
            case 1:
                this.pilihanMenuUtama();
                break;
            default:
                this.pilihanMenuUtama();
                break;
        }
        
        
    }
    
    //method lihat data kary
    public void lihatDataKary() throws ParseException{
        int index = 0;
        System.out.println("=====================================");
                
        if(this.listkaryawan.isEmpty()){
            System.out.println("Belum ada data karyawan");
        } else{
            System.out.println("DATA KARYAWAN ");
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.print("KODE KARY \t");
            System.out.print("NAMA KARY \t");
            System.out.print("GOL \t");
            System.out.print("USIA \t");
            System.out.print("STATUS \t\t");
            System.out.print("JUMLAH ANAK\n");
            System.out.println("------------------------------------------------------------------------------------");
            for(ProfileKaryawan item: this.listkaryawan){
                item.tampilDataKary();
                index++;
            }
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("Jumlah Data: "+index);
        }
       
        System.out.println(" ");
        System.out.println("Pilih SubMenu: \n"+
                "1.Kembali ke menu utama \n"
                );
        System.out.println(" ");
        System.out.print("Menu Pilihan: ");
        pilihan = inputan.nextInt();
        switch(pilihan){
            case 1:
                this.pilihanMenuUtama();
                break;
            default:
                this.pilihanMenuUtama();
                break;
        }
    }
}
