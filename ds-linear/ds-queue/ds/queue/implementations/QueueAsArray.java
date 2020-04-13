package ds.queue.implementations;

public class QueueAsArray {
	int[] arr;
	int front = -1;
	int rear = -1;
	
	public QueueAsArray(int size) {
		arr = new int[size];
	}

	public boolean isEmpty() {
		return (front==-1 && rear==-1);
	}
	
	public void enqueue(int item) {
		if(isFull()) {
			System.err.println("Error : Queue is full");
			return;
		}
		if(isEmpty()) {
			front = rear = 0;
			arr[front]=item;
		}else {
			arr[++rear]=item;
		}
	}
	
	public int dequeue() {
		int value = arr[0];
		if(isEmpty()) {
			System.err.println("Error : Queue is Empty.");
		} else if(front == rear && front == 0) {
			value = arr[front];
			front = rear = -1;
		}else {
			value = arr[front++];
		}
		return value;
	}

	private boolean isFull() {
		return rear == arr.length-1;
	}
	
	public void print() {
		StringBuilder sb = new StringBuilder("queue : ");
		for(int i=front ; i<=rear; i++)
			sb.append(String.format("%d <-- ", arr[i]));
		System.out.println(sb.toString());
	}
}
