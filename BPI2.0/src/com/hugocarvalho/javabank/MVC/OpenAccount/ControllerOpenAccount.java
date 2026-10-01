package com.hugocarvalho.javabank.MVC.OpenAccount;

import com.hugocarvalho.javabank.MVC.Interfaces.Controller;
import com.hugocarvalho.javabank.MVC.MainMenu.ControllerMainMenu;
import com.hugocarvalho.javabank.application.Messages;
import com.hugocarvalho.javabank.domain.Bank;
import com.hugocarvalho.javabank.domain.account.AccountType;

public class ControllerOpenAccount implements Controller {
    Bank bank;
    ViewOpenAccount view;

    public ControllerOpenAccount(Bank bank){
        this.bank = bank;
        this.view = new ViewOpenAccount();
    }

    @Override
    public void init() {
        bank.getCustomer(bank.getCurrentCustomerId()).openAccount(AccountType.CHECKING);
        System.out.println("\n" + Messages.CREATED_ACCOUNT + bank.getCustomer(bank.getCurrentCustomerId()).getName() + " : "
                + bank.getCustomer(bank.getCurrentCustomerId()).getAccounts().size());
        new ControllerMainMenu(bank).init();

    }

    @Override
    public int show() {
        return view.prompt();
    }
}
