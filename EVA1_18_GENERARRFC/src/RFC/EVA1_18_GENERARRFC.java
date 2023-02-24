package RFC;

public class EVA1_18_GENERARRFC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(RFC("IRAM","BALLESTEROS","MORALES","2004","12","26"));
		System.out.println(RFC("IRAM","BALLESTEROS","2004","12","26"));
		System.out.println(RFC("IRAM","2004","12","26"));
		RFC();
	}
	
	public static String RFC(String name, String fName, String sName, String Y, String M, String D) {
	
		return fName.charAt(0) + ""
		+ fName.charAt(1) + "" 
		+ sName.charAt(0) + "" 
		+ name.charAt(0) + "" 
		+ Y.charAt(2) + "" 
		+ Y.charAt(3) + "" 
		+ M + "" 
		+ D + "";
	}
	public static String RFC(String name, String fName, String Y, String M, String D) {
		
		return fName.charAt(0) + "" 
		+ fName.charAt(1) + "" 
		+ "X" + "" 
		+ name.charAt(0) + "" 
		+ Y.charAt(2) + "" 
		+ Y.charAt(3) + "" 
		+ M + "" 
		+ D + "";
	}
	public static String RFC(String name, String Y, String M, String D) {
		
		return "X" + "" 
		+ "X" + "" 
		+ "X" + "" 
		+ name.charAt(0) + "" 
		+ Y.charAt(2) + "" 
		+ Y.charAt(3) + "" 
		+ M + "" 
		+ D + "";
	}
	public static void RFC() {
		System.out.println("No se registraron datos");
	}
	
}
