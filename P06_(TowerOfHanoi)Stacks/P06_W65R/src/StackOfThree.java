import java.util.Stack;
public class StackOfThree {
	public static void main(String[] args) {
		Stack<Character> Stack1 = new Stack<Character>();
		Stack<Character> Stack2 = new Stack<Character>();
		Stack<Character> Stack3 = new Stack<Character>();
		
		// add characters for Stack 1
		Stack1.push('A'); // single quote for single character, double quote for string
		Stack1.push('B');
		Stack1.push('X');
		Stack1.push('Y');
		
		//add characters for Stack 2
		Stack2.push('Z');
		
		//add characters for Stack 3
		Stack3.push('B');
		Stack3.push('C');
		Stack3.push('A');
		
		System.out.println("Stack 1 data" + Stack1);
		System.out.println("Stack 2 data" + Stack2);
		System.out.println("Stack 2 data" + Stack3);
		
		Stack2.push(Stack1.pop());
		
		System.out.println("======================");
		System.out.println("Stack 1 data" + Stack1);
		System.out.println("Stack 2 data" + Stack2);
		System.out.println("Stack 2 data" + Stack3);
	}
}