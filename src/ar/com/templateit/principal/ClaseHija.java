package ar.com.templateit.principal;

//esta clase hija esta lista para usar los atributos y m�todos 
//heredados de su clase padre.
public class ClaseHija extends ClasePadre{


	@Override
	void soyUnMetodoAbstracto() {
		System.out.println("Ejecutandose m�todo abstracto heredado de la ClasePadre...");
	}

}
