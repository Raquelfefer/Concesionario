package concesionario.vehiculo.coche;

import concesionario.vehiculo.Vehiculo;

public abstract class Coche extends Vehiculo{

	private TipoCombustible combustible;

	public Coche(String marca, String modelo, String matricula, String combustible) {
		super(marca, modelo, matricula);
		setCombustible(combustible);
	}

	public String getCombustible() {
		return combustible.toString();
	}

	public void setCombustible(String combustible) {
		this.combustible = TipoCombustible.valueOf(combustible);
	}
	
	
	
	
}
