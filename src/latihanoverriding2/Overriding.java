/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanoverriding2;

/**
 *
 * @author MOKLET-2
 */
public class Overriding extends LatihanOverriding2{
    String nama;
    
    public void iden(String nama){
        this.nama = nama;
        System.out.println(nama+"Ainu");
    }
}
