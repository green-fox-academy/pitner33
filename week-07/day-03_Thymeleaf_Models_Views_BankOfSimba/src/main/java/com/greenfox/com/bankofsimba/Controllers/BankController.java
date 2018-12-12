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
    BankAccount simba2;

    public BankController () {
        bankAccounts = new ArrayList<>();
        bankAccounts.add(new BankAccount("Simba", 2000.35f, "lion"));
        bankAccounts.add(new BankAccount("Balu", 1500f, "bear"));

        simba2 = new BankAccount("Simba2", 500f, "lioness");
    }


    @GetMapping("/show") //Filling multiple accounts + Formatting the balance
    public String showBankAccount(Model model) {
        model.addAttribute("bankAccounts", bankAccounts);
        return "show";
    }

    @GetMapping("enjoy") //HTMLception
    public String enjoy(Model model) {
        model.addAttribute("enjoy", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "enjoy";
    }

    @GetMapping("singleaccount") //Showing one Account
    public String singleAccount(Model model) {
        model.addAttribute("simba", new BankAccount("Simba2", 500f, "lioness"));
        model.addAttribute("simba", simba2);
        return "simba2";
    }
}
