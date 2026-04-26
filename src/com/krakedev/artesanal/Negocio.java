package com.krakedev.artesanal;
// tenemos la clase Negocio y sus atributos 
public class Negocio {
	private String nombre;
	//
	private Maquina maquinaA;
	// Un contador que inicia en 100
	private int ultimoCodigo=100;
	
	
	public Negocio() {
		
	}

	public Negocio(String nombre, Maquina maquinaA) {
		this.nombre = nombre;//Guarda el nombre que le pases al crear el negocio
		this.maquinaA = maquinaA;//Conecta una máquina específica a este negocio
	}
	
	//tenemos los getters y setters  de nombre y maquina

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Maquina getMaquinaA() {
		return maquinaA;
	}

	public void setMaquinaA(Maquina maquinaA) {
		this.maquinaA = maquinaA;
	}
	
	// metodo asignarCodigoCliente
	
	public void asignarCodigoCliente(Cliente cliente) {
		cliente.setCodigo(ultimoCodigo);// Toma al cliente y le pone el número 100.
		ultimoCodigo++;// Suma 1 al contador (ahora vale 101) para el PRÓXIMO cliente.
		
	}
	//metodo cargarMaquinaA
	public void cargarMaquinaA() {
		maquinaA.llenarMaquina();
	}
	 //metodo consumirCervezaMaquinaA
	public void consumirCervezaMaquinaA(Cliente cliente, double ml) {
		//  Le pide a la máquina que sirva los ml y guarde cuánto costó en 'valor'
		double valor=maquinaA.servirCerveza(ml);
		//  Le suma ese costo a lo que el cliente ya debía 
	    // trae la deuda anterior y
	    // guarda la nueva deuda total + valor 
		cliente.setTotalConsumido(cliente.getTotalConsumido()+valor);
	}

}
