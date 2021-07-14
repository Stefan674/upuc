package com.example.upravljanjeucenicima.controller;

import com.example.upravljanjeucenicima.model.Ucenik;
import com.example.upravljanjeucenicima.service.UcenikService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UcenikController {

    @Autowired
    UcenikService ucenikService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("ucenici", ucenikService.getAllUcenici());
        return "index";
    }

    @GetMapping("/dodajUcenika")
    public String dodajUcenika(Model model) {
        Ucenik ucenik = new Ucenik();
        model.addAttribute("noviUcenik", ucenik);
        return "dodajUcenika";
    }

    @PostMapping("/sacuvajUcenika")
    public String sacuvajUcenika(@ModelAttribute ("ucenik") Ucenik ucenik) {
        ucenikService.sacuvajUcenika(ucenik);
        return "redirect:/";
    }

    @GetMapping("/updateUcenika/{id}")
    public String updateUcenika(@PathVariable(value = "id") long id, Model  model) {
        Ucenik ucenik = ucenikService.getUcenikById(id);
        model.addAttribute("ucenik", ucenik);
        return "updateUcenika";
    }

    @GetMapping("/deleteUcenika/{id}")
    public String deleteUcenika(@PathVariable(value = "id") long id) {
        ucenikService.deleteUcenika(id);
        return "redirect:/";
    }

}
