package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("The first of two integers to be averaged?");
		int n1 = in.nextInt();
		System.out.print("The second of two integers to be averaged? ");
		int n2 = in.nextInt();
		double subt = n1 + n2;
		double avg = (subt / 2);
		System.out.print("Average is: " + avg);

	}

}
