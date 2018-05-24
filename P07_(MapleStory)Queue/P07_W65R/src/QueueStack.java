import java.util.Stack;

public class QueueStack {
	public Stack<Object> data;

	// constructor
	public QueueStack() {
		data = new Stack<Object>();
	}

	// enqueue
	public boolean enqueue(Object value) {
		data.push(value);
		return true;
	}

	// dequeue
	public Object dequeue() {
		Stack<Object> tempStack = new Stack<Object>();

		while (!data.isEmpty()) {
			tempStack.push(data.pop()); // push the data that i pop from
										// tempStack

		}
		// remove the front data in the queue
		Object popedData = tempStack.pop();

		while (!tempStack.isEmpty()) {
			data.push(tempStack.pop()); // push the data that i pop from
										// tempStack
		}
		return popedData;
	}

	// size of the queue
	public int size() {
		return data.size();
	}

	// isEmpty
	public boolean isEmpty() {
		return data.isEmpty();
	}

	// peek
	public Object front() { // peek front of the queue
		return data.get(0);
	}

	public void displayQueue() {
		System.out.print("[ ");
		for (Object value : data)
			// for value in object in data
			System.out.print(value + ", ");
		System.out.print(" ]");
	}

	public char[] peek() {
		// TODO Auto-generated method stub
		return null;
	}
}
