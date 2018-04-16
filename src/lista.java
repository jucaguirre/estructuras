import java.io.*;



public class lista {

	Nodo head= null; // apuntador principal
	
	
	public boolean isEmpty()
	{
		
		return head == null  ? true: false;
		
	}
	
	public void printList()
	{
		BufferedWriter  bw = new  BufferedWriter( new OutputStreamWriter(System.out));
		
		Nodo temp = head;
		try
		{
			bw.write("\n\n_______________________________________lista_____________________________________________ \n\n");
		 while (temp != null) 
		 	{
			 	bw.write(temp.toString());
			 	temp = temp.next;
			 
		 	} 
		 	bw.flush();
		
		}catch(IOException e) {e.printStackTrace();}
		
	}
	
	public void insertAtBegin(Nodo newNode)
	{
		newNode.next = head;
		head = newNode;
		
	}
	
	public void insertAtEnd (Nodo newNode) 
	{
		if(isEmpty()) 
		{
			head = newNode;
			
		}else {
			
			Nodo temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
				
				
			}
			temp.next = newNode;
			
		}
		
		
	}
	
	public void insertAtIndex (Nodo newNode , int posicion)
	{
		Nodo temp = head;
		for(int i=0;i<posicion-1;i++)
			temp = temp.next;
		
		newNode.next = temp.next;
		temp.next = newNode;
		
		
	}
	
	public void deletAtBegin()
	{
		
		Nodo temp = head;
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
		Nodo temp = head;
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
		Nodo temp = head;
		while (temp != null)
			{
				tempStak.push(temp.clone());//se usa el .clone para no perder informacion
				temp = temp.next;
			}
		head = tempStak.head;
	}
	
	
	public int tamaño() 
	{
		int contador =0;
		Nodo temp = head;
		while (temp != null) {
			contador ++;
			temp = temp.next;
		}
		 return contador;
	}
	
	
	public Nodo get (int index) 
	{
		if (index < this.tamaño()) {
			Nodo temp = head;
			for (int i = 0; i < index; i++) {
				temp = temp.next;
				return temp;
			}
		}
		return null;
		
	}
	
	/*public static void main(String[] args) {
		
		listaApuntador grade =  new listaApuntador();
		grade.printList();
		
		grade.insertAtBegin(new cadena("abcd","chrom 5", 3,7));
		grade.insertAtBegin(new cadena("abcd" ,"chrom 8", 5,9));
		grade.insertAtEnd(new cadena ("abcd","chrom 9",4,8));
		//grade.deletAtBegin();
		//grade.deletAtEnd();
		grade.printList();
		
		grade.revers();
		
		grade.printList();
	
	
	
	
	}*/

}
