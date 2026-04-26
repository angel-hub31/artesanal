package com.krakedev.artesanal.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Maquina;
import com.krakedev.artesanal.NegocioMejorado;

public class TestConsultarValoresVendidos {
	@Test
    public void testConsultarValoresTotales() {

        NegocioMejorado n = new NegocioMejorado();

        // 1. Agregar máquina
        n.agregarMaquina("Pilsener", "Rubia", 0.02);
        n.cargarMaquina();

        // Obtener máquina
        Maquina m = n.getMaquinas().get(0);

        // 👇 Mostrar en consola (opcional en JUnit)
        System.out.println("Producto: " + m.getNombreCerveza());
        System.out.println("Codigo: " + m.getCodigo());

        // 2. Registrar cliente
        n.registrarCliente("Juan", "0101");
        int codigoCliente = n.getClientes().get(0).getCodigo();

        // 3. Consumir cerveza
        n.consumirCerveza(m.getCodigo(), codigoCliente, 100);

        // 4. Verificar total
        double total = n.consultarValoresTotales();

        // 5. Validación (100 ml * 0.02 = 2.0)
        assertEquals(2.0, total, 0.0001);
    }

}
