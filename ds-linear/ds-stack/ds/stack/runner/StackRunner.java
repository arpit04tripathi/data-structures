package ds.stack.runner;

import ds.stack.array.StackAsArray;

public class StackRunner {

	public static void main(String[] args) {
		StackAsArray stack = new StackAsArray(5);
		stack.push(5).push(10).push(15).push(20).push(25).push(30).print();
		stack.pop().print();
		System.out.println(stack.top());
		System.out.println(stack.isEmpty());
		stack.pop().pop().pop().pop().pop().print();
		System.out.println(stack.top());
		System.out.println(stack.isEmpty());
	}
}