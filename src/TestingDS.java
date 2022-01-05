
public class TestingDS {

	public static void main(String args[])
	{
		//LinkedList
		
		/*LinkedList1 list = new LinkedList1();
		
		list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
		System.out.println("Elements after adding all");
		list.print();
		
		System.out.println("Length :"+list.length());
		
		list.addAtN(9,5);
		System.out.println("Elements after adding one");
		list.print();
		
		list.delete(5);
		list.print();*/
		
		//Stacks and Queues can be implemented through both arrays and linked list
		
		//BinaryTree
		BinaryTree1 binaryTree = new BinaryTree1();
	/*	binaryTree.insert(1);binaryTree.insert(2);binaryTree.insert(3);
		binaryTree.insert(4);binaryTree.insert(5);binaryTree.insert(6);
		binaryTree.insert(7);*/
		binaryTree.root = new BinaryNode(1);
		binaryTree.root.left = new BinaryNode(2);
		binaryTree.root.right = new BinaryNode(3);
		binaryTree.root.left.left = new BinaryNode(4);
		binaryTree.root.left.right = new BinaryNode(5);
		binaryTree.root.right.left = new BinaryNode(6);
		binaryTree.root.right.right = new BinaryNode(7);
		binaryTree.levelOrderTraversal();
		System.out.println();
		binaryTree.preorder(binaryTree.root);
		System.out.println();
		binaryTree.inorder(binaryTree.root);
		System.out.println();
		binaryTree.postorder(binaryTree.root);
	}
}
