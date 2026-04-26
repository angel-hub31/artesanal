package com.krakedev.artesanal;

import java.util.ArrayList;

public class NegocioMejorado {
	
	private ArrayList<Maquina>maquinas;
	
	

	public NegocioMejorado() {
		
		maquinas = new ArrayList<Maquina>();
	}

	
	public  String generarCodigo() {
		int numeroAletorio=(int) (Math.random()*100)+1;
		return "M-"+numeroAletorio;
		
		
	}
	
	public void agregarMaquina(String nombreCerveza,String descripcion,double precioPorMl) {
		String codigoGenerado=generarCodigo();
		Maquina nuevaMaquina=new Maquina(codigoGenerado,nombreCerveza,descripcion,precioPorMl);
		this.maquinas.add(nuevaMaquina);
		
	}
	
	
	public ArrayList<Maquina> getMaquinas() {
		return maquinas;
	}

	public void setMaquinas(ArrayList<Maquina> maquinas) {
		this.maquinas = maquinas;
	}
	
}
