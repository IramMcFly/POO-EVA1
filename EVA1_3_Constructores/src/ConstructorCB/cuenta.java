package ConstructorCB;

public class cuenta {

	//llenado de datos
	private String titular;
	private String nDcuenta ;
	private double saldo;
	
	//constructores
	//defalt y con argumentos 
	public cuenta() {//default
		nDcuenta = "0";
		saldo = 0;
		titular = "";
	}
	
	public cuenta(String ncuenta, double sald, String nomCliente){
		nDcuenta = ncuenta;
		saldo = sald;
		titular = nomCliente;
	}
	
	
	//metodos set y get
	public String getTitular(){
		return titular;
	}
	public void setTitular(String name) {
		titular = name;
	}
	
	public String getNDCuenta() {
		return nDcuenta;
	}
	public void setNDCuenta(String Ndcuenta) {
		nDcuenta = Ndcuenta; 
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldazo) {
		saldo = saldazo;
	}

	
	//zona de impresion
	public void getData() {
		System.out.println("Titular de la cuenta: " + titular);
		System.out.println("Numero de cuenta: " + nDcuenta);
		System.out.println("Saldo: $" + saldo);
	}
	
	/*Zona de impresion con pass
	public void getData(int pass) {
		if(pass == 5566) {
			System.out.println("Titular de la cuenta: " + titular);
			System.out.println("Numero y tipo de cuenta: " + nDcuenta);
			System.out.println("Saldo: " + saldo);
		}else {
			System.out.println("La contrasena no es correcta, intentelo en 5 minutos.");
		}
	}
	*/
}