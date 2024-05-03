package ar.com.templateit.principal;

import java.util.Objects;

//esta clases sera la clase padre
public class Vehiculo { 
	
	private String marca; // atributo de la clase Vehículo (clase padre)
	
	//Constructor vacio
	public Vehiculo() {

	}
	

	// método de la clase Vehículo (clase padre)
	public void tocarBocina() {
		System.out.println("Tuuuttt, tuuut desde la clase padre......");
	}

	//getters y setters para acceder a los atributos ya que estan encapsulados
	//por la visibilidad private
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}


	@Override
	public int hashCode() {
		return Objects.hash(marca);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(marca, other.marca);
	}


	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + "]";
	}
	
	
	
}
