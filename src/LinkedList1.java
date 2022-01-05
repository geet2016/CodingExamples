import java.awt.HeadlessException;

public class LinkedList1 {

	public static Node head;

	public static void add(int n) {
		
		Node node = new Node();
		node.setData(n);

		if (head == null) {
			head = new Node();
			head.setNext(node);
		} else {
			Node newNode = head.getNext();
			while (newNode.getNext() != null) {
				newNode = newNode.getNext();
			}
			newNode.setNext(node);
		}
	}

	public static void addAtN(int n, int index) {
		Node currentNode = head;
		Node preNode = head;

		Node newNode = new Node();
		newNode.setData(n);
	   // int length = length();
	    
		for(int i=0 ;/*i<=length*/currentNode.getNext() != null;i++){

			if (i == index) {
				preNode.setNext(newNode);
				newNode.setNext(currentNode);
				break;
			}
			preNode = currentNode;
			currentNode = currentNode.getNext();
			if(currentNode.getNext() == null)
			{
				preNode.setNext(newNode);
				newNode.setNext(currentNode);	
			}
		}

	}

	public static void print() {
		Node newNode = head.getNext();
		while (newNode.getNext() != null) {
			System.out.print(newNode.getData());
			newNode = newNode.getNext();
		}
		System.out.print(newNode.getData());
		System.out.println();
	}
	public static int length() {
		Node newNode = head.getNext();
		if(head.getNext() == null)
		{
			return 0;
		}
		int count=1;
		while (newNode.getNext() != null) {
			newNode = newNode.getNext();
			count++;
		}
		return count++;
	}
	
	public static void delete(int index)
	{
		if(index == 1)
		{
			Node firstNode = head.getNext();
			head.setNext(firstNode.getNext());
			return;
		}
		Node currrentNode = head.getNext();
		Node preNode = head.getNext();
		for(int i=1;currrentNode.getData() != 0 ;i++)
		{
			if(i == index)
			{
				preNode.setNext(currrentNode.getNext());
				currrentNode.setNext(null);
				break;
			}
			preNode = currrentNode;
			currrentNode = currrentNode.getNext();
		}
	}
}

class Node {
	Node next;

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	int data;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}