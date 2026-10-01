package com.hugocarvalho.javabank.MVC.MakeDeposit;

import com.hugocarvalho.javabank.MVC.DepositAmount.ControllerDepositAmount;
import com.hugocarvalho.javabank.MVC.Interfaces.Controller;
import com.hugocarvalho.javabank.MVC.MainMenu.ControllerMainMenu;
import com.hugocarvalho.javabank.MVC.MainMenu.ViewMainMenu;
import com.hugocarvalho.javabank.domain.Bank;
import com.hugocarvalho.javabank.domain.account.Account;

public class ControllerMakeDeposit implements Controller {
    Bank bank;
    ViewMakeDeposit view;
    int accID;

    public ControllerMakeDeposit(Bank bank){
        this.bank= bank;
    }

    public void setView() {
        this.view = new ViewMakeDeposit(bank, getAccounts());
    }

    @Override
    public void init() {
        setView();
        if (bank.getCustomer(bank.getCurrentCustomerId()).getAccounts().size() == 0){
            System.out.println("Need to create a account first");
            new ControllerMainMenu(bank).init();
        } else {
         accID = show();
            System.out.println("THE ACC ID IS " + accID);
            new ControllerDepositAmount(bank,accID).init();
        }
    }

    @Override
    public int show() {
        return view.prompt();
    }
    public String getAccounts(){
        String holder = "";
        for (Account acc :bank.getCustomer(bank.getCurrentCustomerId()).getAccounts()) {
            holder += acc.getId() + " ";
        }
        return holder;
    }
}
