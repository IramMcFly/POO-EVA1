package pack1;

import pack2.ClaseE;

public class ClaseC {
	public int publicC;
	int defaultC;
	private int privateC;
	
	
	public void prueba() {
		
		//ClaseB es default pero esta en el mismo paquete
		ClaseB objB = new ClaseB();
		//objB.publicB; //ambos son visibles
		//objB.defaultB;
		
		//claseA es publica 
		ClaseA objA = new ClaseA();
		//objC.defaultA;
		//objC.publicA; //tambien son visibles
		
		//claseD es default y esta en el mismo paquete
		ClaseD objD = new ClaseD();
		//objD.defaultD;
		//objD.publicD; public y default son visibles en el mimso paquete
		
		
		//hay que importar la clase desde el paquete 2 para usarla
		ClaseE objE = new ClaseE();
		//objE.publicE; solo es visible el publicE
		
		//clase F es default por lo que es invisible para las clases de este paquete
		
		//ClaseF objF = new ClaseF(); 
		
	};
	
}

class ClaseD{
	public int publicD;
	int defaultD;
	private int privateD;
	
}