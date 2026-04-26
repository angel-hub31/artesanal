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
	public ArrayList<Maquina> getMaquinas() {
		return maquinas;
	}

	public void setMaquinas(ArrayList<Maquina> maquinas) {
		this.maquinas = maquinas;
	}
	
}
