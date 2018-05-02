package trees;

public class binaryTree {

	
	nodo root = null;
	
	
	
	
	public void insert (int value) 
	{
		nodo nod = new nodo(value);
		if(root == null) 
		{
			root= nod;
		}else {
			
			nodo temp = root;
			nodo padre = null;
			boolean left = false;
			while (temp != null)
			{
				padre= temp;
				
				if(value < temp.value) 
				{ 
					left=true;
					temp = temp.izaquierda;
				}else {
					temp = temp.derecha;
					left=false;
				}
			
			} 
			temp = nod;
			if(left)
				padre.izaquierda=temp;
			else
				padre.derecha= temp;
			
		}
		
	}
	
	
	public void preorder_print (nodo node ) 
	{
		if(node != null)
		{		
			System.out.print("  "+node.toString());
			preorder_print(node.izaquierda);
			preorder_print(node.derecha);
		}
	}
	
	public void posorder_print (nodo node ) 
	{
		if(node != null)
		{		
			
			posorder_print(node.izaquierda);
			posorder_print(node.derecha);
			System.out.print("  "+node.toString());
		}
	}
	
	public void inorder_print (nodo node) {
		
		if(node != null)
		{		
			
			inorder_print(node.izaquierda);
			System.out.print("  "+node.toString());
			inorder_print(node.derecha);
			
		}
		
	}
	public boolean esta (int dato, nodo node) 
	{	boolean flag = false;
		if (node != null) 
		{   
			if(dato == node.value) 
				   flag =  true;
			
			esta(dato, node.izaquierda);
			
			esta(dato, node.derecha);
			
				
				
			
		}
		
		return flag;
	}
	
	public void eliminar(int dato) 
	{
		boolean flag=false;
		
		
		
	} 
	
	
	
	public int offspring (nodo node) {
		
		
		return (node.izaquierda != null) ? (node.derecha !=null ? 2 : 1 ) : (node.derecha != null ? 1 :0);
	}
	
	 public static void main(String[] args) {
		 
		 binaryTree treeTest = new binaryTree();
		 treeTest.insert(82);
		 //System.out.println(treeTest.root.toString());
		 treeTest.insert(55);
		 treeTest.insert(38);
		 treeTest.insert(2);
		 treeTest.insert(70);
		 treeTest.insert(81);
		 treeTest.insert(85);
	
		 treeTest.preorder_print(treeTest.root);
		 System.out.println();
		 treeTest.posorder_print(treeTest.root);
		 
		 System.out.println();
		 treeTest.inorder_print(treeTest.root);
		 System.out.println();
		 
		 System.out.println(treeTest.esta(2, treeTest.root));
		 
	 } 
	
}
