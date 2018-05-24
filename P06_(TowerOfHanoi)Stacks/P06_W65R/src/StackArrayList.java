import java.util.ArrayList;


public class StackArrayList {
	public static void main(String[]args){
		ArrayList<Integer>stackOfNums = new ArrayList<Integer>();
			
		stackOfNums.add(25);
		stackOfNums.add(9);
		stackOfNums.add(7);
		stackOfNums.add(0);
			
		System.out.println("Stack of numbers " + stackOfNums); //Print Stack of numbers [25, 9, 7, 0]
		System.out.println("peek " + stackOfNums.get(stackOfNums.size()-1)); // Print peek 0
		stackOfNums.remove(stackOfNums.size()-1);

		System.out.println("Stack of numbers " + stackOfNums);
//			
//		System.out.println("Stack empty " + stackOfNums.isEmpty());
//		System.out.println("Stack size " + stackOfNums.size());
//		stackOfNums.clear();
//			
//		System.out.println("Stack after clear " + stackOfNums);
//		System.out.println("Stack empty " + stackOfNums.isEmpty());
	}
}


