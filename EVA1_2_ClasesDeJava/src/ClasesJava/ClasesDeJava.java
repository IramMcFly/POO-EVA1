package ClasesJava;

public class ClasesDeJava {

	public static void main(String[] args) {
		
		//instanciacion
		//1. Declarar el identificador del objeto
		//2. Asignar memoria con new
		//3. Invocar su constructor
		
		Persona perso1 = new Persona();
		Persona perso2 = new Persona();
		
		//zona de registro
		perso1.setNombre("Arnulfo");
		perso1.setApellido("Lopez S.");
		perso1.setEdad(67);
		perso1.setEstadoCivil(true);
		
		perso2.setNombre("Julian");
		perso2.setApellido("Garza Garcia");
		perso2.setEdad(63);
		perso2.setEstadoCivil(true);
				
		//Zona de salidas
		perso1.getDatos();
		perso2.getDatos();
	}
}
