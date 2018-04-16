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
	
	
	
	public int binarysearchRec (int[] arreglo , int buscar, int lowerBound , int upperBoud) {
		
		int medio = (lowerBound + upperBoud)/2;
		if (lowerBound == upperBoud) 
		{
			if (buscar == arreglo[medio]) {
				return medio;
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
	
	
	public int interpolacion (Float[] arreglo , int buscar) 
	{
		
		return 0;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 
		sorts ordenar = new sorts();
		int [] arreglo = ordenar.bigArray(1000);
		int  busqueda, busquedarec;
		arreglo = ordenar.insertionSort(arreglo);
		ordenar.printArray(arreglo);
		
		busquedas serch = new busquedas();
		busqueda= serch.binarySearch(arreglo,239);
		busquedarec = serch.binarysearchRec(arreglo, 960, 0, arreglo.length);
	if (busqueda != -1) {
		System.out.println(arreglo[busqueda] + "  esta en la posicion " + busqueda);
	
		
	}else {
		System.out.println(busqueda + " no esta");
	}
	if (busquedarec != -1) {
		System.out.println(arreglo[busquedarec] + "  esta en la posicion " + busquedarec);
	
		
	}else {
		System.out.println(busquedarec + " no esta");
	}
	
	}

}
