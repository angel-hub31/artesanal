package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Cliente;
import com.krakedev.artesanal.NegocioMejorado;

public class TestBuscarClientePorCedula {

	public static void main(String[] args) {
		NegocioMejorado negocio = new NegocioMejorado();

		negocio.registrarCliente("Juan", "1004034391");
		negocio.registrarCliente("Pedro", "9999999999");
		
		Cliente encontrado=negocio.buscarClientePorCedula("1004034391");
		
		if (encontrado != null) {
			System.out.println("Nombre: "+ encontrado.getNombre());
			System.out.println("Cedula: "+encontrado.getCedula());
			System.out.println("Codigo: "+encontrado.getCodigo() );
			
			System.out.println();

			
		}else {
			System.out.println("Cliente no encontrado");

		}
	}

}
