package com.greenfoxacademy.bank.controller;

import com.greenfoxacademy.bank.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class Exercise3 {

    @RequestMapping("/exercise3")
    public String fillingAccounts (Model model) {
        BankAccount simba = new BankAccount("Simba", 5000, " lions",  "lion");
        BankAccount nala = new BankAccount("Nala", 4500, " lions",  "lion");
        BankAccount scar = new BankAccount("Scar", 10000, " hyenas",  "evil-lion");
        BankAccount mufasa = new BankAccount("Mufasa", 10000, " lions",  "lion");
        BankAccount timon = new BankAccount("Timon", 5, " bugs",  "meerkat");
        BankAccount pumba = new BankAccount("Pumba", 5, " bugs",  "warthog");
        List<BankAccount> bankAccounts = Arrays.asList(simba, nala, scar, mufasa, timon, pumba);
        model.addAttribute("animalList", bankAccounts);
        return "multipleaccounts";
    }
}
