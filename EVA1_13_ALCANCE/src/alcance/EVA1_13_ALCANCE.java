package alcance;


public class EVA1_13_ALCANCE {

	public static void main(String[] args) {
		
		int x = 100;// visible dentro de todo el main
		
		for(int i = 0; i<10; i++) {//se hace usable la i
			System.out.println("i: " + i);
			
			//System.out.println("j: " + j); aun no se crea J		
			int j = 100;
			System.out.println("j: " + j);
			
			System.out.println("x: " + x);
			
			{
				int z = 1000;
				System.out.println("z: " + z);
			}
			//System.out.println("z: " + z);//no se puede imprimir pues no z esta en otro bloque
		}
		
		//System.out.println(i + j); ya no existen estas variables despues del for
		//no estan declaradas en el bloque 
	}
	
	public static void metodo() {
		//System.out.println("x: " + x); // no se puede imprimir pues x no esta declarada en metodo()
		
	}
}