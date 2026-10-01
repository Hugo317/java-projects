package com.hugocarvalho;

public class Main {
    public static void main(String[] args) {

   Person hugo = new Person("Hugo",1000,1000);
   Person maria = new Person("Maria",2000,10000);

       maria.pay(700000000);
       maria.withdraw(600000000);
       maria.save(100);
       maria.walletBalance();
       maria.piggyBalance();
       maria.piggyOnSP500(30);
       maria.piggyOnSP500withDeposit(40,400);






   hugo.pay(200);
   hugo.withdraw(200);
   hugo.save(200);
   hugo.walletBalance();
   hugo.piggyBalance();
   hugo.piggyOnSP500(20);
   hugo.piggyOnSP500withDeposit(40,400);
    }


    // casino
    //



}
