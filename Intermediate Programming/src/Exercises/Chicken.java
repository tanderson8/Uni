
public class Chicken extends Animal implements Edible{
	
	@Override
	public String howToEat() {
		
		return "Chicken: Chicken noddle soup.";
	}

	@Override
	public String sound() {
		
		return "Chicken: Cock-a-doodle-doo.";
	}
}
