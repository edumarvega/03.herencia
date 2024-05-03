package ar.com.templateit.principal;

public class Principal {

	public static void main(String[] args) {
		
					
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.tocarBocina();
		
		Auto auto1 = new Auto(); // se instancia/crea un objeto de tipo Auto
	
		auto1.setMarca("Ford"); // se actualiza el valor de la marca utilizando el m�todo heredado de la clase padre Veh�culo.
		auto1.setModelo("RAM"); // se actualiza el valor del modelo utilizando el m�todo de la clase hija Auto.
		
		//se llama al m�todo heredado de la clase padre Veh�culo
		auto1.tocarBocina(); 
		
		Auto auto2 = new Auto(); // se instancia/crea un objeto de tipo Auto
		
		auto2.setMarca("Ford"); // se actualiza el valor de la marca utilizando el m�todo heredado de la clase padre Veh�culo.
		auto2.setModelo("RAM"); // se actualiza el valor del modelo utilizando el m�todo de la clase hija Auto.
		
		//se llama al m�todo heredado de la clase padre Veh�culo
		auto2.tocarBocina(); 
		
		
		System.out.println("La marca del auto es: "+auto1.getMarca()); //se llama al m�todo heredado de la clase padre Veh�culo.
		System.out.println("El modelo del auto es: "+auto1.getModelo()); //se llama al m�todo de la clase hija Auto.
				
		
			
		ClasePadre objeto = new ClaseHija();
		objeto.soyUnMetodoPublico();
		objeto.soyUnMetodoAbstracto();
		
	}
}
