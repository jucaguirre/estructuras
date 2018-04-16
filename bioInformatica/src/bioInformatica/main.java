package bioInformatica;

import java.io.*;


public class main {

		public static void main(String[] args)
		{
			try 
			{
				FileReader fr = new FileReader("secuencias.txt");
				BufferedReader br = new BufferedReader(fr);
				
				String input = br.readLine();
				while (input != null) {
					String[]  data = input.split(",");
					
					
				}
				
			}catch (Exception e) {}
			
		
	
		}

}
