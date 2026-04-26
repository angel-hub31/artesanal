package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;
import com.krakedev.artesanal.NegocioMejorado;

public class TestAgregarMaquina {

	public static void main(String[] args) {
		NegocioMejorado negocio=new NegocioMejorado();
		negocio.agregarMaquina("Pilsener","Cerveza  rubia",0.02);	
		Maquina maquinaGuardada= negocio.getMaquinas().get(0);
		
        System.out.println("ID Generado: " + maquinaGuardada.getCodigo());
        System.out.println("Producto: " + maquinaGuardada.getNombreCerveza());
        System.out.println("Precio por ml: $" + maquinaGuardada.getPrecioPorMl());
		
	}

}
