package ds.list.runner;

import ds.list.singlyLinkedList.SinglyLinkedList;

public class ListMain {
	
	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.addFirst(20);
		sll.addFirst(50);
		sll.addFirst(18);
		sll.addLast(99);
		sll.print();
		sll.deleteFirst();
		sll.print();
		System.out.println(String.format("SLL length is %d", sll.size()));
		System.out.println(String.format("Last Node Value is %d", sll.getLastNodeData()));
	}
}
