/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author user
 */
public class Segitiga {
    void hitungLuas(int a, int t){
        int luas=a*t/2;
        System.out.println("Luas segitiga dengan alas " +a+ " dan tinggi " +t+ " adalah : " +luas+ " satuan luas");
    }
    void hitungLuas(int a, double t){
        double luas=a*t/2;
        System.out.println("Luas segitiga dengan alas " +a+ " dan tinggi " +t+ " adalah : " +luas+ " satuan luas");
    }
    void hitungLuas(double a, int t){
        double luas=a*t/2;
        System.out.println("Luas segitiga dengan alas " +a+ " dan tinggi " +t+ " adalah : " +luas+ " satuan luas");
    }
    void hitungLuas(double a, double t){
        double luas=a*t/2;
        System.out.println("Luas segitiga dengan alas " +a+ " dan tinggi " +t+ " adalah : " +luas+ " satuan luas");
    }
    
    void hitungKeliling(int a, int t){
        double c=Math.round(Math.sqrt(Math.pow(a,2)+Math.pow(t,2)));
        double keliling= a+t+c;
        System.out.println("Keliling segitiga dengan alas " +a+ " dan tinggi " +t+ " adalah : " +keliling);
        System.out.println("");
    }
    void hitungKeliling(double a, int t){
        double c=Math.round(Math.sqrt(Math.pow(a,2)+Math.pow(t,2)));
        double keliling= a+t+c;
        System.out.println("Keliling segitiga dengan alas " +a+ " dan tinggi " +t+ " adalah : " +keliling);
        System.out.println("");
    }
    void hitungKeliling(int a, double t){
        double c=Math.round(Math.sqrt(Math.pow(a,2)+Math.pow(t,2)));
        double keliling= a+t+c;
        System.out.println("Keliling segitiga dengan alas " +a+ " dan tinggi " +t+ " adalah : " +keliling);
        System.out.println("");
    }
    void hitungKeliling(double a, double t){
        double c=Math.round(Math.sqrt(Math.pow(a,2)+Math.pow(t,2)));
        double keliling= a+t+c;
        System.out.println("Keliling segitiga dengan alas " +a+ " dan tinggi " +t+ " adalah : " +keliling);
        System.out.println("");
    }
}
