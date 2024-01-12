/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gem;

/**
 *
 * @author user
 */
public class Kakashi {
    String jutsu;
    int cakra;
    int kekuatan;
    
    void chidori(){
        cakra--;
        if (cakra >= 50) {
            System.out.println("Rakuton Chidori No Jutsu");
        }
        else{
            System.out.println("Kakashi kehabisan Cakra");
        }
    }
    void Sharinggan(){
        cakra--;
        if (cakra >= 100) {
            kekuatan++;
            System.out.println("KAMUI");
        }
        else if (kekuatan >= 50) {
            System.out.println("KAMUI");
        }
        else{
            System.out.println("Kakashi tidak mampu mengeluarkan Sharinggan");
        }
    }
    void maskeran(){
        cakra++;
        kekuatan++;
        System.out.println("Kakashi menggunakan maskernya untuk menambah kekuatan dan cakra");
    }
    void gelud(){
        
    }
}
