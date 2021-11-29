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
import java.util.ArrayList;

public class Member {
    private String idMember, namaMember,jenisMember;
    
    //constructor
    Member(String idMember, String namaMember, String jenisMember){
        this.idMember = idMember;
        this.namaMember = namaMember;
        this.jenisMember = jenisMember;
    }
    
    void print(){
        System.out.println("ID Member           : "+this.idMember);
        System.out.println("Nama Member         : "+this.namaMember);
        System.out.println("Jenis Member        : "+this.jenisMember);
        System.out.println(" ");
         
    }
        
    
    
    
}
