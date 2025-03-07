package concesionario.vehiculo;

import java.util.ArrayList;

public abstract class Vehiculo {

	private int idVehiculo;
	private String marca;
	private String modelo;
	private String matricula;
	
	private static int ultimoIdVehiculo = 1;
	private static ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	
	public Vehiculo(String marca, String modelo, String matricula) {
		this.idVehiculo = ultimoIdVehiculo++;
		setMarca(marca);
		setModelo(modelo);
		setMatricula(matricula);
		vehiculos.add(this);
	}
	
	public int getIdVehiculo() {
		return this.idVehiculo;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public static int getUltimoIdVehiculo() {
		return ultimoIdVehiculo;
	}
	
	public static ArrayList<Vehiculo> getVehiculos(){
		return vehiculos;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public String toString() {
		return "Vehiculo [idVehiculo=" + idVehiculo + ", marca=" + marca + ", modelo=" + modelo + ", matricula="
				+ matricula + "]";
	}
	
	@Override
	public boolean equals(Object otro) {
		Vehiculo otroVehiculo = (Vehiculo) otro;
		boolean iguales;
		if(this.idVehiculo == otroVehiculo.idVehiculo) {
			iguales = true;
		}else {
			iguales = false;
		}
		return iguales;
	}
	

	public abstract void acelerar();
	
	
	
	
	
	
	
	
	
}
