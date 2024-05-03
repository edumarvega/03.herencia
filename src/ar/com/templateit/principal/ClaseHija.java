package ar.com.templateit.principal;

//esta clase hija esta lista para usar los atributos y métodos 
//heredados de su clase padre.
public class ClaseHija extends ClasePadre{


	@Override
	void soyUnMetodoAbstracto() {
		System.out.println("Ejecutandose método abstracto heredado de la ClasePadre...");
	}

}
