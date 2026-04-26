package com.krakedev.artesanal.test;

import java.util.ArrayList;

import com.krakedev.artesanal.Cliente;
import com.krakedev.artesanal.NegocioMejorado;

public class TestClientes {

	public static void main(String[] args) {
		NegocioMejorado negocio = new NegocioMejorado();

		// 1. Registramos los clientes
		negocio.registrarCliente("Angel", "1723456789");
		negocio.registrarCliente("Maria", "1711223344");

		// 2. Obtenemos la lista de clientes del negocio
		ArrayList<Cliente> lista = negocio.getClientes();

		System.out.println("--- LISTA DE CLIENTES ---");

		// 3. Usamos un contador "i" que empieza en 0 y sube de uno en uno
		for (int i = 0; i < lista.size(); i++) {
			// Sacamos al cliente que está en la posición "i"
			Cliente c = lista.get(i);

			// Imprimimos sus datos
			System.out.println(i+" "+ "Cliente: "  + c.getNombre()+" | Cedula: " +c.getCedula());
		}
			System.out.println("Total de Clientes: " + negocio.getClientes().size());

	}
}
