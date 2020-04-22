/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentmovie.rentmovieapi.service;

import com.rentmovie.rentmovieapi.models.Cliente;
import java.util.Set;

public interface ClienteService extends CrudService<Cliente, Long>{

    /**
     *
     * @param idCliente
     * @param Nome
     * @param CPF
     * @param dataAniversatio
     * @param sexo
     * @return
     */
    Set<Cliente> findBy(long idCliente, String Nome, String CPF, String dataAniversatio, String sexo);
      
}
