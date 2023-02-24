package Sobrecarga;

public class EVA1_16_SOBRECARGA2 {

	public static void main(String[] args) {
		
		System.out.println(suma(1,1));
		System.out.println(suma(1.333,1.908987));
		System.out.println(suma("polo"," polo"));
		suma();
	}
	
	public static int suma(int num, int num1) {
		return num + num1;
	}
							//suma (double,double){}
	public static double suma(double num, double num1) {
		return num + num1;
	}
	
	public static String suma(String n, String m) {
		return n + m;
	}
	
	public static void suma() {
		System.out.println("Metodo sin parametros");
	}

}
