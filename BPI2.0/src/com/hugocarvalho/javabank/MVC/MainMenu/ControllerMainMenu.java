package com.hugocarvalho.javabank.MVC.MainMenu;

import com.hugocarvalho.javabank.MVC.Interfaces.Controller;
import com.hugocarvalho.javabank.MVC.MakeDeposit.ControllerMakeDeposit;
import com.hugocarvalho.javabank.MVC.OpenAccount.ControllerOpenAccount;
import com.hugocarvalho.javabank.MVC.ViewBalance.ControllerViewBalance;
import com.hugocarvalho.javabank.MVC.askID.ViewAskID;
import com.hugocarvalho.javabank.application.UserOptions;
import com.hugocarvalho.javabank.application.operations.BalanceOperation;
import com.hugocarvalho.javabank.application.operations.NewAccountOperation;
import com.hugocarvalho.javabank.application.operations.Operation;
import com.hugocarvalho.javabank.application.operations.transaction.DepositOperation;
import com.hugocarvalho.javabank.application.operations.transaction.WithdrawOperation;
import com.hugocarvalho.javabank.domain.Bank;

import java.util.HashMap;
import java.util.Map;

public class ControllerMainMenu implements Controller {
    Bank bank;
    ViewMainMenu view;
    public ControllerMainMenu(Bank bank){
        this.bank= bank;
        this.view = new ViewMainMenu(bank);
    }
    @Override
    public void init() {
        buildControllerMap().get(show()).init();

    }

    @Override
    public int show() {
        return view.prompt();
    }
    private Map<Integer, Controller> buildControllerMap() {

        Map<Integer, Controller> map = new HashMap<>();
        map.put(UserOptions.GET_BALANCE.getOption(), new ControllerViewBalance(bank));
        map.put(UserOptions.DEPOSIT.getOption(), new ControllerMakeDeposit(bank));
        //map.put(UserOptions.WITHDRAW.getOption(), // CONTROLLER);
        map.put(UserOptions.OPEN_ACCOUNT.getOption(), new ControllerOpenAccount(bank));

        return map;
    }

}
