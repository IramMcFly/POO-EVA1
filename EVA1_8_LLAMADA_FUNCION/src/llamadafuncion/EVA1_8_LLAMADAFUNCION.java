package llamadafuncion;

public class EVA1_8_LLAMADAFUNCION {

	public static void main(String[] args) {
		System.out.println("Estoy Arrancando en main");
		
		A();
		
		System.out.println("Termina main");
	}
	
	public static void A() {
		System.out.println("Estoy en A");
		B();
		System.out.println("Termina A");
	}
	public static void B() {
		System.out.println("Estoy en B");
		System.out.println("Termina B");
	}

}
