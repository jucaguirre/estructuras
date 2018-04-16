package bioInformatica;

import java.util.Random;

public class bioInfo {
	
	
	public static String aminoacido () {
		
		Random rd = new Random ();
		
		switch (rd.nextInt(4)) {
			case 0: return "A";
			case 1: return "G";
			case 2: return "C";
			case 3: return "T";
			default: return "";
	}}
	
	public static String sequense (int n) {
		
		if(n == 0) {
			return aminoacido();
	} else {
			return aminoacido() + sequense(n-1);
		}
		
	}
	
	public static String chromosoma () {
		
		Random rd = new Random();
		return ("chr" + (rd.nextInt(23)+1)); 
		
	}
	
	public void save ()
	{
		
		
	}

	public static void main(String[] args) {
		
		Random rd = new Random();

		System.out.println(sequense(rd.nextInt(10)) + " " + chromosoma());
	
	}

}
