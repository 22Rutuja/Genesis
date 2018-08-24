import java.time.*;
import java.util.*;
@SuppressWarnings("unused")

class Node{
	int data;
	int nodeNumber;
	String nodeId;
	String referenceNodeId;
	String childReferenceId;
	String genesisReferenceId;
	String HashValue;
	
	Node left;
	Node right;
	
	Node (int data){
		this.data = data;
		right = null;
		left = null;
	}
}

public class Genesis {
	
	Genesis()
	{
		@SuppressWarnings("unused")
		Node pnode = null;
	}
	
	@SuppressWarnings("unused")
	private Node Recursion(Node current, int value) {
		if(current == null)
		{
			return new Node(value);
		}
		if(value < current.data)
		{
			
			current.left = Recursion(current.left, value);
		}
		else if(value > current.left && value< current.data) {
			if(value <= (current.data-(current.left)))
			{
				current.right = Recursion(current.right, value);
			}
		}
		else
		{
			System.out.println("Value is invalid...");
		}
		return current;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter the value for the parent node" + a);
		

	}

}
