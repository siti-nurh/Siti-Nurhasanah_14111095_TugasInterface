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
public class BambuKuning implements Bambu {
    
    public void tampilbambu() {
    System.out.println("Ini Kelas Mobil");
        Tanaman tam = new Tanaman();
        tam.setNama("Bambu");
        System.out.println("Tanaman ini bernama Ini = " + tam.getNama());
        tam.setWarna("Hijau");
        System.out.println("Tanaman ini berwarna = " + tam.getWarna());
    }
    
    public void tampilbambukuning() {
        System.out.println("Kelas BambuKuning implements Bambu");
    }
        @Override
        public void Nama() {
        System.out.println(" Tanaman ini bernama : BambuKuning ");
    }
      @Override
        public void Warna() {
        System.out.println("Tanaman ini berwarna : Kuning");  
        }
        
   
    }
