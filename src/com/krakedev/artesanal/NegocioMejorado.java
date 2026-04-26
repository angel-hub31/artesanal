package com.krakedev.artesanal;

import java.util.ArrayList;

public class NegocioMejorado {
	
	private ArrayList<Maquina>maquinas;
	private ArrayList<Cliente>clientes=new ArrayList<>();
	private int ultimoCodigo=0;
	
	

	public NegocioMejorado() {
		
		maquinas = new ArrayList<Maquina>();
	}
	
	public ArrayList<Cliente> getClientes() {
        return clientes;
    }

	
	public  String generarCodigo() {
		int numeroAletorio=(int) (Math.random()*100)+1;
		return "M-"+numeroAletorio;
		
		
	}
	
	public boolean agregarMaquina(String nombreCerveza, String descripcion, double precioPorMl) {
	    String codigoGenerado = generarCodigo();
	 //Usamos recuperarMaquina para ver si ese código ya existe en la lista
	    Maquina maquinaExistente = recuperarMaquina(codigoGenerado);
	 // Validación de duplicados
	    if (maquinaExistente== null) {
	    	// Si es null, el código es nuevo y podemos agregar la máquina
	        Maquina nuevaMaquina = new Maquina(codigoGenerado, nombreCerveza, descripcion, precioPorMl);
	        maquinas.add(nuevaMaquina);
	        return true; 
	    } else {
	    	// Si no es null, el código ya existe. No agregamos nada
	        return false; 
	    }
	}
	
	public void cargarMaquina() {
		for (int i = 0; i < maquinas.size(); i++) {
	        Maquina m = maquinas.get(i);
	        m.llenarMaquina();
	    }
		
	}
	
	public Maquina recuperarMaquina(String codigo) {
	    Maquina maquinaEncontrada = null;
	    
	    for (int i = 0; i < maquinas.size(); i++) {
	        Maquina m = maquinas.get(i);
	        
	        if (codigo.equals(m.getCodigo())) {
	            maquinaEncontrada = m;
	            break; 
	        }
	    }
	    
	    return maquinaEncontrada; 
	}
	
	
	// parte 2 paso 9
	public void registrarCliente(String nombre,String cedula) {
		ultimoCodigo++;
		Cliente nuevoCliente=new Cliente(nombre,cedula);
		nuevoCliente.setCodigo(ultimoCodigo);
		clientes.add(nuevoCliente);
	}
	
	
	
	
	
	public Cliente buscarClientePorCedula(String cedula) {
	    Cliente clienteEncontrado = null;
	    
	    for (int i = 0; i < clientes.size(); i++) {
	        Cliente c = clientes.get(i);
	        
	        if (cedula.equals(c.getCedula())) {
	            clienteEncontrado = c;
	            break;
	        }
	    }
	    
	    return clienteEncontrado;
	}
	
	public Cliente buscarClientePorCodigo(int codigo) { 
	    Cliente clienteEncontrado = null;
	    for (int i = 0; i < clientes.size(); i++) {
	        Cliente c = clientes.get(i);
	        if (codigo == c.getCodigo()) { 
	            clienteEncontrado = c;
	            break;
	        }
	    }
	    return clienteEncontrado;
	}
	
	public void consumirCerveza(String codigoMaquina, int codigoCliente, double ml) {
	    Maquina maquina = recuperarMaquina(codigoMaquina);
	    Cliente cliente = buscarClientePorCodigo(codigoCliente);

	    if (maquina != null && cliente != null) {
	        double valorConsumido = maquina.servirCerveza(ml);
	        registrarConsumo(cliente, valorConsumido);
	        System.out.println("Cliente :"+cliente.getNombre());
	    } else {
	        System.out.println("Máquina o Cliente no encontrados.");
	    }
	}
	
	public void registrarConsumo(Cliente cliente, double valor) {
	    double totalAnterior = cliente.getTotalConsumido();
	    double nuevoTotal = totalAnterior + valor;
	    cliente.setTotalConsumido(nuevoTotal);
	}
	
	
	public ArrayList<Maquina> getMaquinas() {
		return maquinas;
	}

	public void setMaquinas(ArrayList<Maquina> maquinas) {
		this.maquinas = maquinas;
	}
	
	public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
	
}
