import java.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Random;


public class sorts {
	
	
	public int[] bubbleSrot (int[] unsorted) 
	{
		boolean swap = false;
		int temp;
		do 
		{	
			swap = false;
			for (int i = 0; i < (unsorted.length-1); i++) {
				if (unsorted [i] > unsorted[i+1]) {
					temp = unsorted [i];
					unsorted[i] = unsorted[i+1];
					unsorted[i+1] =  temp;
					swap = true;
				}
				
			}
			
			
		}while(swap);
		
		
		return unsorted;
		
	}
	
	
	public int [] insertionSort (int[] unsorted)
	{
		int temp, indexHole;
		
		for (int i = 1; i < unsorted.length; i++) 
		{
			temp = unsorted[i];
			indexHole = i;
			while (indexHole > 0 && unsorted[indexHole-1]>temp)
			{
				unsorted[indexHole] = unsorted[indexHole-1];
				indexHole -=1;
				
			}
			
			unsorted[indexHole] = temp;
		}
		
	return unsorted;
	}
	
	
	public void mergeSort(int [] unsorted)
	{
		int size;
		
		if(unsorted.length > 1) 
		{
			size = unsorted.length/2;
			int[] leftArray = new int[size];
			int[] rightArray = new int[unsorted.length-size];
			
			for (int i = 0; i < size; i++) {
				leftArray[i]=unsorted[i];
			}
			for (int i = size; i < unsorted.length; i++) {
				rightArray [i-size] = unsorted [i];
			}
			
			
			mergeSort(leftArray);
			mergeSort(rightArray);
		}
			
		
	}
	
	
/*	public int[] merge(int[]a, int[]b)
	{
		int l = a.length + b.length;
		int[] c = new int[l];
		int indexA = 0, indexB=0, indexC =0;
		
		while (indexA < a.length && indexB < b.length)
		{
			if(a[indexA]< b[indexB])
			{
				c[indexC] = a[indexA];
				indexA++;
			}else {
				
				c[indexC] = b[indexB];
				indexB++;
				
			}
			indexC++;
					
		}
		
		while (a.length>0) {
			c[indexC] = a[indexA];
			indexA++;
			indexC++;
			
		}
		
		while (b.length>0) {
			c[indexC] = b[indexB];
			indexB++;
			indexC++;
			
		}
		return null://toca agregar lo de los returns
	}*/
	
	
	
	public int[] countingSort (int unsorsing []) {
		
		
		int  grande=0,indice=0;
		for (int i = 0; i < unsorsing.length; i++) {
			
			if(grande > unsorsing[i])
			{
				
				grande = unsorsing[i];
			
			}	
		}
		
		int [] aux = new int [grande+1];
			
		for (int i = 0; i < aux.length; i++) 
		{
			aux [unsorsing[i]] +=1;
		}
		
		for (int i = 0; i < aux.length; i++) 
		{
			for (int j = 0; j < aux[i]; j++) 
			{
				unsorsing [indice] = i;
				indice ++;
				 
			}
			
		}
		
		
	return unsorsing;
	}
	
	public void printArray (int [] array) throws IOException {
		 BufferedWriter bw =  new BufferedWriter(new OutputStreamWriter(System.out));
		 
		 for (int i = 0; i < array.length; i++) {
			bw.write(array[i] + " ");
			//bw.write("\n");
			
		}
		 bw.write("\n"); 
		 bw.flush();
	}
	
	
	public int [] bigArray (int length) 
	{
		
		Random rd = new Random();
		int [] temp = new int [length];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = rd.nextInt(1000);
		}
		
		return temp;
		
	}
	
	
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	/*	Long time_start1,   time_end1,  tiempo;
		sorts ordenar = new sorts();
		int [] x = ordenar.bigArray(100);
		int [] y = x;
		int [] z = y;
		
		ordenar.printArray(x);
		
		time_start1 = System.currentTimeMillis();
		ordenar.bubbleSrot(x);
		time_end1 = System.currentTimeMillis();
		tiempo = time_end1 -time_start1;
		System.out.println(tiempo);
		
		time_start1 = System.currentTimeMillis();
		ordenar.insertionSort(y);
		time_end1 = System.currentTimeMillis();
		tiempo = time_end1 -time_start1;
		System.out.println(tiempo);
		
		

		time_start1 = System.currentTimeMillis();
		ordenar.countingSort(z);
		time_end1 = System.currentTimeMillis();
		tiempo = time_end1 -time_start1;
		System.out.println(tiempo);

		ordenar.printArray(z);
		ordenar.printArray(x);
		ordenar.printArray(y);
		*/
		
	}

}
