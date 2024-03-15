 
public class AlarmUpgrade {
	private int hours, minutes, seconds;
	private boolean pmam;
	private String pmam0;
	//instance variables
	
	public AlarmUpgrade() {
		this.hours = 3;
		this.minutes = 45;
		this.seconds = 16;
		this.pmam = true;
	
		if (pmam == false) {
			pmam0 = "am";
		}//end if
	
		if (pmam == true) {
			pmam0 = "pm";
		}//end if
	}//end zero class statement
	
	private int setTime;
	public int setTime(int hours, int minutes, int seconds, Boolean pmam) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
		this.pmam = pmam;
		
		if (pmam == false) {
			pmam0 = "am";
		}//end if
		
		if (pmam == true) {
			pmam0 = "pm";
		}//end if
		return setTime;
	}//end setter
	
	public boolean getAmPM () {
		return pmam;
	}//end getter
	
	public int totalSeconds() {
		int total = ((this.hours)*3600) + ((this.minutes)*60) + (this.seconds); 
		return total;
	}//end public
	
	public String toString() {
	String output;
	output = "Your Alarm is set for " + hours + ":" + minutes + ":" + seconds + " " + pmam0 + "\n" + "the total number of seconds is: " + totalSeconds();
	return output;
	}//end toString
}//end class