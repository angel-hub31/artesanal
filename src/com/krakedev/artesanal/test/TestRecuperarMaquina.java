package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;
import com.krakedev.artesanal.NegocioMejorado;

public class TestRecuperarMaquina {

	public static void main(String[] args) {
		        NegocioMejorado negocio = new NegocioMejorado();
		        
		        // 1. Agregamos una máquina
		        negocio.agregarMaquina("Pilener", "Rubia", 0.05);
		        
		        // 2. Obtenemos el código : se genera el codigo random
		        String codigo = negocio.getMaquinas().get(0).getCodigo();
		        
		        // 3. Probamos recuperar y mostramos el nombre
		        Maquina m = negocio.recuperarMaquina(codigo); //aqui se utiliza el codigo generado  de forma random
		        System.out.println("Codigo: " + codigo);
		        System.out.println("Producto: " + m.getNombreCerveza());
		        System.out.println("Precio: "+ m.getPrecioPorMl());
		        System.out.println();
		        //aqui no se genera un codigo random,al imprimir
		        //no lo encuentra,por eso es null
		        System.out.println("Buscando inexistente: " + negocio.recuperarMaquina(""));
		    }
		}


