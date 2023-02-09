package ClasesJava;

public class Persona {
		
	private String nombre; 
	private String apellido;
	private int edad;
	private boolean estadoCivil;
	
	//METODOS; comportamiento
	//lectura y escritura de atributos
	//metodos get --> leer, metodo set --> escribir
	//metodos: 
	//modificador, valor de retorno, nombre,(argumentos), {implementacion}
	
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String name){
		nombre = name;
	}
	
	public String getApellido(){
		return apellido;
	}
	public void setApellido(String lastName) {
		apellido = lastName;
	}
	
	public int getEdad(){
		return edad;
	}
	public void setEdad(int age) {
		edad = age;
	}
	
	public boolean getEstadoCivil(){
		return estadoCivil;
	}
	public void setEstadoCivil(boolean sEC){
		estadoCivil = sEC;
	}
	
	public void getDatos(){
		//devuelve todos los datos guardados
		System.out.println("Nombre completo: " + " " + nombre + " " + apellido);
		System.out.println("Edad: " + edad);

		if(estadoCivil){
			System.out.println("Estado civil: Casado");
		}else{
			System.out.println("Estado civil: Soltero");
		}
	}
	
	
}
