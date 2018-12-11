
public class Singleton {
	static private Singleton newInstance;
	private Singleton() { }
	
	public static Singleton getnewInstance() {
			if(newInstance == null) {
				newInstance = new Singleton();
			}
			return newInstance;
	}
}
