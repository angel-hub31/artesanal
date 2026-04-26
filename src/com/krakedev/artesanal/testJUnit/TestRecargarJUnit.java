package com.krakedev.artesanal.testJUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse; 
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;
import com.krakedev.artesanal.Maquina;

public class TestRecargarJUnit {
<<<<<<< HEAD
=======
	@Test
	public void testRecargarExitosa(){
		Maquina rubia=new Maquina("002","Pilsener","cerveza",0.02,8000);
		boolean resultado=rubia.recargarCerveza(3000);
		assertTrue(resultado);
		assertEquals(3000,rubia.getCantidadActual(),0.0001);
		
	}
	@Test
	public void testRecargaFallidaPorDesborde(){
	    Maquina negra = new Maquina("003","Club","cerveza fria",0.03,8000);

	    negra.recargarCerveza(7000); // OK
	    boolean resultado = negra.recargarCerveza(10000); 

	    assertTrue(!resultado); 
	    assertEquals(7000, negra.getCantidadActual(), 0.0001);
	}
>>>>>>> 52ef7c801315c39d589e7ac619ae39e7e854865c

    @Test
    public void testRecargarExitosa() {
        Maquina rubia = new Maquina("Pilsener", "cerveza", 0.02, 8000);
        boolean resultado = rubia.recargarCerveza(3000);
        assertTrue(resultado);
        assertEquals(3000, rubia.getCantidadActual(), 0.0001);
    }

    @Test
    public void testRecargaFallidaPorDesborde() {
        // Capacidad 8000: Límite permitido es 7900 (8000 - 100)
        Maquina negra = new Maquina("Club", "cerveza fria", 0.03, 8000);
        
        // Primera recarga válida: cantidadActual llega a 7000
        negra.recargarCerveza(7000);
        
        // Intento de recarga que excede el límite (7000 + 1000 = 8000, que es > 7900)
        boolean resultado = negra.recargarCerveza(1000);
        
        // EXPLICACIÓN DE LOS CAMBIOS:
        // 1. Como 8000 > 7900, el método devuelve false. Usamos assertFalse.
        assertFalse("La recarga debería fallar porque excede el límite de 7900", resultado);
        
        // 2. Como la recarga falló, la cantidad NO cambia. Se mantiene en 7000.
        assertEquals(7000, negra.getCantidadActual(), 0.0001);
    }
}