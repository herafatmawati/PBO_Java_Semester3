/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrentalconsolgameimproved;

/**
 *
 * @author user
 */
public class Gold extends Silver{
    protected int cashback;
    
    public void bonuscash(int cashback){
        int totalcashback = cashback * this.totalhari;
        System.out.println("Jumlah Cashback     : Rp "+totalcashback);
    }
}
