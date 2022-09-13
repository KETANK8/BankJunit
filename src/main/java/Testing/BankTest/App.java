/**
 * @author Ketan Kumar
 * Illustrating banking operation using Regular Expression and Exception Handling
 *
 */
package Testing.BankTest;


/*
Program to create Bank account and check balance.
*/

// importing scanner utility to get input from user
import java.util.Scanner;

public class App{
	
public static void main(String args[]){
	
	//creating scanner object named scan
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Account Holder name : ");
	String userName = scan.next();
	System.out.println("Enter Account Number :");
	int accountNum = scan.nextInt();
	System.out.println("Enter Account Balance : ");
	int balance = scan.nextInt();
	System.out.println("Enter Amount :");
	int amount = scan.nextInt();
	System.out.println("------------------------");
	
	//creating an object named user of class customer
	//calling constructor method of customer class using user object
	customer user = new customer(userName,accountNum,balance);
	user.depositAmount(amount); //calling depositAmount method
	user.getAmount();//calling getAmount method
	user.withdrawAmount(amount); //calling withdrawAmount method
	
	//calling getDetail method of customer class using user object
	user.getDetail();
	scan.close();
}
}

class customer{
	//creating instance variable
	private String userName;
	private int accountNum,balance,amount;
	
	//creating method createAccount to store information of user
	public customer(String name,int num,int bal){
		userName = name;
		accountNum = num;
		balance = bal;
			
	}
	
	//creating withdrawAmount method to delete amount from balance
	public int withdrawAmount(int amount){
		balance -= amount;
		System.out.println(userName+" your current balance after withdrawing Rs."+amount+" is : "+balance);
		return balance;
	}
	
	//creating depositAmount method to add amount
	public int depositAmount(int amount){
		balance += amount;
		System.out.println(userName+" your current balance after depositing Rs."+amount+" is : "+balance);
		return balance;
	}
	
	//creating getAmount method to check balance
	public int getAmount(){
		System.out.println(userName+" your current balance is : "+balance);
		return balance;
	}
	
	//Creating method getDetail to display information of User
	public void getDetail(){
		System.out.println("-----Account Detail------");
		System.out.println("Account Holder  NAME : "+ userName );
		System.out.println("Account Number : "+accountNum);
		System.out.println("Account Balance: Rs."+balance+"/-");
	}
}