/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboul.pkg10115229.latihan49.biayaemaskawin;

/**
 *
 * @author Lukman
 * NIM      : 10115229
 * NAMA     : MUHAMMAD LUKMAN HAKIM
 * KELAS    : PBO ULANG 
 */
public class PBOUL10115229Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Emas emas = new Emas();
        
        emas.setBerat(15.7);
        emas.setHarga(570000);
        
        System.out.println("Hendi membeli MAS KAWIN\n");
        System.out.println("Berat : "+emas.getBerat());
        System.out.println("Harga : "+emas.getHarga());
        System.out.println("Total Bayar : "+emas.totalHarga());
    }
    
}
