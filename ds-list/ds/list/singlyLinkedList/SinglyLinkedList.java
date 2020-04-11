package ds.list.singlyLinkedList;

public class SinglyLinkedList {

	SLLNode head;
	int length;

	public SinglyLinkedList() {
	}

	public SinglyLinkedList(SLLNode head) {
		this.head = head;
	}

	public int size() {
		return this.length;
	}

	public SLLNode getHead() {
		return head;
	}

	public void setHead(SLLNode head) {
		this.head = head;
	}

	public void addFirst(int data) {
		SLLNode temp = new SLLNode(data);
		if (head == null) {
			this.head = temp;
		} else {
			temp.setNext(head);
			this.head = temp;
		}
		length++;
	}

	public void addLast(int data) {
		SLLNode last = getLastNode();
		last.setNext(new SLLNode(data));
	}

	public void insertAt(int index, int data) {

	}

	public void deleteFirst() {
		head = head.getNext();
	}

	public void deleteLast(int data) {

	}

	public SLLNode getLastNode() {
		SLLNode temp = head;
		if(temp == null)
			return null;
		while(temp.getNext() != null)
			temp = temp.getNext();
		return temp;
	}

	public int getLastNodeData() {
		return getLastNode().getData();
	}
	
	public void print() {
		SLLNode node = this.head;
		StringBuilder sb = new StringBuilder();
		while (node != null) {
			sb.append(node.getData()).append(" --> ");
			node = node.getNext();
		}
		sb.append("null");
		System.out.println(sb.toString());
	}
}
