package com.krakedev.artesanal.test;

import com.krakedev.artesanal.NegocioMejorado;

public class TestClientes {

	public static void main(String[] args) {
		NegocioMejorado negocio = new NegocioMejorado();
        
        //  Llamamos a registrarCliente
        // Esto debería lanzar el NullPointerException 
        System.out.println("Registrar cliente");
        negocio.registrarCliente("Juan Perez", "1712345678");
        
        System.out.println("Cliente registrado con éxito");
    
	}

}
