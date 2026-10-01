package com.hugocarvalho.javabank.MVC;

import com.hugocarvalho.javabank.MVC.askID.ControllerAskID;
import com.hugocarvalho.javabank.domain.Bank;
import com.hugocarvalho.javabank.domain.Customer;
import com.hugocarvalho.javabank.managers.AccountManager;

public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank();
        AccountManager accountManager = new AccountManager();
        bank.setAccountManager(accountManager);

        Customer c1 = new Customer(1, "Rui");
        Customer c2 = new Customer(2, "Sergio");
        Customer c3 = new Customer(3, "Bruno");
        bank.addCustomer(c1);
        bank.addCustomer(c2);
        bank.addCustomer(c3);

        ControllerAskID controllerAskID = new ControllerAskID(bank);
        controllerAskID.init();
    }
}
