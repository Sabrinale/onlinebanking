package com.example.bank.service;

import com.example.bank.domain.PrimaryAccount;
import com.example.bank.domain.SavingsAccount;

import java.security.Principal;

public interface AccountService {

    PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();

    void deposit(String accountType, double amount, Principal principal);
    void withdraw(String accountType, double amount, Principal principal);
}
