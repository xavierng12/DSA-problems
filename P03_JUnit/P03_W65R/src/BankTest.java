import static org.junit.Assert.*;

import org.junit.Test;


public class BankTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
	}

	@Test
	public void testCreateAccount() {
		// create an instant 
		Bank xavierBank = new Bank();
		
		Account xAccount  = new Account("Xavier",500.0,1234);
		Account yAccount  = new Account("John",500.0,1234);
		xavierBank.createAccount(xAccount);
		xavierBank.createAccount(yAccount);
		assertEquals(2,xavierBank.bankAccounts.size());
	}
}
