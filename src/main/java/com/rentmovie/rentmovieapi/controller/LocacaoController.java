/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentmovie.rentmovieapi.controller;

import com.rentmovie.rentmovieapi.DAO.ClienteDAO;
import com.rentmovie.rentmovieapi.DAO.FilmeDAO;
import com.rentmovie.rentmovieapi.DAO.LocacaoDAO;
import com.rentmovie.rentmovieapi.models.Filme;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocacaoController {
 
    @Autowired
    private LocacaoDAO locacaoDAO;

    @Autowired
    private FilmeDAO filmeDAO;

    @Autowired
    private ClienteDAO clienteDAO;
    private LocacaoController service;
    private FilmeList filmelist;

    private void deleteById(Long idInventarioFilme) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     private static class FilmeList {

        public FilmeList() {
        }
    }

    public LocacaoController(LocacaoController service) {
        this.service = service;
    }

    public LocacaoController(LocacaoDAO locacaoDAO) {
        this.locacaoDAO = locacaoDAO;
    }

    public LocacaoController(LocacaoDAO locacaoDAO, FilmeDAO filmeDAO, ClienteDAO clienteDAO) {
        this.locacaoDAO = locacaoDAO;
        this.filmeDAO = filmeDAO;
        this.clienteDAO = clienteDAO;
    }
    
    @GetMapping("/idFilme")
    public void findByFilme(@PathVariable Long idFilme){  
    }
    @PutMapping("/alugar")
    public ResponseEntity rent(@RequestBody LocacaoDAO locacaoDAO){
        return ResponseEntity.ok(service.rent(locacaoDAO));
    }
     @PutMapping("/receber")
    public ResponseEntity receive(@RequestParam Long idUsuario,
                                  @RequestParam Long idFilme) {

        service.receive(idUsuario, idFilme);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/qtd-filme")
    public void countByFilme(@RequestParam Long idFilme) {
    }

    @GetMapping("/qtd-filme-disponivel")
    public void countAvailableByFilme(@RequestParam Long idFilme){
    }

    @DeleteMapping
    public ResponseEntity delete(@RequestParam Long idInventarioFilme) {

        service.deleteById(idInventarioFilme);
        return ResponseEntity.ok().build();
    }
}
