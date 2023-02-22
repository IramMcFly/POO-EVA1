package calificaciones;

import java.util.Scanner;

public class EVA1_12_Calificaciones {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese un calificacion: ");
		int grade = sc.nextInt();
		
		while(grade < 0 || grade > 100) {
			System.out.println("Esta calificacion no es valida, ingrese una nueva> ");
			grade = sc.nextInt();
		}
		
		System.out.println("Calificacion en Formato EEUU: " + checkCalificacion(grade));
		checkCalificacion(100); //ignora el resultado :)
	}
	
	public static char checkCalificacion(int grade) {
		
		if(grade >= 91 && grade <=100) {
			return 'A';
		}else if(grade <=90 && grade >= 81) {
			return 'B';
		}else if(grade <=80 && grade >= 71) {
			return 'C';
		}else{
			return 'D';
		}
	}
	

}
