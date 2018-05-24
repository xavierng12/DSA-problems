
public class queueOfStudents {
	public static void main(String[]args){
		QueueStack students = new QueueStack();
		
		students.enqueue("Derek");
		students.enqueue("Kirk");
		students.enqueue("Xavier");
		System.out.println(students.peek()); ;
		students.displayQueue(); //display current queue
		System.out.println("size of the queue: " + students.size());
		
		students.dequeue();
		System.out.println("front of the queue: " + students.front());
		System.out.println("size of the queue: " + students.size());
		students.displayQueue();
	}
}
