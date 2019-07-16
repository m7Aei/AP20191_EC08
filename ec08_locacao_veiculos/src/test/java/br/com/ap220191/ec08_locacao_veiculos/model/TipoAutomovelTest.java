/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ap220191.ec08_locacao_veiculos.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Natalie
 */
public class TipoAutomovelTest {
    
    public TipoAutomovelTest() {
    }
    
    

    /**
     * Test of values method, of class TipoAutomovel.
     */
    @org.junit.Test
    public void testValues() {
        Automovel a1 = new Automovel("123ABC", true, TipoAutomovel.LUXO);
        System.out.println("values");
        assertEquals(10.0, a1.getTipo().getAliquota(), 0.1);
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

  
    
}
