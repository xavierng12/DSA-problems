import static org.junit.Assert.*;

import org.junit.Test;


public class AccountTest {

	@Test
	public void testGetAcctBalance() {
		//fail("Not yet implemented");
		
	}
	@Test
	public void testDeposit() {
		//create an instant of the account class
		//create an account
		Account XavierAcct = new Account("Xavier",500.0,1234);
		
		//deposit money and test the balance if it is updated
		XavierAcct.deposit(4000.0);
		
		//test balance
		assertEquals((int)4500,(int)XavierAcct.getAcctBalance());
	}
	
	@Test
	public void testWithdraw() {
		//create an instant of the account class
		//create an account
		Account XavierAcct = new Account("Xavier",500.0,1234);
		
		//deposit money and test the balance if it is updated
		XavierAcct.withdraw(100.0);
		
		//test balance
		assertEquals((int)400,(int)XavierAcct.getAcctBalance());
	}
	
	@Test
	public void testInterest() {
		//create an instant of the account class
		//create an account
		Account XavierAcct = new Account("Xavier",500.0,1234);
		
		//add interest and test the balance if it is updated
		XavierAcct.interest();
		
		//test balance
		assertEquals((int)515,(int)XavierAcct.getAcctBalance());
	}
	
	@Test
	public void testServiceFee() {
		//create an instant of the account class
		//create an account
		Account XavierAcct = new Account("Xavier",500.0,1234);
		
		//add interest and test the balance if it is updated
		XavierAcct.serviceFee();
		
		//test balance
		assertEquals((int)498,(int)XavierAcct.getAcctBalance());
	}
}