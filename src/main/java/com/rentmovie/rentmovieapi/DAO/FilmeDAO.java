/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentmovie.rentmovieapi.DAO;

import com.rentmovie.rentmovieapi.models.Filme;

import org.springframework.data.jpa.repository.JpaRepository;


public interface FilmeDAO extends JpaRepository {
    
    static final long serialVersionUID = 1L;
    
    Filme findById(long id);

    public Object findByEstoqueGreaterThan(int i);
}

