package com.krakedev.artesanal.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Cliente;
import com.krakedev.artesanal.Maquina;
import com.krakedev.artesanal.NegocioMejorado;

public class TestConsumirCervezaJUnit {
	 @Test
	 public void testConsumirCerveza() {
	        // Crear negocio
	        NegocioMejorado n = new NegocioMejorado();

	        // Agregar máquina
	        n.agregarMaquina("Pilsener", "Rubia", 0.02);

	        // Obtener máquina creada
	        Maquina m = n.getMaquinas().get(0);

	        // Llenar máquina
	        m.llenarMaquina();
	        double cantidadInicial = m.getCantidadActual();

	        // Registrar cliente
	        n.registrarCliente("Juan", "123");
	        Cliente c = n.buscarClientePorCedula("123");

	        // Consumir cerveza (100 ml)
	        n.consumirCerveza(m.getCodigo(), c.getCodigo(), 100);

	        // 1. Cliente actualizado
	        double esperado = 100 * m.getPrecioPorMl();
	        assertEquals(esperado, c.getTotalConsumido(), 0.001);

	        // 2. Máquina afectada (se reduce la cantidad)
	        assertEquals(cantidadInicial - 100, m.getCantidadActual(), 0.001);

	        // 3. Valores correctos (doble validación del precio)
	        assertEquals(2.0, c.getTotalConsumido(), 0.001); // 100 * 0.02
	    


}
}
