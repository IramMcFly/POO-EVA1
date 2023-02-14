package EVA1_4_tv;

public class TV {

	//zona de datos
	private int volumen;
	private int canal;
	private boolean power;
	
	//constructores
	public TV(){
		volumen = 0;
		canal = 0;
		power = false;	//apagado
	}
	
	public void setPower(){
		if(power){
			power = false;
			System.out.println("Apagando pantalla");
		}else{
			power = true;
			System.out.println("Encendiendo...");
		}
	}
	
	public void volplus() {
		if(power){
			if(volumen<100) {
				volumen++;
				System.out.println("Volumen actual: " + volumen);
			}else {
				System.out.println("Volumen actual: " + volumen);
			}
		}
	}
	public void volmin() {
		if(power){
			if(volumen>1) {
				volumen--;
				System.out.println("Volumen actual: " + volumen);
			}else{
				System.out.println("Volumen actual: " + volumen);
			}
		}
	}
	
	public void chanNext() {
		if(power) {
			canal++;
			if(canal>100) {
				canal = 0;
			}
			System.out.println("Canal actual: " + canal);
		}
	}
	public void chanPrev() {
		if(power) {
			canal--;
			if(canal<0){
				canal = 100;
			}
			System.out.println("Canal actual: " + canal);
		}
	}
	
	
}