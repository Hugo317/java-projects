package com.hugocarvalho.javabank.MVC.OpenAccount;

import org.academiadecodigo.bootcamp.Prompt;
import com.hugocarvalho.javabank.MVC.Interfaces.View;
import com.hugocarvalho.javabank.domain.Bank;

public class ViewOpenAccount implements View {
    private Prompt prompt = new Prompt(System.in,System.out);

    Bank bank;

    @Override
    public int prompt() {
        return 0;
    }
}
