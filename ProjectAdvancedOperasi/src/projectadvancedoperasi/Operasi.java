/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author user
 */
public class Operasi {
    int jumlahkan(int a, int b){
        int jumlah=a+b;
        System.out.println("Hasil " +a+ " + " +b+ " : " +jumlah);
        return (jumlah);
    }
    int jumlahkan(int a, int b, int c){
        int jumlah=a+b+c;
        System.out.println("Hasil " +a+ " + " +b+ " + " +c+ " : " +jumlah);
        return (jumlah);
    }
    double jumlahkan(double a, double b){
        double jumlah=a+b;
        System.out.println("Hasil " +a+ " + " +b+ " : " +jumlah);
        return (jumlah);
    }
    double jumlahkan(double a, double b, double c){
        double jumlah=a+b+c;
        System.out.println("Hasil  " +a+ " + " +b+ " + " +c+ " : " +jumlah);
        return (jumlah);
    } 
    
    //Method Perkalian Project 1
    int kalikan(int a, int b){
        int kali=a*b;
        System.out.println("Hasil " +a+ " x " +b+ " : " +kali);
        return (kali);
    }
    int kalikan(int a, int b, int c){
        int kali=a*b*c;
        System.out.println("Hasil " +a+ " x " +b+ " x " +c+ " : " +kali);
        return (kali);
    }  
    double kalikan(double a, double b){
        double kali=a*b;
        System.out.println("Hasil " +a+ " x " +b+ " : " +kali);
        return (kali);
    }
    double kalikan(double a, double b, double c){
        double kali=a*b*c;
        System.out.println("Hasil " +a+ " x " +b+ " x " +c+ " : " +kali);
        return (kali);
    }
}
