package sgp.java.homework;

public class MonthSwitch {
	int m;
	String s;
	public MonthSwitch(int m){
		this.m = m;
	}
	
	/*
	 * Print season and month by month number
	 */
	public void printSeason(){
		
		/* Practicing switch */
				String s;
				switch(m){
					case 1: 
						if(m==1) s = "Month: January";
						/* falls through */
					case 2: 
						if(m==2) s = "Month: Fabruary";
						/* falls through */
					case 12: 
						s = "Month: December";
						System.out.println("Season: Winter\n" + s );
						break;
					case 3: 
						if(m==3) s = "Month: March";
						/* falls through */
					case 4: 
						if(m==4) s = "Month: April";
						/* falls through */
					case 5: 
						s = "Month: May";
						System.out.println("Season: Spring\n" + s );
						break;
					case 6: 
						if(m==6) s = "Month: June";
						/* falls through */
					case 7: 
						if(m==7) s = "Month: July";
						/* falls through */
					case 8: 
						s = "Month: August";
						System.out.println("Season: Summer\n" + s );
						break;				
					case 9: 
						if(m==9) s = "Month: September";
						/* falls through */
					case 10: 
						if(m==10) s = "Month: October";
						/* falls through */
					case 11: 
						s = "Month: November";
						System.out.println("Season: Fall\n" + s );
						break;					
					default: System.out.println("Wrong month number!");
				}
	}
}
