package pack2;

import pack1.ClaseA;
import pack1.ClaseC;

public class ClaseE {
	public int publicE;
	int defaultE;
	private int privateE;
	
	public void prueba() {
		
		//ClaseF es default pero esta en el mismo paquete
		ClaseF objF = new ClaseF();
		//objB.publicF; //ambos son visibles
		//objB.defaultF;
		
		ClaseA objA = new ClaseA();
		//objA.publicA //solo es visible el publicA
		
		//hay que importar C desde el paquete 1
		ClaseC objC = new ClaseC();
		//objC.publiC //solo es visibe esta variable
		
		//ClaseB objB = new ClaseB no es posible pues ClaseB es default
		//ClaseD tampoco es posible
	}

}

class ClaseF{
	public int publicF;
	int defaultF;
	private int privateF;
	
}
