/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentmovie.rentmovieapi.service;

import com.rentmovie.rentmovieapi.models.Filme;
import java.util.Set;

public interface FilmeService extends CrudService{
    /**
     *
     * @param idFilme
     * @param titulo
     * @param diretor
     * @param genero
     * @return
     */
    Set<Filme> findBy(Long idFilme, String titulo, String diretor, String genero);
}