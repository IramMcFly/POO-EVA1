package ConstructorCB;

import java.util.Scanner;

public class CuentaBancaria {

	public static void main(String[] args) {
		
		/*password sys 
		Scanner sc = new Scanner(System.in);
		int password = 0;
		*/
		
		//creacion de cuentas
		cuenta cuenta1 = new cuenta("224635274" , 4000231.32 , "Carlos Salinas de Gortari");
		cuenta cuenta2 = new cuenta("237554636" , 41.45 , "Iram Ballesteros" );
		cuenta cuenta3 = new cuenta();
		
		/*llenado de datos 
		cuenta1.setTitular("Brandon Chavez Sosa");
		cuenta1.setNDCuenta("400833222");
		cuenta1.setSaldo(1928.23);
		*/
		
		//salida de datos
		cuenta1.getData();
		System.out.println("");
		cuenta2.getData();
		System.out.println("");
		cuenta3.getData();
		/* sistema de contrasenas sin terminar
		System.out.println("Ingrese su PIN: ");
		password = sc.nextInt();
		
		cuenta1.getData(password);
		*/
		
	}

}
