/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentmovie.rentmovieapi.controller;

import com.rentmovie.rentmovieapi.models.Cliente;
import java.util.Set;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    private final ClienteService service;
    
    private static class ClienteService {

        public ClienteService() {
        }

        private Set findAll() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    public ClienteController(ClienteService service){
        this.service = service;
    }
    @PostMapping
    public void save(@RequestBody Cliente cliente){
    }
    @GetMapping
    public Set findAll(){
        return service.findAll();
    }

    /**
     *
     * @param idCliente
     */
    @DeleteMapping
    public void delete(@RequestParam long idCliente){  
    }
}
