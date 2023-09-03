import java.util.*;

class Bank
{

	Scanner sc=new Scanner(System.in);
	HashMap<String, Integer> AccPassword=new HashMap<>();
	
	HashMap<String, Integer> AccBalance=new HashMap<>();
	
	public void Entry(){
		AccPassword.put("123456",1234);
	AccPassword.put("12345679",12345);
	AccBalance.put("123456",1000);
	AccBalance.put("12345679",1000);
		System.out.println("Please select the Below Options");
		System.out.println("1.New User");
		System.out.println("2. Existing User");
		int sel=sc.nextInt();
		if (sel==1)
		{
			System.out.println(" Welcome to the New user, Please create ur Account");
			AddNewUser();
			Auth();
		}
		else if (sel==2)
		{
			System.out.println(" Welcome to the Existing user, Please Validate ur Account Credentials");
			Auth();
		}
		else{

			System.out.println(" Invalid Selection");
			Entry();

		}
	}
	public void Auth(){
		System.out.println("Enter ur Account Number");
		String AccNo=sc.next();
		if (AccPassword.containsKey(AccNo))
		{
			System.out.println("Enter ur Password");
			int Pw=sc.nextInt();
			if (AccPassword.get(AccNo)==Pw)
			{
				System.out.println("You logged in Succesfully");
				getDetails(AccNo);
			}
			else {
				System.out.println("Enter Correct Password");
			}
		}
		else{
			System.out.println("Invalid Account Credentials");
			Auth();
		}
	}

	public void AddNewUser(){
		System.out.println("Enter ur Account Number");
		String AccNo=sc.next();
		System.out.println("Enter ur Password");
		int Pw=sc.nextInt();

		AccPassword.put(AccNo,Pw);
		System.out.println("Your Account has got Created Successfully");
		int bal=1000;
		AccBalance.put(AccNo,bal);
		

	}
	public void getDetails(String AccNo){
		System.out.println("1. Check Balance");
		System.out.println("2. Credit Money");
		System.out.println("3. Debit Money");
		int a=sc.nextInt();
		if (a==1)
		{
			balanceDisplay(AccNo);
		}
		else if (a==2)
		{
			credit(AccNo);
		}
		else if (a==3)
		{
			debit(AccNo);
		}
		else{
			System.out.println("Invalid Entry");
			getDetails(AccNo);
		}
	}
	public void balanceDisplay(String AccNo){
		System.out.println("Your Acccount Balance: " + AccBalance.get(AccNo) + " Rupees");
		getDetails(AccNo);
	}
	public void credit(String AccNo){
		int n,new_value;
		System.out.println("Enter the amount to be credited");
		 n=sc.nextInt();
		new_value=AccBalance.get(AccNo)+n;
		AccBalance.put(AccNo,new_value);
		balanceDisplay(AccNo);
		
		
	}
	public void debit(String AccNo){
		int n,new_value;
		System.out.println("Enter the amount to be debited");
		n=sc.nextInt();
		if (n>AccBalance.get(AccNo))
		{
			System.out.println("You dont have enough amount");
			debit(AccNo);
		}
		else{
		
		new_value=AccBalance.get(AccNo)-n;
		AccBalance.put(AccNo,new_value);
		balanceDisplay(AccNo);
		}

	}
	
}


class ATM
{
	public static void main(String[] args) 
	{
		Bank b=new Bank();
		b.Entry();

	}
}
