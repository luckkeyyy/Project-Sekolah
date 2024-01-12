/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gem;

/**
 *
 * @author user
 */
public class Gem {

    public static void main(String[] args) {
        player Hero = new player();
        Enemy Enemy = new Enemy();
        
        Hero.name = "Ata ";
        Hero.speed = 20;
        Hero.healthPoin = 100;
        Hero.damage = 10;
        Hero.armor = 60;
        Hero.run();
        
        //enemy
        Enemy.Damage = 50;
        Enemy.jeneng = "Napis ";
        Enemy.lawan();
                if (Hero.isDead()) {
            System.out.println("Game Over :( ");
        }
    Drone luky = new Drone();
    luky.energi = 11;
    luky.ketinggian = 11;
    luky.kecepatan = 100;
    luky.merek = "Samsung";
    
    luky.terbang();
    luky.matikanMesin();
    luky.maju();
    luky.turun();
    luky.mundur();
    luky.belok();
    
    //Kakashi
    Kakashi hokage = new Kakashi();
    hokage.cakra = 101;
    hokage.jutsu = "Hokage ga guna";
    hokage.kekuatan = 40;
    
    hokage.Sharinggan();
    hokage.chidori();
    hokage.maskeran();
    
    }

}

