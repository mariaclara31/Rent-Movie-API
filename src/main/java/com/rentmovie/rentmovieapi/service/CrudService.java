/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentmovie.rentmovieapi.service;

import java.util.Set;

/**
 * @param <Titulo>
 * @param <ID>
 */
public interface CrudService <Titulo, ID>{
    Set<Titulo> findAll();
    Titulo findById(ID id);
    Titulo save (Titulo object);
    void delete(Titulo object);
    void deleteById(ID id);
}
