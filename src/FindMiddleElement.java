

class Node {
	int data;
	Node next;
	
	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class FindMiddleElement {
	public static int findMiddle(Node head) {
		if (head == null) {
			throw new IllegalArgumentException("List is empty");
		}
		
		Node slow = head; // slow pointer moves one step at a time
		Node fast = head; // fast pointer moves two steps at a time
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow.data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		
		int middle = findMiddle(head);
		System.out.println("Middle element: " + middle);
	}

}
