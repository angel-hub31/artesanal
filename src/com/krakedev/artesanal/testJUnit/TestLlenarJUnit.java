package com.krakedev.artesanal.testJUnit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Maquina;

public class TestLlenarJUnit {
	@Test
	public void testLenarMaquina() {
		Maquina rubia=new Maquina("001","Pilsener","cerveza",0.02,8000);
		rubia.llenarMaquina();
		
		
		
		assertEquals(7800,rubia.getCantidadActual(),0.0001);
	}

}
