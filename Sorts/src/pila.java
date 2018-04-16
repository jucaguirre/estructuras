

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class pila {
	node head = null;
	
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
		node temp = head;
		head = head.next;
		
		String info = temp.toString();
		temp = null;
		System.gc();
		return info;
	}
	

	public String peack ()
	{
		node temp = head;
		return temp.toString();
		
	}
	
	public void push (node newNode)
	{
		newNode.next = head;
		head = newNode;
		
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pila grade = new pila();
		grade.push(new node("task 1", 3));
		grade.push(new node("Quiz 1" , 5));
		grade.push(new node ("test",4));
		//grade.deletAtBegin();
	
		grade.printStack();
		
		
		
	}

}
