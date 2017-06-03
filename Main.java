/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author siti
 */
public class Main {
    public static void main(String[] args){
        Tanaman tam = new Tanaman();
        System.out.println("Ini Kelas Tanaman");
         System.out.println("");
       
        BambuKuning tbb =  new BambuKuning();
        tbb.tampilbambu();
          System.out.println("");
        tbb.tampilbambukuning();
            tbb.Nama();
            tbb.Warna();
         System.out.println("");
        
            BambuHijau me = new BambuHijau();
        me.tampilbambuhijau();
            me.Nama();
            me.Warna();
        System.out.println("");
        
        BambuJepang mb = new BambuJepang();
        mb.tampilbambujepang();
            mb.Nama();
            mb.Warna();
        System.out.println("");
        
        Anggrek sm = new Anggrek();
        sm.tampilAnggrek();
        System.out.println("");
        
        Melati ap = new Melati();
        ap.tampilMelati();
        System.out.println("");
        
    }
    
}
