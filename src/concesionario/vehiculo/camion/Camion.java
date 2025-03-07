package concesionario.vehiculo.camion;

import concesionario.vehiculo.Vehiculo;

public class Camion extends Vehiculo{

	private int capacidadCarga;

	public Camion(String marca, String modelo, String matricula, int capacidadCarga) {
		super(marca, modelo, matricula);
		setCapacidadCarga(capacidadCarga);
	}

	public int getCapacidadCarga() {
		return this.capacidadCarga;
	}

	public void setCapacidadCarga(int capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}

	@Override
	public String toString() {
		return "Camion [idVehiculo= " + getIdVehiculo() + ", marca= " + getMarca() + ", modelo= " + getModelo() + ", matricula= "
				+ getMatricula() + ", capacidad de carga= " + this.capacidadCarga + "]";
	}
	
	public void acelerar() {
		
	}
	
	
}
