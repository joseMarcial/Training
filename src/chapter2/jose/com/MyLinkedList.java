package chapter2.jose.com;

public class MyLinkedList {


	Node head;

	



	public static void removeDuplicates(Node headNode){

		

		if (headNode != null)

		{

			Node firstPointer = headNode;

			

			while (firstPointer != null)

			{

				Node secondPointer = headNode;

				Node previousPointer = headNode;

			

				while (secondPointer != null)

				{

				

					if (firstPointer==secondPointer)

					{

						previousPointer = secondPointer;

						secondPointer=secondPointer.next;

					

					}else if(firstPointer.val==secondPointer.val) 

					{

						Node temp = secondPointer.next;

						previousPointer.next=temp;

						previousPointer = secondPointer;

						secondPointer=secondPointer.next;

						

					

					}else{

						previousPointer = secondPointer;

						secondPointer=secondPointer.next;

					}

				}

			

			firstPointer= firstPointer.next;

			

			}

		

		}

		

	}

	

	

	

	Node getSubLinkedList(Integer initPosition, Node node){

		

		 Node result=null;

		 Node pointer= null;		 

		 int counter = 1;

		 if (node!= null)

		 {

			pointer = node;

			while (pointer  != null && counter <initPosition)

			{

				pointer=pointer.next; 

				counter++;

			}

			if (counter != initPosition)

			{

				System.out.println("ERROR bad input");

				return null;

			}

			else {

				result = pointer;

			}

		 

		 }

		 if(result==null){

			 System.out.println("ERROR bad input");

		 }

		 return result;

	}

	

	

	public void removeInMiddle(Node node){

		

		if (node!= null){

		Node previous = node;

		Node current=node.next;

		

		while(current != null){

			previous.val= current.val;	

			previous.next = current.next;

			previous=previous.next;

			current=current.next;

		}

		

		

		}

	}

	

	

	public static Node  nodesAddition(Node list1, Node list2){

		

		Integer firstAmount = 0;

		Integer secondAmount = 0;

		Integer increment = 1;

		

		while (list1 != null ){

			firstAmount += list1.val*increment;

			increment*=10;

			list1=list1.next;

		}

		increment = 1;

		

		while (list2!= null){

			secondAmount += list2.val*increment;

			increment*=10;

			list2=list2.next;

		}

		

		String totalAmount   = (firstAmount+=secondAmount).toString();

		Node result = new Node();

		Node resultHead = result;

		

		for (int x= 0 ; x<totalAmount.length()-1;x++){

			result.val=Integer.valueOf( Character.toString(totalAmount.charAt(x) ));

			Node nexNode = new Node();

			result.next=nexNode;

			result=result.next;

		}

		

		

		return resultHead;

		

	}

	

	public static void main (String args []) {

		

		

		Node fifthNode= new Node();

		fifthNode.val=3;

		

		Node fourNode= new Node();

		fourNode.val=5;

		fourNode.next=fifthNode;

		

		Node thirdNode= new Node();

		thirdNode.val=2;

		thirdNode.next=fourNode;

		

		

		

		

		Node secondNode= new Node();

		secondNode.val=2;

		secondNode.next=thirdNode;

		

		Node firstNode = new Node();

		firstNode.next=secondNode;

		firstNode.val= 5;

		

		//MyLinkedList linkedList = new MyLinkedList(firstNode);

		//linkedList.removeDuplicates(firstNode);

		

		

		//firstNode = linkedList.getSubLinkedList(5, firstNode);

		

		

		//linkedList.removeInMiddle(thirdNode);

		

		firstNode = nodesAddition(firstNode,firstNode);

		

		

		while (firstNode != null){

			

			System.out.println(firstNode.val);

			firstNode= firstNode.next;

		}

		

		//System.out.println(nodesAddition(firstNode,firstNode));

	}

	

	



}





class Node {



	

	

	Node next;

	int val;



}

