/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentmovie.rentmovieapi.controller;

import com.rentmovie.rentmovieapi.DAO.FilmeDAO;
import com.rentmovie.rentmovieapi.models.Filme;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@RestController

public class FilmeController {
    @Autowired
    private final FilmeDAO filmeDAO;


    public FilmeController(FilmeDAO clienteDAO) {
        this.filmeDAO = clienteDAO;

    }

    @GetMapping({"/filme"})
    //@ResponseBody
    public String list(Model model) {
        model.addAttribute("filmes", filmeDAO.findAll());
        model.addAttribute("filme", new Filme());
        return "pages/filme";
    }

    /**
     *
     * @param filme
     * @param bindingResult
     * @param flash
     * @return
     */
    @PostMapping("/filme")
    //@ResponseBody
    public ModelAndView save(@Valid Filme filme, BindingResult bindingResult, RedirectAttributes flash) {
        if (bindingResult.hasErrors()) {
            return new ModelAndView("pages/filme", "filmes", filmeDAO.findAll());

        } else {
            try {
                filmeDAO.save(filme);
                flash.addFlashAttribute("sucessmessage", "Cadastro realizado com sucesso");
            } catch (Exception ex) {
                flash.addFlashAttribute("errormessage", "Filme já cadastrado");
            }
            return new ModelAndView("redirect:/filme");
        }
    }
}
