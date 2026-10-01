package com.hugocarvalho.javabank.MVC.askID;

import com.hugocarvalho.javabank.MVC.Interfaces.Controller;
import com.hugocarvalho.javabank.MVC.MainMenu.ControllerMainMenu;
import com.hugocarvalho.javabank.domain.Bank;
import com.hugocarvalho.javabank.domain.Customer;

public class ControllerAskID implements Controller {
    Bank bank;
    ViewAskID view;
    public ControllerAskID(Bank bank){
        this.bank= bank;
        this.view = new ViewAskID(bank);
    }
    @Override
    public void init() {
        int temp =show();

       bank.setCurrentCustomerId(temp);
       ControllerMainMenu controllerMainMenu = new ControllerMainMenu(bank);
       controllerMainMenu.init();
    }

    @Override
    public int show() {
        int temp = view.prompt();
        return temp;
    }

}
