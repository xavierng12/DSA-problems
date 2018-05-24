
import java.util.ArrayList;

public class ForLoopDemo {
	public static void main(String[]args){
		String[]nameArray = {"John","May","Paul","Peter"};
		//declare a string array called nameArray
		
		ArrayList<String>nameArrayList = new ArrayList<String>();
		//declare an arraylist of strongs
		
		//add values to arraylist
		nameArrayList.add("John");
		nameArrayList.add("May");
		nameArrayList.add("Paul");
		nameArrayList.add("Peter");
		
		//normal for loop
		System.out.println("Normal for loop : Array");
		for(int i = 0;i < nameArray.length;i++){
			System.out.println(nameArray[i]);
		}
		
		//normal for loop
		System.out.println("Normal for loop : ArrayList");
		for(int i = 0;i < nameArrayList.size();i++){
			System.out.println(nameArrayList.get(i));
		}

		// Enhanced for loop iterates 4 times and stops automatically
		
		/* ENHANCED FOR LOOP */
		System.out.println("Normal for loop : ArrayList");
		//for each String name in the nameArrayList
		for (String name:nameArray){
			System.out.println(name);
		}
		System.out.println("Enhanced for loop - ArrayList");
		for (String name:nameArrayList){
			System.out.println(name);
		}
		//end of for loop
	}//end of method main
}


