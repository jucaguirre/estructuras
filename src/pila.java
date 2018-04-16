

import java.io.*;

public class pila {
	Nodo head = null;
	
	public boolean isEmpty()
	{
		
		return head == null  ? true: false;
		
	}
	
	public void printStack()
	{
		BufferedWriter  bw = new  BufferedWriter( new OutputStreamWriter(System.out));
		
		//node temp = head;
		try
		{
			bw.write("Grades: \n");
		 while (!isEmpty()) 
			 	bw.write(pop());
			 	
			 
	
		 	bw.flush();
		
		}catch(IOException e) {e.printStackTrace();}
		
	}
	
	public String pop ()
	{
		Nodo temp = head;
		head = head.next;
		
		String info = temp.toString();
		temp = null;
		System.gc();
		return info;
	}
	

	public String peack ()
	{
		Nodo temp = head;
		return temp.toString();
		
	}
	
	public void push (Nodo newNode)
	{
		newNode.next = head;
		head = newNode;
		
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pila grade = new pila();
		grade.push(new Nodo("abcd","chrom 5", 3,7));
		grade.push(new Nodo("abcd" ,"chrom 8", 5,9));
		grade.push(new Nodo ("abcd","chrom 9",4,8));
		//grade.deletAtBegin();
	
		grade.printStack();
		
		
		
	}

}
