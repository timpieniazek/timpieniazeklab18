
public class LinkedList {

	private Node head;
	private Node current;
	public int count;

	public Node getHead() {
		return head;
	}

	public LinkedList() {

		head = new Node();
		current = head;

	}

	public void addAtStart(Object data) {
		Node newNode = new Node();
		newNode.value = data;
		newNode.next = head.next; // new node will have reference of head's next reference
		head.next = newNode; // now the head will refer to the newNode
		count++;
	}

	public void removeFromStart() {
		if (count == 1) {
			head = null;
			current = null;
			count = 0;
		}
		if (count > 1) {
			head = head.next;
			count--;
		} else {
			System.out.println("There are no elements in the list!");
		}
	}

	public void printAllNodes() {
		System.out.println("Head -> ");
		Node curr = head;
		// System.out.println(curr.value);
		while (curr.next != null) {
			curr = curr.next;
			System.out.println(curr.value);
			System.out.println("-> ");
		}
		System.out.println("NULL");
	}

	public void removeAll(Object o) {
		Node curr = head;
		while (curr.next != null) {
			if (curr.next.value == o) {
				curr.next = curr.next.next;
				count--;
			} else {
				curr = curr.next;
			}
		}
	}

	public boolean removeAt(int index) {
		if (index < 0 || index > count) {
			return false;
		}
		Node curr = head;
		for (int i = 0; i < index; i++) {
			curr = curr.next;
		}
		curr.next = curr.next.next;
		count--;
		return true;
	}

	public void printReverse() {
		Node curr = head;
		int c = count;
		while (c > 0) {
			for (int i = 0; i < c; i++) {
				curr = curr.next;
			}
			System.out.println(curr.value);
			c--;
			curr = head;
		}
	}

	public boolean insertAt(int index, Object o) {
		if (index < 0 || index > count) {
			return false;
		}

		if (index == 0) {
			addAtStart(o);
			return true;
		}

		Node newNode = new Node();
		newNode.value = o;
		Node curr = head;
		for (int i = 0; i < index; i++) {
			curr = curr.next;
		}
		newNode.next = curr.next;
		curr.next = newNode;
		count++;
		return true;
	}

}
