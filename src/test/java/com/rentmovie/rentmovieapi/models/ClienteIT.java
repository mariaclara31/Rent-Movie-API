/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rentmovie.rentmovieapi.models;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ClienteIT {
    
    public ClienteIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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
     * Test of getIdUsuario method, of class Cliente.
     */
    @Test
    public void testGetIdUsuario() {
        System.out.println("getIdUsuario");
        Cliente instance = new Cliente();
        long expResult = 0L;
        long result = instance.getIdUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNomeCompleto method, of class Cliente.
     */
    @Test
    public void testGetNomeCompleto() {
        System.out.println("getNomeCompleto");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getNomeCompleto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCpf method, of class Cliente.
     */
    @Test
    public void testGetCpf() {
        System.out.println("getCpf");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getCpf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataAniversario method, of class Cliente.
     */
    @Test
    public void testGetDataAniversario() {
        System.out.println("getDataAniversario");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getDataAniversario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSexo method, of class Cliente.
     */
    @Test
    public void testGetSexo() {
        System.out.println("getSexo");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getSexo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdUsuario method, of class Cliente.
     */
    @Test
    public void testSetIdUsuario() {
        System.out.println("setIdUsuario");
        long idUsuario = 0L;
        Cliente instance = new Cliente();
        instance.setIdUsuario(idUsuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNomeCompleto method, of class Cliente.
     */
    @Test
    public void testSetNomeCompleto() {
        System.out.println("setNomeCompleto");
        String nomeCompleto = "";
        Cliente instance = new Cliente();
        instance.setNomeCompleto(nomeCompleto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCpf method, of class Cliente.
     */
    @Test
    public void testSetCpf() {
        System.out.println("setCpf");
        String cpf = "";
        Cliente instance = new Cliente();
        instance.setCpf(cpf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataAniversario method, of class Cliente.
     */
    @Test
    public void testSetDataAniversario() {
        System.out.println("setDataAniversario");
        String dataAniversario = "";
        Cliente instance = new Cliente();
        instance.setDataAniversario(dataAniversario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSexo method, of class Cliente.
     */
    @Test
    public void testSetSexo() {
        System.out.println("setSexo");
        String sexo = "";
        Cliente instance = new Cliente();
        instance.setSexo(sexo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of builder method, of class Cliente.
     */
    @Test
    public void testBuilder() {
        System.out.println("builder");
        Cliente.ClienteBuilder expResult = null;
        Cliente.ClienteBuilder result = Cliente.builder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
