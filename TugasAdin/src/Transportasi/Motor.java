/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transportasi;

/**
 *
 * @author ACER
 */
public class Motor extends Kendaraan implements Bensin{
    private int umur;
    
    public Motor(){
        System.out.println("Ini class Motor");
    }
    
    private void oli(){
        System.out.println("Motor ganti Oli");
    }
    
    @Override
    public void suara(){
        System.out.println("ngeng");
    }
    
    public int getUmur() {
        return umur;
    }
    
    public void getOli() {
        oli();
    }

    public void setUmur(int umur){
        this.umur = umur;
    }
    
    @Override
    public void service(){
        System.out.println("Motor diservice");
    }
    
    @Override
    public void berjalan(){
        System.out.println("Motor berjalan");
    }
    
    @Override
    public void mengisi(){
        System.out.println("Motor mengisi bensin");
    }
}
