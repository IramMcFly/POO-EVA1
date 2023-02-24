package SOBRECARGAAREAS;

import java.util.Scanner;
import java.math.*;

public class EVA1_17_SOBRECARGAAREAS {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Area del circulo: " + area(3));
		System.out.println("Area del triangulo: " + area(3,4));
		System.out.println("Area del Trapecio: " + area(3,9,8));
		area();
	}
	public static double area(double r) {
		return Math.PI * Math.pow(r, 2);
	}
	
	public static double area(double b, double h) {
		return (b * h) / 2;
	}
	
	public static double area(double h, double B, double b) {
		return (h*(B+b))/2;
	}
	
	public static void area() {
		System.out.println("Metodo sin parametros");
	}
}
