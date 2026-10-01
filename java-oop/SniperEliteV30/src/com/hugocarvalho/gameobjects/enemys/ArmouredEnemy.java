package com.hugocarvalho.gameobjects.enemys;

import com.hugocarvalho.gameobjects.Shotable;

public class ArmouredEnemy extends Enemy implements Shotable {

    public ArmouredEnemy(){
        super.armor = 50;
    }

    @Override
    public String toString() {
        return "Armoured Enemy";
    }
}
