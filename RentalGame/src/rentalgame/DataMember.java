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

import java.util.ArrayList;

public class DataMember {
    ArrayList<Member> dataMember = new ArrayList<Member>();
    
    void tambahMember(Member data){
        this.dataMember.add(data);
    }
    
    void tampilMember(){
        for(Member item: this.dataMember){
            item.print();
        }
    }
}
