package com.hugocarvalho.javabank.application.operations.transaction;

import com.hugocarvalho.javabank.application.BankApplication;
import com.hugocarvalho.javabank.application.UserOptions;

/**
 * An account transaction used to deposit an amount
 * @see AbstractAccountTransactionOperation
 * @see UserOptions#DEPOSIT
 */
public class DepositOperation extends AbstractAccountTransactionOperation {

    /**
     * Initializes a new {@code DepositOperation}
     *
     * @see AbstractAccountTransactionOperation
     */
    public DepositOperation(BankApplication bankApplication) {
        super(bankApplication);
    }

    /**
     * Deposit an amount into an account
     *
     * @see AbstractAccountTransactionOperation#execute()
     */
    @Override
    public void execute() {

        super.execute();

        if (!hasAccounts()) {
            return;
        }

        Integer accountId = scanAccount();
        Double amount = scanAmount();

        if (customer.getAccountIds().contains(accountId)) {
            accountManager.deposit(accountId, amount);
        }

    }
}
