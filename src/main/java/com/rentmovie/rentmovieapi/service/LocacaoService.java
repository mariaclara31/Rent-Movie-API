/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentmovie.rentmovieapi.service;

import com.rentmovie.rentmovieapi.models.Locacao;
import java.util.List;

public interface LocacaoService extends CrudService <Locacao, Long>{
    Integer countByIdFilme(Long idFilme);
    Integer countAvailableByIdFilme(Long idFilme);
    Integer countRenovationByIdFilme(Long idFilme);
    
    List<Locacao>findByAllIdFilme(Long idFilme);
    List<Locacao>rent(Long LocacaoDAO);
    List<Locacao>renew(Long LocacaoDAO);
    
    void receiveAll(Long idCliente);

    /**
     *
     * @param idCliente
     * @param idFilme
     */
    void receive(Long idCliente, Long idFilme);
}
