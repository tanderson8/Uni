
public class Time {

	private int hour;
	private int minute;
	private int second;
	
	public Time() {
		this(System.currentTimeMillis());
	}
	//A constructor with a specified elapsed time since midnight, January 1, 1970
	public Time(long elapsedTime) {
		setTime(elapsedTime);
	}
	//A constructor with the specified hour, minute, and second.
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public void setTime(long elapsedTime) {
		// Obtain the total seconds since the midnight, Jan 1, 1970
		long totalSeconds = elapsedTime / 1000;
		this.second = (int) totalSeconds % 60;
		this.minute = (int) (totalSeconds / 60) % 60;
		this.hour = (int) (totalSeconds / 3600) % 24;
	}
	
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}
	
	
}
