public class BankTest {
	public static void main(String[] args) {
		System.out.println("Begin banking....");
		BankAccount ba1 = new BankAccount(); 	 
		ba1.setBankAccountDetails(1234,"Deepika",875000,7890,"Chennai");
		ba1.showBankAccountDetails(); 	

		ba1.withdraw(2100000);

		ba1.showBankAccountDetails();

	
		ba1.withdraw(-2100000);

		ba1.showBankAccountDetails();

		ba1.withdraw(12000);

		ba1.showBankAccountDetails();


	}
}

class BankAccount { 		

	private int bankAccountNumber; 	
	private String bankAccountHolderName;
	private double bankAccountBalance;	
	private int bankAccountPinNumber; 
	private String bankAccountHolderAddress; 

	void setBankAccountDetails(int a, String b, double c, int d, String e) {
		System.out.println("Setting bank Account details....");
		bankAccountNumber=a; 	bankAccountHolderName=b; 
		bankAccountBalance=c;	bankAccountPinNumber=d; 	bankAccountHolderAddress=e;
	}
	void showBankAccountDetails() {
		System.out.println("Bank Account Number          : "+bankAccountNumber);
		System.out.println("Bank Account Holder          : "+bankAccountHolderName);
		System.out.println("Bank Account Balance         : "+bankAccountBalance);
		System.out.println("Bank Account Pin             : "+bankAccountPinNumber);
		System.out.println("Bank Account Holders Address : "+bankAccountHolderAddress);
		System.out.println("---------------------------------");
	}

	void withdraw(double d) { 
		System.out.println(bankAccountHolderName+" is withdrawing...");

		if(d < 0 ) {
			System.out.println("Withdraw amount cannot be negative....");
		}
		else if(d > bankAccountBalance) {
			System.out.println("Cannot withdraw...more than the actual balance......");
		}
		else if(d > (bankAccountBalance-5000) ) //bank wants to maintain 5000 as min balance
			System.out.println("Cannot withdraw...min balance must be maintained...");
		else {
			System.out.println("Withdrawing..."+d);
			bankAccountBalance = bankAccountBalance - d;
		}
	}
	void deposit(double d) { 
		System.out.println(bankAccountHolderName +" is depositing...");
		bankAccountBalance = bankAccountBalance + d;
	}
	void changePin() { 
		System.out.println(bankAccountHolderName +" is chaning Pin...");
	}
	void changeAddress() {
		System.out.println(bankAccountHolderName+" is changing Address...");
	}
}

