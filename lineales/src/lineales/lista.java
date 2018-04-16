package lineales;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.xml.soap.Node;

public class lista {

	node head= null; // apuntador principal
	
	
	public boolean isEmpty()
	{
		
		return head == null  ? true: false;
		
	}
	
	public void printList()
	{
		BufferedWriter  bw = new  BufferedWriter( new OutputStreamWriter(System.out));
		
		node temp = head;
		try
		{
			bw.write("Grades: \n");
		 while (temp != null) 
		 	{
			 	bw.write(temp.toString());
			 	temp = temp.next;
			 
		 	} 
		 	bw.flush();
		
		}catch(IOException e) {e.printStackTrace();}
		
	}
	
	public void insertAtBegin(node newNode)
	{
		newNode.next = head;
		head = newNode;
		
	}
	
	public void insertAtEnd (node newNode) 
	{
		if(isEmpty()) 
		{
			head = newNode;
			
		}else {
			
			node temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
				
				
			}
			temp.next = newNode;
			
		}
		
		
	}
	
	public void insertAtIndex (node newNode , int posicion)
	{
		node temp = head;
		for(int i=0;i<posicion-1;i++)
			temp = temp.next;
		
		newNode.next = temp.next;
		temp.next = newNode;
		
		
	}
	
	public void deletAtBegin()
	{
		
		node temp = head;
		head = head.next;
		temp=null;
		System.gc();
		
	}
	
	/*public void deletAtindex (int index)
	{
		node temp = head;
		node toDelete;
		for(int i = 0; i<index-1; i++)
				temp = temp.next;
		
		
		
	}*/
	
	public void deletAtEnd ()
	{
		node temp = head;
		while(temp.next != null)
		{
				temp = temp.next;
				
				if(temp.next == null)
				{
					break;
				}
		}
		temp = null;
	
	}
	
	
	public void revers ()
	{
		pila tempStak = new pila();
		node temp = head;
		while (temp != null)
			{
				tempStak.push(temp.clone());
				temp = temp.next;
			}
		head = tempStak.head;
	}
	
	public int tamaño() 
	{
		int contador =0;
		node temp = head;
		while (temp != null) {
			contador ++;
			temp = temp.next;
		}
		 return contador;
	}
	
	
	public node get (int index) 
	{
		if (index < this.tamaño()) {
			node temp = head;
			for (int i = 0; i < index; i++) {
				temp = temp.next;
				return temp;
			}
		}
		return null;
		
	}
	
	public static void main(String[] args) {
		
		lista grade =  new lista();
		grade.printList();
		
		grade.insertAtBegin(new node("task 1", 3.5));
		grade.insertAtBegin(new node("Quiz 1" , 5));
		grade.insertAtEnd(new node ("test",4));
		//grade.deletAtBegin();
		//grade.deletAtEnd();
		grade.printList();
		
		//grade.revers();
		
		//grade.printList();
	
	
	
	
	}

}
