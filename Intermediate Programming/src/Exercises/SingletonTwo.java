
public class SingletonTwo {

	private static SingletonTwo instance = null;
	
	private SingletonTwo() { }
	
	public static SingletonTwo getInstance() {
		
		if(instance == null) {
			
			instance = new SingletonTwo();
		}
		
		return instance;
	}
}
