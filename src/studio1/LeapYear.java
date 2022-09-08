package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("The year to check?");
		double year = in.nextInt();
		boolean foureven = (year % 4 == 0);
		boolean hundoeven = (year % 100 == 0);
		boolean fhuneven = (year % 400 == 0);
		boolean leap = (foureven != hundoeven);
		boolean leaptrue = (leap != fhuneven);

		
		System.out.print(year + " is a leap year: " + leaptrue);

	}

}
