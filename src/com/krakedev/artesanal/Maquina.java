package com.krakedev.artesanal;

//definicion de Clase y atributos
public class Maquina {
	private String nombreCerveza;
	private String descripcionCerveza;
	private String codigo;
	private double precioPorMl;
	private double capacidadMaxima;
	private double cantidadActual;

//constructores
	public Maquina(String codigo, String nombreCerveza, String descripcionCerveza, double precioPorMl,double capacidadMaxima) {
		this.codigo = codigo;
		this.nombreCerveza = nombreCerveza;
		this.descripcionCerveza = descripcionCerveza;
		this.precioPorMl = precioPorMl;
		this.capacidadMaxima = capacidadMaxima;
		// la mquina inicia vacia
		this.cantidadActual = 0;
	}

	// constructores
	public Maquina(String codigo, String nombreCerveza, String descripcionCerveza, double precioPorMl) {
		this.codigo = codigo;
		this.nombreCerveza = nombreCerveza;
		this.descripcionCerveza = descripcionCerveza;
		this.precioPorMl = precioPorMl;
		// se asigna 10000 ml
		this.capacidadMaxima = 10000;
		// la mquina inicia vacia

		this.cantidadActual = 0;
	}

	// getters y setters (accede y modifica atributos

	public String getNombreCerveza() {
		return nombreCerveza;
	}

	public void setNombreCerveza(String nombreCerveza) {
		this.nombreCerveza = nombreCerveza;
	}

	public String getDescripcionCerveza() {
		return descripcionCerveza;
	}

	public void setDescripcionCerveza(String descripcionCerveza) {
		this.descripcionCerveza = descripcionCerveza;
	}

	public double getPrecioPorMl() {
		return precioPorMl;
	}

	public void setPrecioPorMl(double precioPorMl) {
		this.precioPorMl = precioPorMl;
	}

	public double getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public double getCantidadActual() {
		return cantidadActual;
	}

	public String getCodigo() {
		return codigo;
	}

//metodo imprimir: construye un mensaje con todos los datos
	public void imprimir() {
		String mensaje;

		mensaje = "Codigo: " + codigo + ",Nombre cerveza:" + nombreCerveza + ", Descripcion:" + descripcionCerveza
				+ ",Precio por Ml:" + precioPorMl + ", Capacidad Maxima:" + capacidadMaxima + ", Capacidad Actual:"
				+ cantidadActual;
		// imprime el mensaje en consola
		System.out.println(mensaje);

	}
<<<<<<< HEAD
	public void llenarMaquina(){
		this.cantidadActual = this.capacidadMaxima-100;
		
	}
	
	public boolean recargarCerveza(double cantidad) {
		
		double limitePermitido;
		limitePermitido=capacidadMaxima-100;
		if(cantidadActual + cantidad <= limitePermitido) {
			cantidadActual=cantidadActual + cantidad;
			return true;
			
			
		}else {
			return false;
		}
		
	}
	public double servirCerveza(double cantidad) {
		if(cantidadActual >=cantidad) {
			cantidadActual=cantidadActual-cantidad;
			
			double valor;
			valor =cantidad*precioPorMl;
			return valor;
			
		}else {
			System.out.println("limite excedido");
			return 0;
		}
		
		
=======

	// metodo llenar maquina: llena la maquina y deja un margen de 200 ml
	// simula el espacio de seguridad y evita el desbordamiento
	public void llenarMaquina() {
		this.cantidadActual = this.capacidadMaxima - 200;

>>>>>>> 52ef7c801315c39d589e7ac619ae39e7e854865c
	}

	// metodo booleano recargar cerveza: agrega mas cerveza
	public boolean recargarCerveza(double cantidad) {

		double limitePermitido;
		// define el maximo permitido, similar que el metodo llenar maquina
		limitePermitido = capacidadMaxima - 200;
		// si no se pasa del limite se recarga correctamente
		if (cantidadActual + cantidad <= limitePermitido) {
			cantidadActual = cantidadActual + cantidad;
			return true;

		} else {
			// si se pasa del limite no carga
			return false;
		}

	}

	// metodo booleano servir cerveza: sirve cerveza al cliente
	public double servirCerveza(double cantidad) {

		if (cantidadActual >= cantidad) {
			// si hay suficiente cerveza se descuenta la cantidad
			cantidadActual = cantidadActual - cantidad;
            // devuelve el costo total
			double valor;
			valor = cantidad * precioPorMl;
			return valor;

		} else {
			System.out.println("no se puede servir, capacidad al maximo");
			return 0;
		}
	}
}
