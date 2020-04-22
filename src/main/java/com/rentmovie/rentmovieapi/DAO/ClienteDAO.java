/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentmovie.rentmovieapi.DAO;

import com.rentmovie.rentmovieapi.models.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ClienteDAO extends JpaRepository {
    
    static final long serialVersionUID = 1L;
    
    Cliente findById(long id);
}
