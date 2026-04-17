package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;

public class TestServir {

	public static void main(String[] args) {
		Maquina rubia=new Maquina("S-99","Pilsener","cerveza fria",0.02,8000);
		System.out.println("----------ESTADO INICIAL--------------");
		rubia.imprimir();
		
		System.out.println("----------LLENADO MAQUINA--------------");
		rubia.llenarMaquina();
		rubia.imprimir();
		
		System.out.println("----------SERVIR 1000 ML--------------");
		double valor;
		valor=rubia.servirCerveza(1000);
		System.out.println("VALOR A PAGAR:"+valor);

		System.out.println("----------SERVIR 2000 ML--------------");
		valor=rubia.servirCerveza(2000);
		System.out.println("VALOR A PAGAR:"+valor);
		rubia.imprimir();
		
		System.out.println("----------SERVIR 6000 ML--------------");
		valor=rubia.servirCerveza(6000);
		System.out.println("VALOR A PAGAR:"+valor);
		rubia.imprimir();

		
	}

}
