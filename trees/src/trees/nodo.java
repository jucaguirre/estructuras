package trees;
import org.omg.CORBA.PUBLIC_MEMBER;



public class nodo {


		int value;
		nodo derecha;
		nodo izaquierda;
		
		public nodo() {};
		
		public nodo (int value) 
		{
			this.value = value;
		}
		
		public String toString()
		{
			return " " + this.value;
			
		}
		
	
		 public nodo clone()
		 {
			 nodo temp = new nodo(this.value);
				return temp;
		 }
		
		
	
	
	
		 
		 
		 
}
