
abstract public class MemberAbstract {

	public String welcome = "WELCOME TO GGC FITNESS";
	protected double annualFee;
	private String name;
	private int memberID;
	private int memberSince;
	private double discount;
	
	public MemberAbstract()
	{
		System.out.println("no-arg constructor with no parameter-No-ARG constructor of parent class");
	}
	
	public MemberAbstract(String pName, int pMemberID, int pMemberSince)
	{
		this.name= pName;
		this.memberID = pMemberID;
		this.memberSince = pMemberSince;
	}
	
	public double getDiscount()
	{
		return discount;
	}
	
	public void setDiscount()
	{
	
		java.util.Scanner input = new java.util.Scanner(System.in);
		String password;
		System.out.print("Please enter the admin password");
		password = input.nextLine(); 
		if(!password.equals("strawberry"))
		{
			System.out.println("Invalid password. You do not have authority to edit the D rate");
		}
		else
		{
			System.out.print("Please enter the discount");
			discount = input.nextDouble(); 
		}
		
	}	
		public void displayMemberInfo()
		{
			System.out.println("Member Name: " + name);
			System.out.println("Member ID: " + memberID);
			System.out.println("Member Since: " + memberSince);
			System.out.println("Annual Fee: " + annualFee);

		}
		
		abstract public void calculateAnnualFee();
		 
	
}
