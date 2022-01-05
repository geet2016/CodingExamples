import java.util.*;

public class BinaryTree1 {

	/*       root
	 *        |
	 *        A
	 *       / \
	 *      B   C
	 *     / \   \
	 *    D  E    F
	 *  
	 *  LEVEL ORDER TRAVERSAL(BFS) : ABCDEF
	 *  DFS :
	 *  PREORDER  : ABDECF
	 *  INORDER   : DBEACF
	 *  POSTORDER : DEBFCA
	 *  
	 */
	public static BinaryNode root;
	public static ArrayList<BinaryNode> q = new ArrayList<BinaryNode>();
	
	public static void insert(int n)
	{
		BinaryNode newNode = new BinaryNode();
		newNode.setData(n);
		
		
		if(root == null)
		{
			root = new BinaryNode();
			root = newNode;
			//q.add(root);
		}
		else{
			while(root.getData() != 0)
			{
	           if(root.getLeft() != null && root.getRight() != null)
	           {
	        	  q.add(root);
	        	  root = newNode;
	        	  break;
	           }
				
				if(root.getLeft()== null)
				{
					root.setLeft(newNode);
					break;
				}
				if(root.getRight()== null)
				{
					root.setRight(newNode);
					break;
				}

			}
		}
		
	}
	
	public static void levelOrderTraversal()
	{
		Queue<BinaryNode> qq = new LinkedList<BinaryNode>();
		qq.add(root);
		while(!qq.isEmpty())
		{
			BinaryNode node = qq.poll();
			System.out.print(node.data);
			if(node.left != null)
			{
				qq.add(node.left);
			}
			if(node.right != null)
			{
				qq.add(node.right);
			}
		}
		
	}
	
	public static  void inorder(BinaryNode root)
	{
		if(root == null){
			return ;
		}
		
		inorder(root.left);
		System.out.print(root.data);
		inorder(root.right);
	}
	public static  void preorder(BinaryNode root)
	{
		if(root == null){
			return ;
		}
		
		System.out.print(root.data);
		preorder(root.left);
	    preorder(root.right);
	}
	public static  void postorder(BinaryNode root)
	{
		if(root == null){
			return ;
		}
		
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data);
	}
}
class BinaryNode{
	
	int data;
	BinaryNode left;
	BinaryNode right;
	
	BinaryNode(){}
	
	public BinaryNode(int n) {
		// TODO Auto-generated constructor stub
		data = n;
		left= null;
		right = null;
	}
	public BinaryNode getLeft() {
		return left;
	}
	public void setLeft(BinaryNode left) {
		this.left = left;
	}
	public BinaryNode getRight() {
		return right;
	}
	public void setRight(BinaryNode right) {
		this.right = right;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
}