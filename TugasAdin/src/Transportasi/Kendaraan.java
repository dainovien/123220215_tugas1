/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Transportasi;


public abstract class Kendaraan {
    public int roda;
    public String jenis;
    
    public void penumpang(){
        System.out.println("Kendaraan ini memiliki penumpang");
    }
    
    public void suara(){
        
    }
    
    public abstract void service();
    public abstract void berjalan();
}
