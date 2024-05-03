package ar.com.templateit.principal;

//una clase que se declara como abstract no puede ser
//instanciada, es decir no se pueden crear objetos de esta clase
public abstract class ClasePadre {

	//este método tiene sentido si todos sus hijos van a necesitar 
	//la funcionalidad de este método caso contrario si no 
	//se instancia al padre por ser abstracto
	//se sobreescribe en cada hijo y se pone su propia logica
	public void soyUnMetodoPublico() {
		System.out.println("Ejecutandose método public de la clase Padre");
	}
	
	abstract void soyUnMetodoAbstracto();
}
