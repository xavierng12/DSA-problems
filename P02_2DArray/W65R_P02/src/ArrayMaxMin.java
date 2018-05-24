class ArrayMaxMin
{
	public static void main ( String[] args )  

{
		int[][] data = { {3, 2, 5, 7, 1 },
						{1, 4, 4, 8, 13 },
						{9, 1, 0, 2, 8},
						{0, 2, 6, 3, -1} };

// declare and initialize the max and the min
int max = 0;
int min = 0;

for(int row = 0;row<data.length;row++){
	for(int col = 0;col<data.length;col++){
		if(data[row][col] >max){
			max = data[row][col];
		}
		
		if (data[row][col]>min){
			min = data[row][col];
		}
	}
} //write out the results
	System.out.println("Max =" + max +";Min ="+min);
}
}