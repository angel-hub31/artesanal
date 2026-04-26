package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Cliente;
import com.krakedev.artesanal.Maquina;
import com.krakedev.artesanal.NegocioMejorado;

public class TestConsumirCerveza {

	public static void main(String[] args) {
		NegocioMejorado n = new NegocioMejorado();

        n.agregarMaquina("Pilsener", "Rubia", 0.02);
        Maquina m = n.getMaquinas().get(0);
        m.llenarMaquina();

        n.registrarCliente("Juan", "123");
        Cliente c = n.getClientes().get(0);

        n.consumirCerveza(m.getCodigo(), c.getCodigo(), 100);
        
        System.out.println("Producto: "+m.getNombreCerveza());
        System.out.println("Codigo: "+ m.getCodigo());
        System.out.println("Total: " + c.getTotalConsumido());
    }
	
}
