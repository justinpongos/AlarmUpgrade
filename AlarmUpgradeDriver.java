import javax.swing.JOptionPane;
public class AlarmUpgradeDriver {

		public static void main(String[]args) {
		
			AlarmUpgrade Timer = new AlarmUpgrade();
			
			int hours = Integer.parseInt(JOptionPane.showInputDialog("Please enter hours"));
			int minutes = Integer.parseInt(JOptionPane.showInputDialog("Please enter minutes"));
			int seconds = Integer.parseInt(JOptionPane.showInputDialog("Please enter seconds"));
			String pmam = JOptionPane.showInputDialog("am or pm");
			
			boolean pmam0 = Timer.getAmPM();
			
			if (pmam.equals("am")) {
				pmam0 = false;
			}//end if
			if (pmam.equals("pm")) {
				pmam0 = true;
			}//end if
		
			Timer.setTime(hours,minutes,seconds,pmam0);
			int total = Timer.totalSeconds();
			System.out.println("test: " + total);
			System.out.println("Verifying your alarm is set for " + pmam);
			System.out.println(Timer);
			
		}//end main
	}//end class
