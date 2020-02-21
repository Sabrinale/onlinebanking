package com.example.bank.service;

import com.example.bank.Dao.PrimaryAccountDao;
import com.example.bank.Dao.SavingsAccountDao;
import com.example.bank.domain.PrimaryAccount;
import com.example.bank.domain.SavingsAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.security.Principal;

@Service
public  class AccountServiceImpl implements AccountService{
    @Autowired
    private PrimaryAccountDao primaryAccountDao;

    @Autowired
    private SavingsAccountDao savingsAccountDao;
    private static int nextAccountNumber = 11223145;

    private int accountGen() {
        return ++nextAccountNumber;
    }

    @Override
    public PrimaryAccount createPrimaryAccount() {
        PrimaryAccount primaryAccount = new PrimaryAccount();
        primaryAccount.setAccountBalance(new BigDecimal(0.0));
        primaryAccount.setAccountNumber(accountGen());

        primaryAccountDao.save(primaryAccount);

        return primaryAccountDao.findByAccountNumber(primaryAccount.getAccountNumber());
    }

    @Override
    public SavingsAccount createSavingsAccount() {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.setAccountBalance(new BigDecimal(0.0));
        savingsAccount.setAccountNumber(accountGen());

        savingsAccountDao.save(savingsAccount);

        return savingsAccountDao.findByAccountNumber(savingsAccount.getAccountNumber());
    }

    @Override
    public void deposit(String accountType, double amount, Principal principal) {

    }

    @Override
    public void withdraw(String accountType, double amount, Principal principal) {

    }
}
