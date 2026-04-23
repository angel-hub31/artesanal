package com.krakedev.artesanal.testJUnit;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import com.krakedev.artesanal.Maquina;

public class TestServirCervezaAI {
	private static final double TOLERANCIA = 0.0001;

    /**
     * Caso: La máquina tiene suficiente cerveza
     * Se debe servir correctamente, descontar la cantidad y retornar el valor correcto
     */
    @Test
    public void testServirCervezaCorrectamente() {
        Maquina maquina = new Maquina("Pilsener", "Rubia", 0.05, 1000);

        maquina.recargarCerveza(500); // cantidad actual = 500

        double valor = maquina.servirCerveza(200);

        // Verifica el valor retornado (200 * 0.05)
        assertEquals(10.0, valor, TOLERANCIA);

        // Verifica que se descontó la cantidad correctamente (500 - 200)
        assertEquals(300, maquina.getCantidadActual(), TOLERANCIA);
    }

    /**
     * Caso: No hay suficiente cerveza
     * No debe servir nada, no debe cambiar la cantidad y debe retornar 0
     */
    @Test
    public void testNoServirPorFaltaDeCerveza() {
        Maquina maquina = new Maquina("Pilsener", "Rubia", 0.05, 1000);

        maquina.recargarCerveza(100); // cantidad actual = 100

        double valor = maquina.servirCerveza(200);

        // No debe cobrar nada
        assertEquals(0, valor, TOLERANCIA);

        // La cantidad no debe cambiar
        assertEquals(100, maquina.getCantidadActual(), TOLERANCIA);
    }

    /**
     * Caso: Se sirve exactamente toda la cerveza disponible
     * Debe quedar en 0 y retornar el valor correcto
     */
    @Test
    public void testServirCantidadExacta() {
        Maquina maquina = new Maquina("Pilsener", "Rubia", 0.1, 1000);

        maquina.recargarCerveza(300); // cantidad actual = 300

        double valor = maquina.servirCerveza(300);

        // Verifica valor (300 * 0.1)
        assertEquals(30.0, valor, TOLERANCIA);

        // Debe quedar en 0
        assertEquals(0, maquina.getCantidadActual(), TOLERANCIA);
    }

    /**
     * Caso: Intentar servir cuando la máquina está vacía
     * No debe servir nada ni modificar estado
     */
    @Test
    public void testServirConMaquinaVacia() {
        Maquina maquina = new Maquina("Pilsener", "Rubia", 0.05, 1000);

        double valor = maquina.servirCerveza(100);

        // No debe cobrar nada
        assertEquals(0, valor, TOLERANCIA);

        // Sigue en 0
        assertEquals(0, maquina.getCantidadActual(), TOLERANCIA);
    }

    /**
     * Caso: Usando el segundo constructor (capacidad por defecto)
     * Verifica que también funciona correctamente
     */
    @Test
    public void testServirConConstructorSinCapacidad() {
        Maquina maquina = new Maquina("IPA", "Amarga", 0.08);

        maquina.recargarCerveza(500);

        double valor = maquina.servirCerveza(100);

        // Verifica valor (100 * 0.08)
        assertEquals(8.0, valor, TOLERANCIA);

        // Verifica que se descontó correctamente
        assertEquals(400, maquina.getCantidadActual(), TOLERANCIA);
    }

    /**
     * Caso: Intentar servir más de lo disponible
     * No debe modificar la cantidad ni cobrar
     */
    @Test
    public void testServirMasDeLoDisponible() {
        Maquina maquina = new Maquina("Stout", "Negra", 0.07, 1000);

        maquina.recargarCerveza(250);

        double valor = maquina.servirCerveza(300);

        // No debe cobrar
        assertEquals(0, valor, TOLERANCIA);

        // No debe cambiar la cantidad
        assertEquals(250, maquina.getCantidadActual(), TOLERANCIA);
    }

}
