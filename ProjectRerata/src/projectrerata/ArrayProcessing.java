/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrerata;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ArrayProcessing {
    
    //array of integer -> data
    int[] dataBil = new int[100];
    
    //jumlah data
    int n;
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyaknya data (n): ");
        this.n = input.nextInt();
        for(int i=0; i<n; i++){
            System.out.print("Masukkan bil ke-"+(i+1)+": ");
            this.dataBil[i] = input.nextInt();
        }
    }
    
    double hitungRerata(int[] data){
        double sum = 0;
        for(int i=0; i<this.n; i++ ){
            sum += data[i];
        }
        double rerata = sum/this.n;
        return rerata;
    }  
    
    int cariMax( int[] data){
        int max = data[0];
        for(int i=1; i<this.n; i++){
            if(max < data[i]){
                max=data[i];
            }
        }
        return max;
    }
    
    int cariMin(int[] data){
        int min = data[0]; 
        for(int i=1; i<this.n; i++){
            if(min>data[i]){
                min=data[i];
            }
        }
        return min;
    }
    
    int[] urutkan(int[] data){
        for (int i = 0; i<this.n; i++){
            for(int j=0; j<this.n-1;j++ ){
                if(data [j] > data[j+1] ){
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1]=temp;
                }
            }
        }
        return data;
            
    }
    
    
    void output(){
        System.out.println("Rerata: "+ this.hitungRerata(this.dataBil));
        System.out.println("Nilai Maksimum: "+this.cariMax(dataBil));
        System.out.println("Nilai Minimun: "+this.cariMin(dataBil));
        System.out.println("Urutan ASC: ");
        for(int i=0; i<this.n; i++ ){
            System.out.print(this.urutkan(dataBil)[i]);
        }
    }
    
}
