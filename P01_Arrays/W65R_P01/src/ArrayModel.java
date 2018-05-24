
public class ArrayModel {
  // Declare a variable sum of type integer and                   
	  //initialize it to zero.

	public static void main(String[] args) {
		int[]arrayA = new int[4];
		int[]arrayB;
		arrayB = arrayA;
		arrayB[2]=4;
		arrayA[0]=arrayB[2];
		System.out.println(arrayA);
	} // end of method main

}
