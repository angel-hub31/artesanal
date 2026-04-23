package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;

public class TestAtributos {

	public static void main(String[] args) {
		Maquina rubia=new Maquina("B-001","Pilsener" , "cerveza rubia", 0.02, 10000);
		rubia.imprimir();
		
		rubia.setNombreCerveza("Golden ale");
		rubia.setDescripcionCerveza("Cerveza con aroma mas intenso");
		rubia.imprimir();

	}

}
