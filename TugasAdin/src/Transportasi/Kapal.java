/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transportasi;

/**
 *
 * @author ACER
 */
public class Kapal extends Kendaraan{
    
    public Kapal(){
        System.out.println("Ini class Kapal");
    }
    
    @Override
    public void suara(){
        System.out.println("brrr");
    }
    
    @Override
    public void service(){
        System.out.println("Kapal diservice");
    }
    
    @Override
    public void berjalan(){
        System.out.println("Kapal berlayar");
    }
}