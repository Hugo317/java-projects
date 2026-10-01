package com.hugocarvalho;

public class Main {
    public static void main(String[] args) {


        Guest alex = new Guest("Alex",false);
        Hotel hotel1 = new Hotel("California", 30, 30);
        Hotel hotel2 = new Hotel("Pestana",50,10);
          alex.checkIn(hotel1);
           //alex.checkOut();
           alex.checkIn(hotel2);



    }
    }
