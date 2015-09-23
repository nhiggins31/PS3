package main;

import java.util.Date;

public class Account {

	public static void main(String[] arg) {
		
		Account account = new Account(1122, 3000, .045);
		account.withdraw(2500);
		account.deposit(3000);
		System.out.println("Account ID" + account.id);
		System.out.println("Balance" + account.getBalance());
		System.out.println("Annual Interest Rate" + account.getAnnualInterestRate());
		System.out.println("Monthly Interest:" + account.id);
		
		java.util.Date dateCreated = new java.util.Date();
		System.out.println("Date created" + dateCreated);
	}
			//define variables
			private int id = 0;
			private double balance = 0;
			private double annualInterestRate = 0;
			private Date dateCreated;

			public Account () {
			id = 0;
			balance = 0.0;
			annualInterestRate = 0.0;
			}
			
			//constructor
			public Account(int id, double balance)
			{
				super();
				this.id= id;
				this.balance = balance;
			}
			
			public Account(int newId, double newBalance, double newAnnualInterestRate) {
			id = newId;
			balance = newBalance;
			annualInterestRate = newAnnualInterestRate;
			}
			
			public int getId() {
			    return id;
			}
			public double getBalance() {
			    return balance;
			}
			public double getAnnualInterestRate() {
			    return annualInterestRate;
			}
			public void setId(int newId) {
			    id = newId;
			}
			public void setBalance(double newBalance) {
			    balance = newBalance;
			}
			public void setAnnualInterestRate(double newAnnualInterestRate) {
			    annualInterestRate = newAnnualInterestRate;
			}   
			public Date getDateCreated() {
				return dateCreated; 
			}
			public void setDateCreated(Date newDateCreated) {
			    dateCreated = newDateCreated;
			}
			
			// method getMonthlyInterestRate
			public double getMonthlyInterestRate(double monthly) {
			    return annualInterestRate / 12;
			}
			
			//method withdraw
			public double withdraw(double amount) {
			    return balance -= amount;
			}   
			//method deposit
			double deposit(double amount) {
			    return balance += amount;   
			}
			public void withdrawNewLogic(double amount) throws InsufficientFundsException {
				if (amount <= balance) {
					balance -= amount;
				} else {
					double needs = amount - balance;
					throw new InsufficientFundsException(needs);
				}
			}
}
