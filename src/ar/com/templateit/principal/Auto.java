package ar.com.templateit.principal;

// La clase hija Auto hereda atributos y metodos de la clase padre Vehiculo
// para esto se utiliza la palabra reservada extends

public class Auto extends Vehiculo{
	
	private String modelo; //se encapsula el atributo para resguardar la informacion y solo acceder por set o get

	//Constructor vacio cuando se incializa un objeto de esta clase
	//se llamara a este constructor con ... new Auto()
	public Auto() {

	}

	//getters y setters para acceder a los atributos ya que estan encapsulados
	//por la visibilidad private
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	//aqui se hace el polimorfismo ya que sobre escribimos el metodo
	// tocarBocina de la clase padre Vehiculo
	@Override
	public void tocarBocina() {
		System.out.println("Tuuuttt, tuuut desde la clase hija......");
	}
	
	
	
	
	
}
