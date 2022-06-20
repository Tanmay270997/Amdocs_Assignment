import java.util.Scanner;


public class Banking {

	
	public static void main(String[] args) {
		
		BankApp obj1 = new BankApp("Sandip", 101);
		
		obj1.showMenu();
		
		
	}

}

class BankApp 
{

	
	int accno;
	String name;
	int balance;
	int previousTransaction;
	
	BankApp(String cname, int caccno){
		name = cname;
		accno = caccno;
	}
	
	
	void deposit(int amount)
	{
		if(amount !=0)
		{
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	
	void withdraw(int amount)
	{
		if(amount != 0)
		{
			balance = balance - amount;
			previousTransaction = -amount;
		}
		
	}
	
	void getPreviousTransaction()
	{
		if(previousTransaction > 0)
		{
			System.out.println("Amount Deposited:" + previousTransaction);
		}
		else if(previousTransaction < 0)
		{
			System.out.println("Amount withdrawn:" + Math.abs(previousTransaction));
		}
		else{
			System.out.println("No Transaction Done");
		}
	}
	
	void showMenu()
	{
		char option ='\0';
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome" + name);
		System.out.println("Your account number is :" + accno);
		System.out.println("\n");
		System.out.println(" 1. Check Balance ");
		System.out.println(" 2. Deposit ");
		System.out.println(" 3. Withdraw ");
		System.out.println(" 4. Previous Transcation ");
		System.out.println(" 5. Exit ");
		
		

		do
		{
			System.out.println("\n");
			System.out.println("Enter an option");
			System.out.println("\n");
		    option = sc.next().charAt(0);
			System.out.println("\n");
			
			
			switch(option)
			{
			
			case '1':
				System.out.println("\n");
			    System.out.println("Balance is:" + balance);
			    System.out.println("\n");
			    break;
			    
			case '2':
				System.out.println("\n");
				System.out.println("Enter the amount to be deposited: ");
				System.out.println("\n");
				int amount = sc.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
				
			case '3':
				System.out.println("\n");
				System.out.println("Enter the amount to be withdrawn: ");
				System.out.println("\n");
				int amount2 = sc.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;
				
			case '4':
				System.out.println("\n");
				getPreviousTransaction();
				System.out.println("\n");
				
			case '5':
				System.out.println("\n");
				break;
				
			default :
				System.out.println("Please enter a valid option between 1 to 5");
				break;
			}
		}
		while(option != '5');
		System.out.println("Thank for using our bank !!");
		
	}
}
	
			
	



