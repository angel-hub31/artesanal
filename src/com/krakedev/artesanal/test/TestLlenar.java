package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;

public class TestLlenar {

	public static void main(String[] args) {
		Maquina rubia = new Maquina("L-10","Pilsene", "Cerveza fria", 0.02, 8000);
		rubia.imprimir();
		rubia.llenarMaquina();	
		rubia.imprimir();

		Maquina negra = new Maquina("L-11","Club", "Cerveza buena", 0.03);
		negra.imprimir();
		negra.llenarMaquina();
		negra.imprimir();
		
		Maquina dorada=new Maquina("l001","cubata","botella",0.04,8000);
		dorada.imprimir();
		dorada.llenarMaquina();
		dorada.imprimir();


	}

}
