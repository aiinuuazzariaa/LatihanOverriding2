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
public class Overriding2 extends LatihanOverriding2{
    String kelas;
    
    public void iden(String kelas){
        this.kelas = kelas;
        System.out.println(kelas+"X RPL 2");
    }
}
