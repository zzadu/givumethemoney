package com.hey.givumethemoney.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DetailController {

    @GetMapping("/detail")
    //@ResponseBody
    public String detail(@RequestParam("id") int id, Model model) {
        model.addAttribute("id", id);
        return "donationDetail";
    }

    @GetMapping("/application")
    public String application() {
        return "donationForm";
    }
}
