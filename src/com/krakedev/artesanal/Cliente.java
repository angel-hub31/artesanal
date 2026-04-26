package com.krakedev.artesanal;
// tenemos la clase Cliente y sus atributos
public class Cliente {
	private String nombre;
	private String cedula;
	private int codigo;
	private double totalConsumido;
	
	//tenemos el constructor Cliente que tiene como parametros nombre y cedula
	public Cliente(String nombre,String cedula) {
		this.nombre=nombre;
		this.cedula=cedula;
		
	}
	
	//Tenemos los getters y setters de cada uno de los atributos
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getTotalConsumido() {
		return totalConsumido;
	}
	public void setTotalConsumido(double totalConsumido) {
		this.totalConsumido = totalConsumido;
	}
	

}
