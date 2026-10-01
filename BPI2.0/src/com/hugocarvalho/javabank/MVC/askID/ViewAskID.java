package com.hugocarvalho.javabank.MVC.askID;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerSetInputScanner;
import com.hugocarvalho.javabank.MVC.Interfaces.View;
import com.hugocarvalho.javabank.application.Messages;
import com.hugocarvalho.javabank.domain.Bank;

public class ViewAskID implements View {
    Bank bank;
    public ViewAskID(Bank bank) {
        this.bank = bank;
    }

    public final Prompt prompt = new Prompt(System.in,System.out);

    public int prompt() {

        IntegerSetInputScanner scanner = new IntegerSetInputScanner(bank.getCustomerIds());
        scanner.setMessage(Messages.CHOOSE_CUSTOMER);
        scanner.setError(Messages.ERROR_INVALID_CUSTOMER);

        return prompt.getUserInput(scanner);
    }
}
