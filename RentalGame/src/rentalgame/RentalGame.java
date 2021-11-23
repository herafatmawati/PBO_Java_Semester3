/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalgame;

/**
 *
 * @author user
 */

import java.util.Scanner;
import java.time.*;

public class RentalGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ID Member              : ");
        String id = input.nextLine();
        
        switch (id){
            case "M001":
                DataMember d = new DataMember();
                d.tambahMember(new Member("M001","Mr.X","Silver"));
                
                Silver s = new Silver();
                s.input();
                
                d.tampilMember();
                
                s.hitungsewa();
                s.totalsewa(25000,0.01);
                s.hitungpoint(1);
                
                break;
            case "M002":
                DataMember d2 = new DataMember();
                d2.tambahMember(new Member("M002","Mr.Y","Gold"));
                                
                Gold g = new Gold();
                g.input();
                
                d2.tampilMember();
                
                g.hitungsewa();
                g.totalsewa(30000,0.02);
                g.hitungpoint(5);
                g.bonuscash(5000);

                break;
            
            case "M003":
                DataMember d3 = new DataMember();
                d3.tambahMember(new Member("M003","Mr.Z","Platinum"));
                
                Platinum p = new Platinum();
                p.input();               
                
                d3.tampilMember();
                
                p.hitungsewa();
                p.totalsewa(45000, 0.03);
                p.hitungpoint(10);
                p.bonuscash(10000);
                p.bonuspulsa(5000);
                  
                break;
                
        }
    }
 
}
