package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Cliente;
import com.krakedev.artesanal.Maquina;
import com.krakedev.artesanal.Negocio;

public class TestNegocio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// instanciamos   máquina 
				Maquina mq = new Maquina("h123","Pilsener", "Cerveza Fria", 0.05, 5000);
				Maquina ma =new Maquina("g156","club","Premium",0.02,8000);
				// instanciamos negocio
				Negocio cafeArtesanal = new Negocio("Cervecería El Churu", mq);
				Negocio cafe=new Negocio("TINGO", ma);
			
				
				// 3. Cargar la máquina
				cafeArtesanal.cargarMaquinaA();
				
				// // instanciamos un cliente
				Cliente cli = new Cliente("1722334455", "Juan Perez");
				Cliente cl=new Cliente("1004034391","Angel Morales");
				
				// 5. Asignar código al cliente (usando la lógica del Negocio)
				System.out.println("Asignando código...");
				cafeArtesanal.asignarCodigoCliente(cli);
				
				// 6. Realizar consumos
				System.out.println("--- Iniciando consumos ---");
				// Supongamos que pide 300ml
				cafeArtesanal.consumirCervezaMaquinaA(cli, 300);
				
				// Supongamos que pide otros 200ml
				cafeArtesanal.consumirCervezaMaquinaA(cli, 200);
				
				// 7. Mostrar resultados finales
				System.out.println("Cliente: " + cli.getCedula()+ " | "+cli.getNombre());
				System.out.println("Código asignado: " + cli.getCodigo());
				System.out.println("Total a pagar: $" + cli.getTotalConsumido());
				
				System.out.println();
				
				cafeArtesanal.asignarCodigoCliente(cli);
				// 6. Realizar consumos
				System.out.println("--- Iniciando consumos ---");
				// Supongamos que pide 500ml
				cafeArtesanal.consumirCervezaMaquinaA(cli, 500);
				// Supongamos que pide otros 200ml
				cafeArtesanal.consumirCervezaMaquinaA(cli, 300);
				// 7. Mostrar resultados finales
				System.out.println("Cliente: " + cli.getCedula()+ " | "+cli.getNombre());
				System.out.println("Código asignado: " + cli.getCodigo());
				System.out.println("Total a pagar: $" + cli.getTotalConsumido());
				
				
				System.out.println();
				
				cafeArtesanal.asignarCodigoCliente(cl);
				// 6. Realizar consumos
				System.out.println("--- Iniciando consumos ---");
				// Supongamos que pide 500ml
				cafeArtesanal.consumirCervezaMaquinaA(cl, 200);
				// Supongamos que pide otros 200ml
				cafeArtesanal.consumirCervezaMaquinaA(cl, 100);
				// 7. Mostrar resultados finales
				System.out.println("Cliente: " + cl.getCedula()+ " | "+cl.getNombre());
				System.out.println("Código asignado: " + cl.getCodigo());
				System.out.println("Total a pagar: $" + cl.getTotalConsumido());
				
				

	}
	
	

}
