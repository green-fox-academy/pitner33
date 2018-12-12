package com.greenfox.com.bankofsimba.Controllers;

import com.greenfox.com.bankofsimba.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankController {
    private List<BankAccount> bankAccounts;

    public BankController () {
        bankAccounts = new ArrayList<>();
        bankAccounts.add(new BankAccount("Simba", 2000, "lion"));
    }


    @GetMapping("/show")
    public String showBankAccount(Model model) {
        model.addAttribute("bankAccounts", bankAccounts);
        return "show";
    }
}
