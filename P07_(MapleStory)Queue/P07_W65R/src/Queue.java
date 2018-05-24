
import java.util.ArrayList;
public class Queue {
	public ArrayList<Object> data;
	
	//constructor
	public Queue(){
		data = new ArrayList<Object>();
	}
	//enqueue
	public boolean enqueue(Object value){
		return data.add(value);
	}
	//dequeue
	public Object dequeue(){
		return data.remove(0); //remove first index, always start from 0 
	}
	//size of the queue
	public int size(){
		return data.size();
	}
	
	//isEmpty
	public boolean isEmpty(){
		return data.isEmpty();
	}
	//peek
	public Object front(){ // peek front of the queue
		return data.get(0);
	}
	public void displayQueue(){
		System.out.print("[ ");
		for (Object value : data) //for value in object in data
			System.out.print(value +", ");
		System.out.print(" ]");
	}
	
}
