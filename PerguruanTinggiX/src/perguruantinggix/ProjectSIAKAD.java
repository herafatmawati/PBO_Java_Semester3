/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perguruantinggix;

/**
 *
 * @author user
 */

import java.time.*;

public class ProjectSIAKAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //contoh obyek data pegawai
        Pegawai p1 = new Pegawai("P01","Rosihan Ari",2,LocalDate.of(1979,9,1));
        p1.printPegawai();
        
        //contoh obyek data pegawai dosen
        Dosen p2 = new Dosen("P02","Dwi Amalia Fitriani",1,LocalDate.of(1979,9,17),"8888");
        p2.printPegawai();
        
        //contoh obyek data pegawai nondosen
        NonDosen p3 = new NonDosen("P03","Hera Fatmawati", 1, LocalDate.of(2001, 11, 10));
                 p3.printPegawai();
    }
    
}
