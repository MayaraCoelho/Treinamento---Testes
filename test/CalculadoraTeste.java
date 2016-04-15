/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import artigotdd.model.Calculadora;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author uff
 */
public class CalculadoraTeste {
    
    public CalculadoraTeste() {
    }
    
    @Test
    public void deveriaSomarDoisValoresPassados() throws Exception 
    {
        int valorA = 1;
	int valorB = 2;
//	int soma = 0;
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.soma(valorA, valorB);
	assertEquals(3, soma);

    }
    
    @Test
    public void deveriaSubtrairDoisValoresPassados() throws Exception {
	Calculadora calculadora = new Calculadora();
	int valorA = 1;
	int valorB = 2;
	int subtracao = calculadora.subtrai(valorA, valorB);

	assertEquals(-1, subtracao);
}
    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
