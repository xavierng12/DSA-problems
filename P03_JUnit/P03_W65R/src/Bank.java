
import java.util.ArrayList;
public class Bank {
	ArrayList<Account> bankAccounts = new ArrayList<Account>();

//create an account

public void createAccount (Account acct){
	bankAccounts.add(acct) ;

}

public ArrayList<Account> getBankAccounts() {
	return bankAccounts;
}

public void setBankAccounts(ArrayList<Account> bankAccounts) {
	this.bankAccounts = bankAccounts;
}

//searching an account

public void searchAccounts(){
	
}
}
