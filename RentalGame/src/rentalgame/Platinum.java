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
public class Platinum extends Gold{
    private int pulsa;
    
    protected void bonuspulsa(int pulsa){
        int totalpulsa = pulsa*totalhari;
        System.out.println("Bonus Pulsa         : Rp "+totalpulsa);
    }
}
