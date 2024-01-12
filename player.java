/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gem;

/**
 *
 * @author user
 */
public class player {
    String name;
    int speed, healthPoin, damage, armor;
    
    void run(){
        System.out.println(name+"is running");
        System.out.println("Speed " +speed);
        System.out.println("Damage " +damage);
        System.out.println("armor" +armor);
    }
    
    boolean isDead(){
        if (healthPoin<=0) return true;
        return false;
        }
    }
