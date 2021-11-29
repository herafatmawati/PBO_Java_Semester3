/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangun2;

/**
 *
 * @author user
 */
public class ProjectBangun2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran();
        l1.setJariJari(10);
        l1.hitungLuas();
        System.out.println("Luas lingkaran berjari-jari "+l1.getJariJari() + " adalah "+l1.getLuas());
        
        Lingkaran l2 = new Lingkaran();
        l2.setJariJari(-10);
        l2.hitungLuas();
        System.out.println("Luas lingkaran berjari-jari "+ l2.getJariJari()+ " adalah "+ l2.getLuas());
    }
    
}
