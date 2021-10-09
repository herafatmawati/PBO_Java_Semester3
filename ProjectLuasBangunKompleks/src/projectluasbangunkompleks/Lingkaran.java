/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author user
 */
public class Lingkaran {
    //atribut
        int r;
        double phi=3.14;
    //method
    double hitungLuas(){
        Persegi p = new Persegi();
        double setengahlingkaran= 0.5*phi*r*r;
        return setengahlingkaran;
    }
}
