 package internship;

public class Secondsinaday {
	public static void main(String[] args) {
		System.out.println("Number of seconds in a day:"+ Secondsinday()); }
		public static int Secondsinday() {
		final int Seconds_in_minute = 60;
		final int Minutes_in_hour = 60;
		final int Hours_in_day = 24;
		return Seconds_in_minute*Minutes_in_hour*Hours_in_day;
		}
	}


