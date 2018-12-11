
public class VIPMember extends Member {

	 
	
	public VIPMember(String name, int memberId, int memberSince)
	{
		super(name, memberId, memberSince);
		System.out.println("Child constructor with three parameters");
	}
	
	@Override
	public void calculateAnnualFee()
	{
		 annualFee = (1 - 0.01 * getDiscount()) * 1000;
	}
	 
}
