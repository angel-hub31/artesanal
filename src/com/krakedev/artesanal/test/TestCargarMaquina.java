package com.krakedev.artesanal.test;

import com.krakedev.artesanal.NegocioMejorado;

public class TestCargarMaquina {

	public static void main(String[] args) {
		NegocioMejorado negocio = new NegocioMejorado();

		String codigo1 = negocio.generarCodigo();
		System.out.println("Código: " + codigo1);

		negocio.agregarMaquina("Pilsener", "Cerveza amarga ", 0.08);
		negocio.agregarMaquina("Club", "Cerveza negra ", 0.10);

		int totalMaquinas = negocio.getMaquinas().size();
		System.out.println("Total de máquinas en la lista: " + totalMaquinas);

		negocio.cargarMaquina();

	}
}
