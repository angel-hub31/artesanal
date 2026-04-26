package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Cliente;

public class TestCliente {

	public static void main(String[] args) {

		// 1. Instanciar un cliente usando el constructor 
        Cliente c1 = new Cliente("Juan Perez", "1712345678");

        // 2. Usamos los setters para asignar los valores que no están en el constructor
        c1.setCodigo(101);
        c1.setTotalConsumido(45.50);

        // 3. Mostrar los datos usando los getters
        System.out.println("--- Datos del Cliente ---");
        System.out.println("Nombre: " + c1.getNombre());
        System.out.println("Cédula: " + c1.getCedula());
        System.out.println("Código: " + c1.getCodigo());
        System.out.println("Total Consumido: $" + c1.getTotalConsumido());

       
    }
	}


