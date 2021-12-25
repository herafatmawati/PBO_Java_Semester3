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
public class ProfileKaryawan extends Karyawan {
    String kodeKary,namaKary,gol,statusHub;
    private int gapok;
    
    @Override
    public int getGaPok(){
        switch(gol){
            case "A":
                gapok = 5000000;
                break;
            case "B":
                gapok = 6000000;
                break;
            case "C":
                gapok = 7000000;
                break;
        }
        return gapok;
    }
    
    //constructor

    public ProfileKaryawan(String kode, String nama, String gol, int usia, int status, int jmlanak) {
        this.kodeKary = kode;
        this.namaKary = nama;
        this.gol = gol;
        if(status == 0){
            this.status = status;
            this.statusHub = "Belum Menikah";
        } else if(status == 1){
            this.status = status;
            this.statusHub = "Menikah";
        }
        this.usia = usia;
        this.jmlanak = jmlanak;
    }
    
    //method menampilkan header tabel nanti di cari data
    void tampilDataKary(){
        System.out.print(this.kodeKary + "\t\t");
        System.out.print(this.namaKary + "\t\t");
        System.out.print(this.gol + "\t");
        System.out.print(this.usia + "\t");
        System.out.print(this.statusHub + "\t\t");
        System.out.print(this.jmlanak + "\n");
    }
    
    //method tampilkan data utama
    void tampilDataUtama(){
        System.out.println("================================================\n"+
                           "DATA PROFILE KARYAWAN\n"+
                           "-----------------------------------------------------------------"
                           );  
        System.out.println("Kode Karyawan          : "+this.kodeKary);
        System.out.println("Nama Karyawan          : "+this.namaKary);
        System.out.println("Golongan               : "+this.gol);
        System.out.println("Usia                   : "+this.usia);
        System.out.println("Status Menikah         : "+this.statusHub);
        System.out.println("Jumlah Anak            : "+this.jmlanak);
    }
    
    //method tampil gaji
    public void tampilGaji(){
        System.out.println("----------------------------------------------------------------");
        System.out.println("Gaji Pokok             : Rp "+this.getGaPok());
        System.out.println("Tunjangan Istri/Suami  : Rp "+this.getTunjNikah(status));
        System.out.println("Tunjangan Pegawai      : Rp "+this.getTunjPgw());
        System.out.println("Tunjangan Anak         : Rp "+this.gettunjAnak(jmlanak));
        System.out.println("---------------------------------------------------------------- + ");
        System.out.println("Gaji Kotor             : Rp "+this.getGaTor());
        System.out.println("Potongan               : Rp "+this.getPotongan());
        System.out.println("---------------------------------------------------------------- - ");
        System.out.println("Gaji Bersih            : Rp "+this.getGajiBersih());
    }
    
    
}
