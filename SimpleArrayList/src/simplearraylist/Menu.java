/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Menu {
    ArrayList<String> data = new ArrayList<>();
   
    
    void menu(){
       Scanner inputdata = new Scanner(System.in);
       
       System.out.println("Menu data ArrayList: ");
       System.out.println("1. Tambah Data");
       System.out.println("2. Cari Data");
       System.out.println("3. Hapus Data");
       System.out.println("4. Tampil Data");
       System.out.println("5. Keluar");
       System.out.print("Pilih nomor berapa: ");
       int pilih = inputdata.nextInt();
       
       switch(pilih){
            case 1:
                this.tambahData();
                
                break;
            
            case 2: 
                this.cariData();
                break;
            
            case 3:
                this.hapusData();
                
                break;
            
            case 4:
               this.tampilData();
                
                break;
            
            case 5:
                System.out.println("Exit . . . ");
                System.exit(0);
                break;
            
        }
    }
   
   Scanner input = new Scanner(System.in);
   void tambahData(){
        System.out.print("Masukkan data string: ");
        data.add(input.nextLine());
        System.out.println("Daftar string dalam array list : "+this.data);
        input.nextLine();
   }
   
   void cariData(){
        System.out.println("String yang mau dicari: ");
        String cari = input.nextLine();
        int val = data.indexOf(cari);       
        if (val != -1){
            System.out.println("String "+cari+ " ada di index ke-"+ val + "di dalam data");               
            input.nextLine();
        } else {
            System.out.println("String "+ cari +" tidak ada dalam data");
            input.nextLine();
        }
   }
   
   void hapusData(){
        System.out.println("String yang mau dihapus: ");
        String hapus= input.nextLine();
        int val = data.indexOf(hapus);
        if (val != -1){
            data.remove(val);
            System.out.println("String "+ hapus +" sudah dihapus di dalam data");
        } else {
            System.out.println("String "+ hapus + " tidak ada dalam data");
        }
    }
   
   void tampilData(){
       for(int i=0; i<data.size(); i++){
            System.out.println("Daftar string dalam array list: "+data.get(i));
       }
       
      
    }
   
}
