//Please complete and revise this program as needed with comments. 

import java.util.Date; 
public class AccountTester {

	public static void main(String[] args) {
		
		Account acc = new Account(1122, 20000);
		Account.setAnnualInterestRate(4.5);
		
		acc.withdraw(2500);
		acc.deposit(3000);
		
		System.out.println("balance is " + acc.getBalance());
		
		
	}

}

class Account{
	
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated; 
	
	
	public Account()
	{
		dateCreated = new Date(); 
	}
	
	public Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;	
		dateCreated = new Date(); 
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	/**
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

*/
	public static void setAnnualInterestRate(double annualInterestRate) {
		annualInterestRate = annualInterestRate;
	}
	
	public double getMonthlyInterestRate()
	{
		return annualInterestRate/12; 
	}
	
	public double getMonthlyInterest()
	{
		return annualInterestRate/1200 * balance; 
	}
	
	public void withdraw(double specificAmount)
	{
		balance = balance - specificAmount;
		//balance -= specificAmount;
	}
	
	public void deposit(double specificAmount)
	{
		balance += specificAmount; 
	}
}
