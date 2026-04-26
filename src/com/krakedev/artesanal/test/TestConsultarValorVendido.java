package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;
import com.krakedev.artesanal.NegocioMejorado;

public class TestConsultarValorVendido {

	public static void main(String[] args) {
		NegocioMejorado n = new NegocioMejorado();

        // 1. Agregar máquina
        n.agregarMaquina("Pilsener", "Rubia", 0.02);
        n.cargarMaquina();

        // Obtener la máquina creada
        Maquina m = n.getMaquinas().get(0);

        // 👇 MOSTRAR PRODUCTO Y CÓDIGO
        System.out.println("Producto: " + m.getNombreCerveza());
        System.out.println("Codigo: " + m.getCodigo());

        // 2. Registrar clientes
        n.registrarCliente("Juan", "0101");
        int codigoJuan = n.getClientes().get(0).getCodigo();

        // 3. Consumir
        n.consumirCerveza(m.getCodigo(), codigoJuan, 100);

        // 4. Total
        double total = n.consultarValoresTotales();
        System.out.println("TOTAL VENDIDO: " + total);
    
	}

}
