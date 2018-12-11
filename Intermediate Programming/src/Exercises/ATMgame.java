
public class ATMgame {
	private Account[] accounts = new Account[10];
	int id;
	java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String [] args){
		ATMgame atmOnez = new ATMgame(); 
		
	}
	
	public ATMgame() {
		for(int i =1;i<accounts.length;i++) {
			accounts[i]=new Account();
			accounts[i].setId(i);
			accounts[i].setBalance(100);
		}
		continueATM:while(true) {
			System.out.println("Enter your ID: ");
			id = input.nextInt();
			if(id > 10 || id < 1) {
				System.out.println("The ID you entered was not valid, try again. ");
				continue;
			}
		while(true) {
			int choice = getAChoice();
			switch(choice){
			case 1:	System.out.println(accounts[id].getBalance());
					break;
			case 2: withdraw();
					break;
			case 3: deposit();
					break;
			case 4: continue continueATM;
			}
		}	}
	}

	public int getAChoice() {
		int choice;
		while(true){
			System.out.println("\nMain menu");
			System.out.println("1: Check Balance");
			System.out.println("2: Withdraw");
			System.out.println("3: Deposit");
			System.out.println("4: Exit");
			System.out.print("Enter a choice: ");
			choice = input.nextInt();
			if(choice>4||choice<1){
				System.out.println("Wrong choice, try again:");
			}
			else
			{
				break;
			}	 
		}
		return choice;
	}

	public void withdraw(){
		System.out.println("Enter an amount to withdraw: ");
		int amount = input.nextInt();

		if(amount <= accounts[id].getBalance()) {
			accounts[id].withdraw(amount); 
		}
		else{	
			System.out.println("The amount is too large, ignored.");
		}

	}

	public void deposit()
	{
		System.out.println("Enter an amount to deposit: ");
		accounts[id].deposit(input.nextDouble());	

	}

}

