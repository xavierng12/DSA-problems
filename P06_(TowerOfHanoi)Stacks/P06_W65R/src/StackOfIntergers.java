import java.util.Stack;

public class StackOfIntergers {
	public static void main(String[]args){
		Stack<Integer>stackOfNums = new Stack<Integer>();
		
		stackOfNums.push(25);
		stackOfNums.push(9);
		stackOfNums.push(7);
		stackOfNums.push(0);
		
		System.out.println("Stack of numbers " + stackOfNums); //Print Stack of numbers [25, 9, 7, 0]
		System.out.println("peek " + stackOfNums.peek()); // Print peek 0
		int popData = stackOfNums.pop();
		System.out.println("Data popped " + popData); //Print Data popped 0
		System.out.println("Stack of numbers " + stackOfNums);
		
		System.out.println("Stack empty " + stackOfNums.isEmpty());
		System.out.println("Stack size " + stackOfNums.size());
		stackOfNums.clear();
		
		System.out.println("Stack after clear " + stackOfNums);
		System.out.println("Stack empty " + stackOfNums.isEmpty());
	}
}
