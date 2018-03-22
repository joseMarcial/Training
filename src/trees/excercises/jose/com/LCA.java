package trees.excercises.jose.com;


public class LCA {
	
	
	public static  Node findLCA(Node node, int num1, int num2){
		
		if (node==null)
			return null;
		
		if (node.data==num1 || node.data== num2) 
			return node;
	
		Node leeftTreeResult = findLCA(node.leftNode, num1, num2);
		Node rigthTreeResult = findLCA(node.rigthNode, num1, num2);
			
		if(leeftTreeResult != null && rigthTreeResult!= null)
			return node;
		if (leeftTreeResult== null && rigthTreeResult == null )
			return null;
			
		return   leeftTreeResult == null ? rigthTreeResult:leeftTreeResult;
		
		
		
	}
	
	
	public static void main (String args[]) {
		
		
		Node child1=new Node (2);
		Node child2=new Node (3);
		Node child3=new Node (4);
		Node child4=new Node (5);
		Node child5=new Node (6);
		Node child6=new Node (7);
		Node child7=new Node (8);
		
		
		Node root = new Node(1, child1, child2);
		child1.leftNode=child3;
		child1.rigthNode=child4;
		child2.leftNode=child5;
		child2.rigthNode=child6;
		child3.leftNode=child7;
		
		System.out.println(findLCA(root, 4, 5).data);
		
	}
	

}


class Node{
	int data;
	Node leftNode;
	Node rigthNode;
	
	public Node(int data, Node leftNode, Node rigthNode) {
		super();
		this.data = data;
		this.leftNode = leftNode;
		this.rigthNode = rigthNode;
	}
	
	public Node(int data) {
		super();
		this.data = data;
		
	}
}