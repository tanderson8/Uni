
public class WhoIsTheMurderer {

	public static void main(String[] args) {

		String murdererName = "His name is Snow White Riding Hood";
		StringBuilder stringBuilder = new StringBuilder(murdererName);
		stringBuilder.append("MELLOW");
		stringBuilder.insert(11, "Bottle Cup ");
		stringBuilder.delete(8, 11);
		stringBuilder.deleteCharAt(8);
		stringBuilder.reverse();
		stringBuilder.replace(11, 15, "BUTTER");
		stringBuilder.setCharAt(0, 'A');
		System.out.println(stringBuilder);
		
		StringBuilder stringBuilder2 = stringBuilder;
		stringBuilder2.reverse();
		stringBuilder2.delete(43,49);
		stringBuilder2.setCharAt(0, 'H');
		stringBuilder2.replace(8, 18, " is");
		stringBuilder2.replace(25, 32, "ding ");
		System.out.println(stringBuilder2);
	}

}
