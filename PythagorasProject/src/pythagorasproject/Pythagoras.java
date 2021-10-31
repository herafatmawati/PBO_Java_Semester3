/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;

import java.util.Scanner;
import java.util.*;
import java.lang.*;
/**
 *
 * @author user
 */
public class Pythagoras {
    int a,b;
    double c;
    int pilihan;
    
    
    void pilihan(){
        Scanner input = new Scanner(System.in);
        System.out.println("1. Cek triple pythagoras");
        System.out.println("2. Menentukan sisi miring segitiga");
        System.out.println("3. Menentukan sisi siku-siku segitiga");
        System.out.println("4. Exit");
        System.out.print("Masukkan nomor pilihan Anda : ");
        pilihan = input.nextInt();
        input.nextLine();
        
        switch (pilihan){
            case 1:
                System.out.println("Cek Triple Pythagoras");
                System.out.print("Masukkan nilai a : ");
                a = input.nextInt();
                input.nextLine();
                System.out.print("Masukkkan nilai b : ");
                b = input.nextInt();
                input.nextLine();
                System.out.print("Masukkan nilai c (hipotenusa) : ");
                c = input.nextInt();
                input.nextLine();
                
                if (c == Math.sqrt(Math.pow(b,2) + Math.pow(a, 2))) {
                    System.out.println("Ketiganya merupakan triple pythagoras");
                }else{
                    System.out.println("Ketiganya bukan triple pythagoras");
                }
                break;
            case 2:
                System.out.println("Menentukan Sisi Miring");
                System.out.print("Masukkan nilai a : ");
                a = input.nextInt();
                input.nextLine();
                System.out.print("Masukkkan nilai b : ");
                b = input.nextInt();
                input.nextLine();
                c = Math.sqrt(Math.pow(a, 2) + Math.pow(b,2));
                System.out.println("Sisi miringnya adalah : " + c);
                break;
            case 3:
                System.out.println("Menentukan Sisi Siku-Siku");
                System.out.print("Masukkan nilai a : ");
                a = input.nextInt();
                input.nextLine();
                System.out.print("Masukkkan nilai c (hipotenusa) : ");
                c = input.nextInt();
                input.nextLine();
                b = (int) Math.sqrt(Math.pow(c, 2) - Math.pow(a,2));
                System.out.println("Sisi sikunya adalah : " + b);
                break;
            case 4:
                System.out.println("Exit...");
                System.exit(0);
                break;
            default:
                System.out.println("Maaf, pilihan Anda tidak ada dalam menu");
        }
    }
    
    
}
