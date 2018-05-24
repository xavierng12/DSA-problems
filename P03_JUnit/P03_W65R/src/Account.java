public class Account {
	static double INTEREST = 0.03;
	static double SERVICE_FEE = 2.00;
	
	String acctName;
	double acctBalance;
	int acctNumber;
	
	//constructor 
	public Account(String name,double bal,int no){
		acctName = name;
		acctBalance = bal;
		acctNumber = no;
}

	public String getAcctName() {
		return acctName;
	}

	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}

	public double getAcctBalance() {
		return acctBalance;
	}

	public void setAcctBalance(double acctBalance) {
		this.acctBalance = acctBalance;
	}

	public int getAcctNumber() {
		return acctNumber;
	}

	public void setAcctNumber(int acctNumber) {
		this.acctNumber = acctNumber;
	}
	
	//deposit
	public double deposit(double amount){
		acctBalance += amount;
		return acctBalance;
	}
	//withdraw
	public double withdraw(double amount){
		if (acctBalance == 0){
			System.out.println( " Not enough cash in your account");
		}
		else{
			
		acctBalance -= amount;
		}
		return acctBalance;
	}

	//add interest
	public double interest(){
		double interestValue = acctBalance * INTEREST;
		acctBalance += interestValue;
		return acctBalance;
	}
	//add service fee
	public double serviceFee(){
		if (acctBalance <= 500){
			double afterServiceCharge = acctBalance - SERVICE_FEE;
			acctBalance = afterServiceCharge;
	}
		else {
				
			}
		return acctBalance;
	}
		

}

