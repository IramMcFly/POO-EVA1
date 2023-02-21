package EVA1_6_AUTO;

public class auto {

	private String placa;
	private int ano;
	private String marca;
	private String dueno;
	private String modelo;
	private int adeudo;
	
	//default
	public auto() {
		placa = "----";
		ano = 0000;
		marca = "----";
		dueno = "----";
		modelo = "----";
	}
	public auto(String plac, int anio, String mark, String duen, String model) {
		placa = plac;
		ano = anio;
		marca = mark;
		dueno = duen;
		modelo = model;
	}
	
	
	//metodos set
	public void setAno(int anio) {
		ano = anio;
	}
	public void setPlaca(String Plac){
		placa = Plac;
	}
	public void setMarca(String marc) {
		marca = marc;
	}
	public void setDueno(String duen) {
		dueno = duen;
	}
	public void setModelo(String model) {
		modelo = model;
	}
	
	//metodos get
	public String getPlaca() {
		return placa;
	}
	public int getAno() {
		return ano;
	}
	public String getMarca() {
		return marca;
	}
	public String getDueno() {
		return dueno;
	}
	public String getModelo() {
		return modelo;
	}
	
	//calcular adeudo
	public int calcularAdeudo() {
		adeudo = 0;
		if(ano<=2000 && ano>1900) {
			adeudo = 1500;
		}else if(ano >=2001 && ano<=2005) {
			adeudo = 2000;
		}else if(ano >=2006 && ano<=2010){
			adeudo = 2500;
		}else if(ano>=2011 && ano<=2015){
			adeudo =  3000;
		}else if(ano > 2015) {
			adeudo = 4000;
		}
		
		return adeudo;
		
	}
	
	//zona de impresion
	public void getData(){
		System.out.println("Placa: "  + placa);
		System.out.println("Anio: " + ano);
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Duenio: " + dueno);
		System.out.println("Adeudo total: " + calcularAdeudo());
		
		
	}
	
	
	
	
}
