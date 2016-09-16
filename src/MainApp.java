import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		int range;
		int counter = 0;
		long output;
		int sum =0;

		System.out.println("Enter a number and we will find all multiples of 13:");

		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		range = input.nextInt();
		// store input into a variable range

		// Find all number divisible by 13 up to the range

		// Tell the user all the numbers divisible by 13 within range
		while (counter <= range) {

			if (counter % 13 == 0) {
				
				sum = sum + counter;
				
			}//if loop ends
			counter++; // counter= counter + 1; same statement
		}//while loop end
		System.out.println("The sum of the numbers divisible by 13 from 0 to " + range +" is " + sum);
	}

}