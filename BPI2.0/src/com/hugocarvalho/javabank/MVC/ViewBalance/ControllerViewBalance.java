package com.hugocarvalho.javabank.MVC.ViewBalance;

import com.hugocarvalho.javabank.MVC.Interfaces.Controller;
import com.hugocarvalho.javabank.MVC.MainMenu.ControllerMainMenu;
import com.hugocarvalho.javabank.MVC.MainMenu.ViewMainMenu;
import com.hugocarvalho.javabank.domain.Bank;

public class ControllerViewBalance implements Controller {
    Bank bank;
    ViewViewBalance view;
    public ControllerViewBalance(Bank bank){
        this.bank= bank;
        this.view = new ViewViewBalance(bank);
    }
    @Override
    public void init() {
        System.out.println(bank.getCurrentCustomerId()
        );
        System.out.println(bank.getCustomer(bank.getCurrentCustomerId()).getName() + " Balance \n");
        System.out.println("Total Balance: " + bank.getBalance());
        new ControllerMainMenu(bank).init();
    }

    @Override
    public int show() {
        return 0;
    }
}
