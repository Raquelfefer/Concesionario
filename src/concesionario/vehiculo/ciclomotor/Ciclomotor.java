package concesionario.vehiculo.ciclomotor;

import concesionario.vehiculo.Vehiculo;

public abstract class Ciclomotor extends Vehiculo{

	private int cilindrada;

	public Ciclomotor(String marca, String modelo, String matricula, int cilindrada) {
		super(marca, modelo, matricula);
		setCilindrada(cilindrada);
	}

	public int getCilindrada() {
		return this.cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "Ciclomotor [idVehiculo= " + getIdVehiculo() + ", marca= " + getMarca() + ", modelo= " + getModelo() + ", matricula= "
				+ getMatricula() + ", cilindrada= " + this.cilindrada + "]";
	}
	
	@Override
	public abstract void acelerar();
	
	
	
	
	
}
