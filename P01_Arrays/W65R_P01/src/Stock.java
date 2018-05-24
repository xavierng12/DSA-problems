
public class Stock {
	String items;
	int quantity;
	
	//constructor
	public Stock(String items,int quantity){
		this.items = items;
		this.quantity = quantity;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
