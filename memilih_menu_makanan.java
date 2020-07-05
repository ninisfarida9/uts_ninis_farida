/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_sederhana;

import java.util.Scanner;

/**
 *
 * @author LENOVO 330
 */
public class memilih_menu_makanan {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("fallthrough")
    public static void main(String[] args) {
     
      String pesan;  
      String makanan = "bakso";
         Scanner scan =new Scanner(System.in);
         
         System.out.println("Masukkan pesanan anda !");
         pesan = scan.nextLine();
         
                 switch(makanan){
            case "bakso" :
                System.out.println("bakso");
                String ucapan = "bakso pedas atau tidak pedas";
                int jumlah = 0;
                while (jumlah<5){
                System.out.println("makanan");
                jumlah++;
        }
            case"sate"    :
                System.out.println("sate");
                 
                String ucapan1 = "sate ayam atau sate kambing";
                int jumlah1 = 0;
       
                while (jumlah1<5){
                System.out.println("sate");
                jumlah1++;
        }       
                
            case"nasi"   :
                System.out.println("nasi");
                
                String ucapan2 = "nasi pecel atau nasi campur";
                int jumlah2 = 0;
                while (jumlah2<5){
                System.out.println("nasi");
                jumlah2++;
        }
            default :
                System.out.println("nama menu makanan tidak terdaftar");
                break;
                
                 }
}
    }
    
    


    
    

