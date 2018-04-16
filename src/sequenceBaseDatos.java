import java.util.Random;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/*
 * calse con metodos para generar secuencias de adn con la etructura creada
 * la estructura es cadena ¬¬
 * */


public class sequenceBaseDatos {

	public  String aminoacido () 
	{
		Random rd = new Random();
		
		switch (rd.nextInt(4)) {
			case 1: return "A";
			case 2:	return "C";
			case 3: return "G";
			case 4:	return "T";
			default: return "";
		}
		
	}
	
	public  String seq (int n) 
	{
		
		if (n==0) {
			return aminoacido();
		}else {
			
			return aminoacido() + seq(n-1);
		}
		
	}
	
	public  String chromosoma () {
		
		Random rd = new Random();
		return ("Chr" + (rd.nextInt(23)+1));
		
	}
	
	public File guardar (int tamaño) 
	{
		
		try {
			
			File archivo = new File("baseDatos.txt");
			BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
			for(int i = 0; i < tamaño; i++) {
				Random rd = new Random();
				int inicio, fin;
				inicio = rd.nextInt(1000);
				String cadena = new String();
				cadena = seq(rd.nextInt(100));
				fin = inicio + cadena.length();
			

				bw.write(cadena + "," + chromosoma() + "," + inicio + "," + fin  );
				bw.newLine();
				
			}
			
			System.out.println("guardado!");
			bw.flush();
			bw.close();
			return archivo;
		}catch (Exception e) {
			System.out.println("error");
			return null;
		}
		
		
		
	}
	
	

}
