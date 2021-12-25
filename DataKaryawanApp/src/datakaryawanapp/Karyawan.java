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
public abstract class Karyawan {
    String kode,nama;
    int status, usia, jmlanak;
    
    //method abstract untuk hitung gaji pokok
    public abstract int getGaPok();
    
    //method tunjangan jika menikah
    public int getTunjNikah(int statusnikah){
        int tunjStatusMenikah;
        this.status = statusnikah;
        if (status == 1){
            tunjStatusMenikah = this.getGaPok()* 10/100;
        } else{
            tunjStatusMenikah = 0;
        }
        return tunjStatusMenikah;
    }
    
    //method hitung tunjangan pegawai
    public int getTunjPgw(){
        int tunjPegawai;
        if (usia > 30){
            tunjPegawai = this.getGaPok() * 15 /100;
        } else {
            tunjPegawai = 0;
        }
        return tunjPegawai;
    }
    
    //method hitung tunjangan anak jika status menikah dan punya anak
    public int gettunjAnak(int jmlanak){
        this.jmlanak = jmlanak;
        int tunjanganAnak = this.getGaPok()* 5/100 * this.jmlanak;
        return tunjanganAnak;
    }
    
    //method hitung total tunjangan untuk hitung gaji kotor
    public int getTotalTunj(){
        int totalTunjangan = this.getTunjNikah(status) + this.getTunjPgw() +this.gettunjAnak(jmlanak);
        return totalTunjangan;
    }
    
    //method hitung gaji kotor (gaji bersih + total tunjangan)
    public int getGaTor(){
        int gajikotor = this.getGaPok() + this.getTotalTunj();
        return gajikotor;
    }
    
    //method hitung potongan
    public int getPotongan(){
        int potongan = 10/4/100 * this.getGaTor();
        return potongan;
    }
    
    //method hitung gaji bersih
    public int getGajiBersih(){
        int gajibersih = this.getGaTor() - this.getPotongan();
        return gajibersih;
    }
}
