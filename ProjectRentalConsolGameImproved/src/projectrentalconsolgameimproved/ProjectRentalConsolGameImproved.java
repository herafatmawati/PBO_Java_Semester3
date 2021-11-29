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
import java.util.Scanner;
import java.time.*;
public class ProjectRentalConsolGameImproved {

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
                s.setTglPinjam();
                s.setBlnPinjam();
                s.setThnPinjam();
                s.setTglKembali();
                s.setBlnKembali();
                s.setThnKembali();
                
                d.tampilMember();              
                System.out.println("Tanggal Pinjam      : "+ s.getTglPinjam()+" - "+s.getBlnPinjam()+" - "+s.getThnPinjam());
                System.out.println("Tanggal Kembali     : "+ s.getTglKembali()+" - "+s.getBlnKembali()+" - "+s.getThnKembali());
                s.sethari();
                System.out.println("Lama Sewa           : "+s.gethari()+" hari");
                System.out.println(" ");
                s.totalsewa(25000, 0.01);
                s.hitungpoint(1);
                
                break;
            case "M002":
                DataMember d2 = new DataMember();
                d2.tambahMember(new Member("M002","Mr.Y","Gold"));
                 
                Gold g = new Gold();
                g.setTglPinjam();
                g.setBlnPinjam();
                g.setThnPinjam();
                g.setTglKembali();
                g.setBlnKembali();
                g.setThnKembali();
                
                d2.tampilMember();              
                System.out.println("Tanggal Pinjam      : "+ g.getTglPinjam()+" - "+g.getBlnPinjam()+" - "+g.getThnPinjam());
                System.out.println("Tanggal Kembali     : "+ g.getTglKembali()+" - "+g.getBlnKembali()+" - "+g.getThnKembali());
                g.sethari();
                System.out.println("Lama Sewa           : "+g.gethari()+" hari");
                System.out.println(" ");
                g.totalsewa(30000, 0.02);
                g.hitungpoint(5);
                g.bonuscash(5000);

                break;
            
            case "M003":
                DataMember d3 = new DataMember();
                d3.tambahMember(new Member("M003","Mr.Z","Platinum"));
                
                Platinum p = new Platinum();
                p.setTglPinjam();
                p.setBlnPinjam();
                p.setThnPinjam();
                p.setTglKembali();
                p.setBlnKembali();
                p.setThnKembali();
                
                d3.tampilMember();              
                System.out.println("Tanggal Pinjam      : "+ p.getTglPinjam()+" - "+p.getBlnPinjam()+" - "+p.getThnPinjam());
                System.out.println("Tanggal Kembali     : "+ p.getTglKembali()+" - "+p.getBlnKembali()+" - "+p.getThnKembali());
                p.sethari();
                System.out.println("Lama Sewa           : "+p.gethari()+" hari");
                System.out.println(" ");
                p.totalsewa(45000, 0.03);
                p.hitungpoint(10);
                p.bonuscash(10000);
                p.bonuspulsa(5000);

                  
                break;  
        }
    }
    
}
