package STATIC2;

public class FormulasGeometria {

	
	//final > para clases
	//		> para variables: SOLO PUEDEN ASIGNAR UNA VEZ 
	//		  UN VALOR A LA VARIABLE
	public static final double PI = 3.14159;
	
	//area
	public static double areaTriangle(double b, double h) {
		
		return ((b*h) / 2);
	}
	public static double areaCircle(int r) {
		return (PI * (r*r)); 
	}
	
	//perimetro
	public static double PerimetroCirculo(double r) {
		return (PI * (r * 2));
	}
	
	//volumen
	public static double volumenEsfera(double r) {
		return ((4.0/3.0)*PI*(r*r*r));
	}
}
