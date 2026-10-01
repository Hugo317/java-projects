package com.hugocarvalho;

import com.hugocarvalho.gameobjects.Barrel;
import com.hugocarvalho.gameobjects.GameObject;
import com.hugocarvalho.gameobjects.Shotable;
import com.hugocarvalho.gameobjects.Tree;
import com.hugocarvalho.gameobjects.enemys.ArmouredEnemy;
import com.hugocarvalho.gameobjects.enemys.Enemy;
import com.hugocarvalho.gameobjects.enemys.SoldierEnemy;

public class SniperRifle {

    int bulletDamage = 0;
    double missingChance = 0.2;
    boolean aimOnTree;
    SniperRifle(int bulletDamage){
        this.bulletDamage=bulletDamage;
    }
    SniperRifle() {
        System.out.println("This sniper has a " + (int) (missingChance * 100) + "% chance to fail a shot" +
                "\n =========START==========");
    }

    public boolean isAimOnTree() {
        return aimOnTree;
    }

    public void aim(GameObject object) {
        if (object instanceof Tree) {
            aimOnTree = true;
        } else {
            aimOnTree = false;
        }
    }


    public void shoot(Shotable enemy) {
        double randomGen = Math.random();
        Enemy holdEnemy = new ArmouredEnemy();
        // System.out.println("Inside sniperrifle.shoot, shooting enemy");
        if (randomGen < missingChance) {
            System.out.println("your shot missed, no damage done" +
                    "\n ===================");
            return;
        }
        if (randomGen >= missingChance) {
            System.out.println("Shot on target!");
            enemy.hit(bulletDamage);
            if (enemy instanceof Barrel)
                System.out.println("MASSIVE BOOM");
            if (enemy.isDestroyed() && (enemy instanceof ArmouredEnemy || enemy instanceof SoldierEnemy)) {
                System.out.println("You killed a " + enemy.toString());
                return;
            }
            if (!enemy.isDestroyed() && (enemy instanceof ArmouredEnemy) || (enemy instanceof SoldierEnemy)) {
                if (enemy instanceof SoldierEnemy) {
                    holdEnemy = (SoldierEnemy) enemy;
                    System.out.println(enemy.toString() + " has " + holdEnemy.getArmor() + " Armor and " + holdEnemy.getHealth() + " Helth");
                }
                if (enemy instanceof ArmouredEnemy) {
                    holdEnemy = (ArmouredEnemy) enemy;
                    System.out.println(enemy.toString() + " has " + holdEnemy.getArmor() + " Armor and " + holdEnemy.getHealth() + " Helth");
                }


            }
            System.out.println("==================================");


        }


    }
}
