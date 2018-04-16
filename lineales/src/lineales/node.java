
package lineales;

public class node {
	// grade= "parcial" 
	String grade;
	double value;
	node next = null;
	
	
	public node() {
		
	}
	public node (String grade, double value) {
		
		this.grade = grade;
		this.value = value;
		
	}
	
	public String toString () {
		return "grade: " + this.grade + "\t" + "value: "+this.value + "\n"; 
		
		
	}
	
	public node clone()
	{
		node temp = new node(this.grade,this.value);
		return temp;
		
		
	}
	
}
