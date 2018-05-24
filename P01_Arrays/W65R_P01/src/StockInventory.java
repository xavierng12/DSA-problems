import java.util.ArrayList;

public class StockInventory {
	
	public static ArrayList<Outlet> outletList = new ArrayList<Outlet>();
	public static void main(String[] args){	
		//create data into the outlet List
		
		
		StockInventory inventory = new StockInventory();
		inventory.createData();
		
		// display inventory for each outlet
		
		for (Outlet data:outletList){
			System.out.println("---------------------------------");
			System.out.println("Outlet name: " + data.getName());
			System.out.println("Outlet location: " + data.getLocation());
			
			for (Stock item : data.getStockArray()){
				System.out.println("Item: " + item.getItems());
				System.out.println("Item quantity: " + item.getQuantity());
				
			} // inner for loop
			
			System.out.println("---------------------------------");
		
		} // outer for loop
		int totalSum = 0;
		//total inventory of items
		//beginning of outer for loop
		for (Outlet data: outletList){
			System.out.println("Outlet name : " + data.getName());
		int sum = 0;
		
		for(Stock item : data.getStockArray()){
			sum += item.getQuantity();
		
		}
			
		System.out.println("Sum: " +sum);
		totalSum += sum;
		{
		}
		
		}
		System.out.println("Total Inventory: " +totalSum);
		System.out.println("==============================================================");
		
		System.out.println("Total number of outlets and outlet's name that has no stock for socks");
		
		int sum = 0; 
		for (Outlet data: outletList) {
			for (Stock item : data.getStockArray()) {
				if (item.getItems() == "Sock" && item.getQuantity() == 0){
					System.out.println("Outlet Name: " + data.getName());
					sum+= 1;
				}
			}
			
		}
		
		System.out.println("========================================");
		System.out.println("Number of outlets with no socks: " +sum);
		System.out.println("========================================");
		
		// Total number of outlets and outlets that has no stock for any one items
		int total = 0;
		System.out.println("Total Number of outlets and outlets that has no stock for any one item");
		System.out.println("========================================");
		
		for (Outlet data : outletList){
			for (Stock item : data.getStockArray()){
				if (item.getQuantity() == 0){
					System.out.println("Outlet name: " + data.getName());
					total +=1;
				}
			}
		}
		System.out.println("==============================================================");
		System.out.println("Number of outlets with no stock for any one item: " + total);
		System.out.println("==========================================================");
		
		System.out.println("Outlet which has less than 10 items in stock, for all the items");
		
		
		for (Outlet data: outletList) {
			for (Stock item : data.getStockArray()) {
				if (item.getItems() == "Sock" && item.getQuantity() < 9){
					System.out.println("Outlet Name: " + data.getName());
				}
			}
			
		}
		
	} //end of main 
	
	
	
	
	
	
	
	
	//method
	public void createData(){ //something that can't be changed (used static) it's a constant
		ArrayList<Stock> stock1 = new ArrayList<Stock>();
		
		stock1.add(new Stock("Shirt",2));
		stock1.add(new Stock("Blouse",6));
		stock1.add(new Stock("Socks",0));
		
		outletList.add(new Outlet("outlet1","Woodlands",stock1));

		ArrayList<Stock> stock2 = new ArrayList<Stock>();
		
		stock2.add(new Stock("Shirt",4));
		stock2.add(new Stock("Blouse",3));
		stock2.add(new Stock("Socks",2));
		
		outletList.add(new Outlet("outlet2","Yishun",stock2));
		
		ArrayList<Stock> stock3 = new ArrayList<Stock>();
		
		stock3.add(new Stock("Shirt",0));
		stock3.add(new Stock("Blouse",1));
		stock3.add(new Stock("Socks",2));
		
		outletList.add(new Outlet("outlet3","Bedok",stock3));
		
		ArrayList<Stock> stock4 = new ArrayList<Stock>();
		
		stock4.add(new Stock("Shirt",10));
		stock4.add(new Stock("Blouse",20));
		stock4.add(new Stock("Socks",5));
		
		outletList.add(new Outlet("outlet4","SengKang",stock4));
		
		ArrayList<Stock> stock5 = new ArrayList<Stock>();
		
		stock5.add(new Stock("Shirt",50));
		stock5.add(new Stock("Blouse",40));
		stock5.add(new Stock("Socks",0));
		
		outletList.add(new Outlet("outlet5","Jurong East",stock5));
} // end of class
}