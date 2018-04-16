import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import javax.xml.crypto.Data;
public class main {
	
	
	
	Nodo head;
	int maxOcurrencias = Integer.MIN_VALUE;
	String motifWinner = "";
	
	
	public void compareMotif (String motifCandidato)
	{
		int contador = contarOcurrencias(motifCandidato);
		if(contador >maxOcurrencias)
		{
			maxOcurrencias = contador;
			motifWinner = motifCandidato;
		}
		
		
		
	}
	
	
	public int contarOcurrencias(String motifCandidato)
	{
		int contador = 0;
		String gen_sequence;
		Nodo temp = listaDeSecuencias.head ;
		while(temp != null)
		{
			gen_sequence = temp.Sequence;
			for(int i =0; i<= (gen_sequence.length() - motifCandidato.length()); i ++)
			{
				if(gen_sequence.substring(i, i + motifCandidato.length()).equals(motifCandidato))
				{
					contador +=1;
					i += motifCandidato.length() -1;
				}
				
			}
			
			temp = temp.next;
		}
		
		return contador;
		
	}
	
	public void generadorCombinaciones (String subSequence, int size)
	{
		if(size == 1)
		{
			compareMotif(subSequence + "A");
			compareMotif(subSequence + "C");
			compareMotif(subSequence + "G");
			compareMotif(subSequence + "T");
		}else {
			
			generadorCombinaciones(subSequence + "A", size-1);
			generadorCombinaciones(subSequence + "C", size-1);
			generadorCombinaciones(subSequence + "G", size-1);
			generadorCombinaciones(subSequence + "T", size-1);
		}
		
		
	}
	
	
	public void contadorDeCromosomas () throws IOException
	{
		int[] cromosomas = new int [23];
		String Chromosoma;
		int index;
		Nodo temp = listaDeSecuencias.head;
		while(temp != null) 
		{
			if(temp.Sequence.contains(motifWinner)) 
			{
				Chromosoma = temp.Chromosoma;
				Chromosoma = Chromosoma.replace("Chr", "");
				index = Integer.parseInt(Chromosoma);
				cromosomas[index] +=1;
					
			}
		temp = temp.next;
		}
		
		
	}
	
	
	

	public static lista listaDeSecuencias;
	

	
	
	public static void main(String[] args) {

		
		sequenceBaseDatos archivo = new sequenceBaseDatos();
		//archivo.guardar(20);
		
		
		
		try 
		{
			FileReader fr = new FileReader("baseDatos.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String input = br.readLine();
			while (input != null) {
				String[]  data = input.split(",");

				
				listaDeSecuencias.insertAtEnd(new Nodo(data[0],data[1],Integer.parseInt(data[2]),Integer.parseInt(data[3])));
				input = br.readLine();
			}
			
			
		
		}catch (Exception e) {}
		
		
		listaDeSecuencias.printList();
	//	listaDeSecuencias.revers();
//		listaDeSecuencias.printList();

	}


	}

