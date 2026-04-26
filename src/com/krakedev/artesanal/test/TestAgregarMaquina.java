package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;
import com.krakedev.artesanal.NegocioMejorado;

public class TestAgregarMaquina {

	public static void main(String[] args) {
		NegocioMejorado negocio=new NegocioMejorado();
		boolean r1=negocio.agregarMaquina("Pilsener","Cerveza  rubia",0.02);	
		
		if(r1==true) {
			
			System.out.println(".......Máquina 1......... ");
			Maquina maquinaGuardada= negocio.getMaquinas().get(0);
			System.out.println("Codigo: " + maquinaGuardada.getCodigo());
		    System.out.println("Producto: " + maquinaGuardada.getNombreCerveza());
		    System.out.println("Precio por ml: $" + maquinaGuardada.getPrecioPorMl());
				
		}else {
			System.out.println("Error:Código duplicado");
		}
		
		
		System.out.println();
		boolean r2 = negocio.agregarMaquina("Club", "Cerveza tipo exportación", 0.04);
		if(r2) {
			System.out.println("..........Máquina 2........... ");
			Maquina maquinaGuardada= negocio.getMaquinas().get(1);
			System.out.println("Codigo: " + maquinaGuardada.getCodigo());
		    System.out.println("Producto: " + maquinaGuardada.getNombreCerveza());
		    System.out.println("Precio por ml: $" + maquinaGuardada.getPrecioPorMl());
				
	        
			
		}
		System.out.println();
		System.out.println("Total de máquinas: " + negocio.getMaquinas().size());
       
	}

}
