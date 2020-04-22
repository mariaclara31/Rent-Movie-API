/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentmovie.rentmovieapi.models;

import java.util.Date;
import org.aspectj.lang.annotation.After;
import org.junit.AfterClass;
import org.aspectj.lang.annotation.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class LocacaoIT {
    
    public LocacaoIT() {
    }
    
    @BeforeClass
    public void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCodigoLocacao method, of class Locacao.
     */
    @Test
    public void testGetCodigoLocacao() {
        System.out.println("getCodigoLocacao");
        Locacao instance = new Locacao();
        int expResult = 0;
        int result = instance.getCodigoLocacao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigoLocacao method, of class Locacao.
     */
    @Test
    public void testSetCodigoLocacao() {
        System.out.println("setCodigoLocacao");
        int codigoLocacao = 0;
        Locacao instance = new Locacao();
        instance.setCodigoLocacao(codigoLocacao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCliente method, of class Locacao.
     */
    @Test
    public void testGetCliente() {
        System.out.println("getCliente");
        Locacao instance = new Locacao();
        Cliente expResult = null;
        Cliente result = instance.getCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCliente method, of class Locacao.
     */
    @Test
    public void testSetCliente() {
        System.out.println("setCliente");
        Cliente cliente = null;
        Locacao instance = new Locacao();
        instance.setCliente(cliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFilmes method, of class Locacao.
     */
    @Test
    public void testGetFilmes() {
        System.out.println("getFilmes");
        Locacao instance = new Locacao();
        Filme expResult = null;
        Filme result = instance.getFilmes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFilmes method, of class Locacao.
     */
    @Test
    public void testSetFilmes() {
        System.out.println("setFilmes");
        Filme filmes = null;
        Locacao instance = new Locacao();
        instance.setFilmes(filmes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataEmprestimo method, of class Locacao.
     */
    @Test
    public void testGetDataEmprestimo() {
        System.out.println("getDataEmprestimo");
        Locacao instance = new Locacao();
        Date expResult = null;
        Date result = instance.getDataEmprestimo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataEmprestimo method, of class Locacao.
     */
    @Test
    public void testSetDataEmprestimo() {
        System.out.println("setDataEmprestimo");
        Date dataEmprestimo = null;
        Locacao instance = new Locacao();
        instance.setDataEmprestimo(dataEmprestimo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataDevolucao method, of class Locacao.
     */
    @Test
    public void testGetDataDevolucao() {
        System.out.println("getDataDevolucao");
        Locacao instance = new Locacao();
        Date expResult = null;
        Date result = instance.getDataDevolucao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataDevolucao method, of class Locacao.
     */
    @Test
    public void testSetDataDevolucao() {
        System.out.println("setDataDevolucao");
        Date dataDevolucao = null;
        Locacao instance = new Locacao();
        instance.setDataDevolucao(dataDevolucao);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
