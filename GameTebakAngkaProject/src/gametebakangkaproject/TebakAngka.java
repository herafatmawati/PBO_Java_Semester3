/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangkaproject;

import java.util.Scanner;
/**
 *
 * @author user
 */
public class TebakAngka {
    int tebak;
      
    void tebakangka(){
        int acak = (int) (Math.random() *100); 
        Scanner input = new Scanner(System.in);
        System.out.println("Hai... nama saya Mrs.Javana, saya telah memilih sebuah bilangan bulat acak antara 0 s/d 100.");
        System.out.println("Silakan Anda tebak ya !!!");
        System.out.println(" ");
        int i = 0;
        do{
            System.out.print("Masukkan Tebakan Anda : ");
            tebak = input.nextInt();
            input.nextLine();
            if (tebak == acak){
                System.out.println("Uwuuu... Bilangan tebakan Anda BENAR :)");
                break;
            }else if (tebak < acak){
                System.out.println("Hihi... Maaf, bilangan tebakan Anda terlalu kecil");
            }else{
                System.out.println("Hihi... Maaf, bilangan tebakan Anda terlalu besar");
            }
        i++;
        } while (i >=0);
        
    }
}
