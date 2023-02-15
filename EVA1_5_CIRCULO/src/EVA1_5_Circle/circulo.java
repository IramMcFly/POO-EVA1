package EVA1_5_Circle;

public class circulo {
	
	//atribs
	private double Area;
	private double Perimetro;
	private double Radio;
	

	//constructores
	public circulo () {
		Area = 0;
		Perimetro = 0;
		Radio = 0;
	}
	public circulo(double radio) {
		Radio = radio;
	}
	
	//establecer radio
	public void setRadio(double r) {
		Radio = r;
	}
	
	//zona de devoluciones
	public double getArea() {
		return Area = Math.PI * Math.pow(Radio,2);
	}
	public double getPerimetro() {
		return Perimetro = Math.PI * (Radio*2);
	}
	public double getDiametro() {
		return Radio*2;
	}
	
	
	
	
	
	
}
