package ds.queue.runner;

import java.util.concurrent.TimeUnit;

import ds.queue.implementations.CircularQueueAsArray;
import ds.queue.implementations.QueueAsArray;

public class QueueRunner {

	public static void main(String[] args) {
		
		runQueueAsArray();
		runCircularQueueAsArray();
	}

	private static void runQueueAsArray() {
		QueueAsArray q = new QueueAsArray(5);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		q.print();
		q.dequeue();
		q.enqueue(60);
		q.print();
	}

	private static void runCircularQueueAsArray() {
		CircularQueueAsArray q = new CircularQueueAsArray(5);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.enqueue(60);
		q.print();
		q.dequeue();
		q.enqueue(60);
		q.print();
	}

}
