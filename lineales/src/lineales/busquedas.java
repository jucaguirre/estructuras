package lineales;
import java.io.IOException;

public class busquedas {
	
	public int binarySearch (int[] arreglo, int buscar) 
	{
		int lowerBound = 0 , upperBound = arreglo.length-1, index = -1, medio;
		 
		while (lowerBound < upperBound) 
		{
			medio = (lowerBound + upperBound)/2;
			if(buscar == arreglo[medio])				
			{
				return medio;
				
				
			}else {
				if	(buscar < arreglo[medio])
				{
					upperBound = medio-1;
				}else {
					lowerBound = medio +1;
					
				}
			}
			
			
		}
		
		if (lowerBound == upperBound && arreglo[lowerBound]  == buscar)
			index = lowerBound;
		return index;
	}
	
	
	
	public double binarysearchRec ( int buscar, int lowerBound , int upperBoud) {
		
		int medio = (lowerBound + upperBoud)/2;
		double tempvalu = new lista().get(medio).value; 
		if (lowerBound == upperBoud) 
		{
			if (buscar == tempvalu) {
				return new lista().get(medio);
			}else {
				return -1;
			}
			
		}else {
			
			if(buscar == arreglo[medio] )
			{
				return medio;
			}else {
				if(buscar < medio)
					return binarysearchRec(arreglo, buscar, lowerBound, medio);
				else
					return binarysearchRec(arreglo, buscar, medio+1, upperBoud);
			}
		}
		
		}
	
	
	public int interpolacion (int[] arreglo , int buscar) 
	{
		
		return 0;
	}

	public static void main(String[] args) throws IOException {
		
		lista grade =  new lista();
		grade.printList();
		
		grade.insertAtBegin(new node("task 1", 3.5));
		grade.insertAtBegin(new node("Quiz 1" , 3.8));
		grade.insertAtEnd(new node ("test",4));
		
		busquedas buscar = new busquedas();
		

	}
	
}
