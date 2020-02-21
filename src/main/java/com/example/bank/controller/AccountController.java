package com.example.bank.controller;

import com.example.bank.domain.PrimaryAccount;
import com.example.bank.domain.SavingsAccount;
import com.example.bank.domain.User;
import com.example.bank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private UserService userService;

    @RequestMapping("/primaryAccount")
    public String primaryAccount(Model model, Principal principal){
        User user = userService.findByUsername(principal.getName());
        PrimaryAccount primaryAccount = user.getPrimaryAccount();

        model.addAttribute("primaryAccount", primaryAccount);
        return "primaryAccount";
    }

    @RequestMapping("/savingsAccount")
    public String savingsAccount(Model model, Principal principal) {
        User user = userService.findByUsername(principal.getName());
        SavingsAccount savingsAccount = user.getSavingsAccount();
        model.addAttribute("savingsAccount", savingsAccount);

        return "savingsAccount";

    }
}
