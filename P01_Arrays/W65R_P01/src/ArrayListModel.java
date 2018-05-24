import java.util.ArrayList;  //import the ArrayList methods from the java library

public class ArrayListModel {
	/* program execution begins here */
	public static void main(String[] args) {	
		int sum = 0;  // Declare a variable sum which is of type integer and                   
					   //initialize it to zero.	
		ArrayList<Integer> number = new ArrayList<Integer>(); 
		//Declare an array list of integers and Intialize the array
		number.add(1);          
		number.add(3); 
		number.add(5);   
		number.add(7); 
		number.add(9);     
				
	    // Enhanced for loop iterates 5 times and stops automatically
	    // for each integer i in the array “number”
		for (int i: number) {
			sum += i;
			System.out.println("Value of i = " + i);
			System.out.println("Sum = " + sum);
		} //end of for loop
			
		System.out.println("Sum of the numbers = " + sum);
	} // end of method main
} //end of class Array Demo
