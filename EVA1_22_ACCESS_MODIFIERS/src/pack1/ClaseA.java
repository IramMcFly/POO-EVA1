package pack1;

import pack2.ClaseE;

public class ClaseA {

	public int publicA;
	int defaultA;
	private int privateA;
	
	public void prueba() {
		ClaseB objB = new ClaseB();
		//objB.publicB; //ambos son visibles
		//objB.defaultB;
		
		ClaseC objC = new ClaseC();
		//objC.defaultC;
		//objC.publicC; //tambien son visibles
		
		//ClaseD es default pero esta en el mismo paquete
		ClaseD objD = new ClaseD();
		//objD.defaultD;
		//objD.publicD; public y default son visibles en el mimso paquete
		
		//hay que importar la clase desde el paquete 2 para usarla
		ClaseE objE = new ClaseE();
		//objE.publicE; solo es visible el publicE
		
		//clase F es default por lo que es invisible para las clases de este paquete
		
		//ClaseF objF = new ClaseF(); 
		
	}
}

class ClaseB{
	public int publicB; //visible a nivel universal
	int defaultB; //visible a nivel paquete
	private int privateB; //solo visible a nivel clase
}
