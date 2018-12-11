//Fan class with Fan Tester programs.
//You can complete this program as you need. 


public class FanTester {

	public static void main(String[] args) {
		 
		Fan f1 = new Fan();
		f1.setSpeed(Fan.FAST);
		f1.setColor("yellow");
		System.out.println(f1.toString());   
	}

}

class Fan{
	
	public static int SLOW = 1;
	public static int MEDIUM = 2;
	public static int FAST = 3;
	
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	private String color = "blue";
	
	public Fan()
	{	
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override 
	public String toString()
	{
		return "speed" + speed; //complete rest of the part.
	}
	
}