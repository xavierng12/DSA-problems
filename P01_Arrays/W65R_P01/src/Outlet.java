import java.util.ArrayList; 
public class Outlet {
	//member or fields of the class//
	String name;
	String location;
	ArrayList<Stock>StockArray;

	
	//constructor - same name as class,does not have return type
	//initalize the fields of the class
	public Outlet(String n ,String l,ArrayList<Stock>stockArray){
	this.name = n;
	this.location = l;
	this.StockArray = stockArray;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public ArrayList<Stock> getStockArray() {
		return StockArray;
	}

	public void setStockArray(ArrayList<Stock> stockArray) {
		StockArray = stockArray;
	}
	}

	