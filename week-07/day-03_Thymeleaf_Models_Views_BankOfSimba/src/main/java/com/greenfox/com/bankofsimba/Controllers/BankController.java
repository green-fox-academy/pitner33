package com.greenfox.com.bankofsimba.Controllers;

import com.greenfox.com.bankofsimba.BankAccount;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankController {
    private List<BankAccount> bankAccounts;
    BankAccount simba2;

    public BankController () {
        bankAccounts = new ArrayList<>();
        bankAccounts.add(new BankAccount("Simba", 2000.35f, "lion", "good"));
        bankAccounts.add(new BankAccount("Balu", 1500f, "bear", "good"));
        bankAccounts.add(new BankAccount("Banzai", 5f, "Hyena King", "bad"));
        bankAccounts.add(new BankAccount("Pumbaa", 150f, "boar", "bad"));
        bankAccounts.add(new BankAccount("Mufasa", 10000f, "Lion King", "good"));

        simba2 = new BankAccount("Simba2", 500f, "lioness", "good");
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
        model.addAttribute("simba", simba2);
        return "simba2";
    }


    public void topUp(String name) {
        for (BankAccount accounts : bankAccounts) {
            if (name.equals(accounts.getName()) && (accounts.getIsKing())) {
                accounts.setBalance(accounts.getBalance() + 100);
            } else if (name.equals(accounts.getName())) {
                accounts.setBalance(accounts.getBalance() + 10);
            }
        }
    }

    @GetMapping("topup")
    public String  topup(Model model) {
        model.addAttribute("bankAccounts", bankAccounts);
        return "topup";
    }

    @PostMapping("show")
    public String topUpPost(@ModelAttribute(name = "nameOfAccountOwner") String name) {
        topUp(name);
        return "redirect:show";

    }

}
