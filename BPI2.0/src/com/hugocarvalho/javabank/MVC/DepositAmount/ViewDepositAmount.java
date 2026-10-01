package com.hugocarvalho.javabank.MVC.DepositAmount;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.integer.IntegerInputScanner;
import com.hugocarvalho.javabank.MVC.Interfaces.View;
import com.hugocarvalho.javabank.application.Messages;
import com.hugocarvalho.javabank.domain.Bank;

public class ViewDepositAmount implements View {
    Prompt prompt = new Prompt(System.in,System.out);
    Bank bank;

    @Override
    public int prompt() {
        IntegerInputScanner scanner = new IntegerInputScanner();
        scanner.setMessage(Messages.CHOOSE_AMOUNT);

        return prompt.getUserInput(scanner);
    }
}
