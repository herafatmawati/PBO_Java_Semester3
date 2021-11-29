/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrentalconsolgameimproved;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class DataMember {
    ArrayList<Member> dataMember = new ArrayList<Member>();
    
    protected void tambahMember(Member data){
        this.dataMember.add(data);
    }
    
    protected void tampilMember(){
        for(Member item: this.dataMember){
            item.print();
        }
    }
}
