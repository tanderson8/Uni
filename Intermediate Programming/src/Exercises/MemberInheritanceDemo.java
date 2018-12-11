
public class MemberInheritanceDemo {

	public static void main(String[] args) {
		
		 
		Member[] clubmembers = new Member[6];
		clubmembers[0] = new NormalMember("Jesse",1, 2010);
		clubmembers[1] = new NormalMember("Tristan",2,2018);
		clubmembers[2] = new NormalMember("Remy",3, 2016);
		clubmembers[3] = new VIPMember("Juan",4, 2015);
		clubmembers[4] = new VIPMember("Hadia",5, 2016);
		clubmembers[5] = new VIPMember("Hunter",6,2014);
		
		for(Member m: clubmembers)
		{
			m.calculateAnnualFee();
			m.displayMemberInfo();
		}
		
	}

}
