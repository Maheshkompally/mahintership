package internship;

public class weektominutes {
	public static void main(String[] args) {
		System.out.println("Number of seconds in a day:"+ Secondsinday()); }
		public static int Secondsinday() {
		final int Minutes_in_hour = 60;
		final int Hours_in_day = 24;
		final int Days_in_week = 7;
		return Minutes_in_hour*Hours_in_day*Days_in_week;
		}

}
