import java.util.Stack;


public class charStack {
	public static void main(String[] args) {
		Stack<Character> charStack = new Stack<Character>();
		charStack.push('C');
		charStack.push('B');
		charStack.push('A');
		Character p = charStack.pop();
		Character q = charStack.pop();
		charStack.push('X');
		charStack.push('Y');
		Character c = charStack.pop();
		charStack.push('Z');
}
}