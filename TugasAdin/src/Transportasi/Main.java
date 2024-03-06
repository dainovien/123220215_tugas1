/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transportasi;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args){
        Transportasi.Motor Mio = new Transportasi.Motor();
        Mio.suara();
        
        Mio.roda = 2;
        Mio.jenis = "Classic";
        System.out.println("Jenis : " + Mio.jenis);
        Mio.penumpang();
        Mio.getOli();
        Mio.setUmur(5);
        System.out.println("Umur : " + Mio.getUmur());
        Mio.service();
        Mio.mengisi();
        
        System.out.println("");
        System.out.println("");
        
        Transportasi.Kapal Awu = new Transportasi.Kapal();
        Awu.suara();
        Awu.roda = 0;
        System.out.println("Roda : " + Awu.roda);
        
        Mio.berjalan();
        Awu.berjalan();
        }
}
