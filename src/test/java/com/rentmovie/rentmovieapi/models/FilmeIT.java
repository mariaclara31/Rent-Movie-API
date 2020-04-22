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

public class FilmeIT {
    
    public FilmeIT() {
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
     * Test of getIdFilme method, of class Filme.
     */
    @Test
    public void testGetIdFilme() {
        System.out.println("getIdFilme");
        Filme instance = new Filme();
        Long expResult = null;
        Long result = instance.getIdFilme();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitulo method, of class Filme.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        Filme instance = new Filme();
        String expResult = "";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDiretor method, of class Filme.
     */
    @Test
    public void testGetDiretor() {
        System.out.println("getDiretor");
        Filme instance = new Filme();
        String expResult = "";
        String result = instance.getDiretor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGenero method, of class Filme.
     */
    @Test
    public void testGetGenero() {
        System.out.println("getGenero");
        Filme instance = new Filme();
        String expResult = "";
        String result = instance.getGenero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantidade method, of class Filme.
     */
    @Test
    public void testGetQuantidade() {
        System.out.println("getQuantidade");
        Filme instance = new Filme();
        String expResult = "";
        String result = instance.getQuantidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdFilme method, of class Filme.
     */
    @Test
    public void testSetIdFilme() {
        System.out.println("setIdFilme");
        Long idFilme = null;
        Filme instance = new Filme();
        instance.setIdFilme(idFilme);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitulo method, of class Filme.
     */
    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "";
        Filme instance = new Filme();
        instance.setTitulo(titulo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDiretor method, of class Filme.
     */
    @Test
    public void testSetDiretor() {
        System.out.println("setDiretor");
        String diretor = "";
        Filme instance = new Filme();
        instance.setDiretor(diretor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGenero method, of class Filme.
     */
    @Test
    public void testSetGenero() {
        System.out.println("setGenero");
        String genero = "";
        Filme instance = new Filme();
        instance.setGenero(genero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantidade method, of class Filme.
     */
    @Test
    public void testSetQuantidade() {
        System.out.println("setQuantidade");
        String quantidade = "";
        Filme instance = new Filme();
        instance.setQuantidade(quantidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of builder method, of class Filme.
     */
    @Test
    public void testBuilder() {
        System.out.println("builder");
        Filme.FilmeBuilder expResult = null;
        Filme.FilmeBuilder result = Filme.builder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Filme.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Filme instance = new Filme();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Filme.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Filme instance = new Filme();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Filme.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Filme instance = new Filme();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
