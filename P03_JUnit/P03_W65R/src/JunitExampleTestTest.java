import static org.junit.Assert.*;

import org.junit.Test;


public class JunitExampleTestTest {
	
	@Test
	public void testAdd(){
		//create an instance of the class
		JunitExample unitExample = new JunitExample();
			int result;
		result =unitExample.add(-1, -1);
		assertEquals(-2,result);
		result = unitExample.add(5, 2);
		assertEquals(7,result);
		result = unitExample.add(1000,55);
		assertEquals(1055,result);
		//fail("Not Yet implemented");
		
	}
	
	@Test
	public void testSub(){
		//create an instance of the class
		JunitExample unitExample = new JunitExample();
		int result;
		result = unitExample.sub(5,2);
		assertEquals(3,result);
	}

	@Test
	public void testMultiply(){
		//create an instance of the class
		JunitExample unitExample = new JunitExample();
		int result;
		result = unitExample.multiply(5,2);
		assertEquals(10,result);
		
	}
	
	@Test
	public void testDivide(){
		//create an instance of the class
		JunitExample unitExample = new JunitExample();
		int result;
		result = unitExample.divide(10,2);
		assertEquals(5,result);
	}
	@Test
	public void test() {
		//fail("Not yet implemented");
	}

}
