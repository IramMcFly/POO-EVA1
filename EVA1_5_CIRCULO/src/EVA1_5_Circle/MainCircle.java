package EVA1_5_Circle;

import java.lang.Math;
import java.util.Scanner;

public class MainCircle {

	public static void main(String[] args) {
		
		//scanner
		Scanner sc = new Scanner(System.in);
		
		//crear cicrulos
		circulo circulo1 = new circulo();
		
		System.out.print("Ingrese el radio del circulo: ");
		double rad = sc.nextDouble();
		
		circulo1.setRadio(rad);
		
		System.out.println("El area del circulo es: " + circulo1.getArea());
		System.out.println("El Perimetro del circulo es: " + circulo1.getPerimetro());
		System.out.println("El Diametro del circulo es: " + circulo1.getDiametro());
	}

}
