package STATIC;


//algo que podemos usar sin crear instancias o una clase

public class EVA1_19_STATIC {

	public static void main(String[] args) {
		
		System.out.println("PI: " + Math.PI);
		System.out.println("Numero Aleatorio: " + Math.random());
		
		Utilerias utileria = new Utilerias();
		
		utileria.saludo();
		Utilerias.otroSaludo();
		
		//SaludoMain();
				
	}
	
	public void SaludoMain() {
		System.out.println("HOLA");
	}

}

class Utilerias{
	//ESTE EXISTE HASTA QUE SE CREA UN OBJETO DE LA CLASE
	//SOLO SE USA A TRAVES DE UN OBJETO
	public void saludo() {
		System.out.println("Hola!!");
	}
	
	//otroSaludo(); ESTE METODO EXISTE EN EL MOMENTO QUE EL
	//PROGRAMA INICIA SU EJECUCION. NO NECESITA QUE SE CREE
	//UN OBJETO DE LA CLASE PARA PODERLO UTILIZAR. SE USA A TRAVES DE LA CLASE
	public static void otroSaludo() {
		System.out.println("Otro Saludo (static)");
	}
}

//class OtherClass{} siempre se crean dentro del mismo archivo sin "public"