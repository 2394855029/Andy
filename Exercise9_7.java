package Exercise;

import java.util.Date;

public class Exercise9_7 {

	public static void main(String[] args) {
		Account at = new Account(1122, 20000, 4.5);
		
		at.withDraw(2500);
		at.deposit(3000);
		
		System.out.println("The balance is "+ at.getBalance());
		System.out.println("The MonthlyInterest is "+ at.getMonthlyInterestRate());
		System.out.println("The date is "+ at.getDataCreated());
	}

}

class Account{
	private int id;//标识账号
	private double balance;//表示余额
	private double annualInterestRate;//当前利率
	private Date dataCreated;//账户开户日期
	
	Account()
	{
		
	}
	
	Account(int id,int balance,double annualInterestRate)
	{
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	
	double getMonthlyInterestRate()
	{
		return ((annualInterestRate / 100) / 12);
	}
	
	double getMonthlyInterest()
	{
		return (balance * getMonthlyInterestRate());
	}
	
	void withDraw(double a)
	{
		balance = balance - a;
	}
	
	void deposit(double a)
	{
		balance = balance + a;
	}
	
	double getBalance()
	{
		return balance;
	}
	
	Date getDataCreated()
	{
		return dataCreated;
	}
	
	
}
