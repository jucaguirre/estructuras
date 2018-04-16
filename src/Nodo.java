
public class Nodo {
	
	/*
	 * estructura de datos de adn
	 * */

	public String Sequence;
	public String Chromosoma;
	public int inicio;
	public int fin;
	public Nodo next = null;
	
	
	public Nodo () {}
	 
	public Nodo (String secuence, String chromosoma, int inicio ,int fin) 
	{
		this.Sequence=secuence;
		this.Chromosoma = chromosoma;
		this. inicio = inicio;
		this.fin=fin;
		
	}
	
	public String toString () 
	{
		return "Secuencia: " + Sequence + "\t" + "cromosoma: " + Chromosoma + "\t" +"inicio: "+ inicio +"\t" +"fin :" + fin +"\n" ;
	}

	public Nodo clone ()	//metodo para que no se pierda informacion durante el paso de informacion de clase a clase
	{
		Nodo temp = new Nodo(this.Sequence , this.Chromosoma,this.fin, this.fin);
		return temp;
	}

}
