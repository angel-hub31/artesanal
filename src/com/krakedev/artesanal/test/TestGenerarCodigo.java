package com.krakedev.artesanal.test;

import com.krakedev.artesanal.NegocioMejorado;

public class TestGenerarCodigo {

	public static void main(String[] args) {
		NegocioMejorado nm=new NegocioMejorado();
		
		System.out.println("Resultado 1: " + nm.generarCodigo());
        System.out.println("Resultado 2: " + nm.generarCodigo());
        System.out.println("Resultado 3: " + nm.generarCodigo());
		
	}

}
