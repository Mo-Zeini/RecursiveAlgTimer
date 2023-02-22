package RecursiveAlgTimer;
import java.util.Scanner; // Add the Scanner class to the program.

/**
 * This program counts down as a timer. It uses a recursive algorithm instead of using a loop. 
 * It uses the decremented number as an actual parameter for the method call of countDown() 
 * until the method reaches its base case, which is 1.
 * Precondition: The inserted value must be a positive integer.
 * Postcondition: The timer counts down to 1. Then, the program prints out Down!
 * If the inserted value is floating-point or negative, the program will print out only Done.
 * @author mohamed_elzeini
 */

public class RecursiveAlgTimer {

	public static void main(String[] args) {

		// Creating the scanner to ask the user for an input.
		try (Scanner stdin = new Scanner(System.in)) {
			System.out.print("Please, enter a positive integer to start counting down with: ");
			double positveInt = stdin.nextDouble(); // Ask the user for a value and store it.

			countDown(positveInt); // Function call.
		}

		catch (IllegalArgumentException e) {
			System.out.println("Something went wrong!");
		}


	} // end of main()

	public static void countDown(double num) {

		if (num > 0 && num == (int)num) {

			System.out.println((int)num); // Printing and converting the double value to integer.
			System.out.println("\n");

			try {
				Thread.sleep(1000); // Pause the main thread execution for 1 second.
			}
			catch (InterruptedException e) {
			}

			double i = num;
			countDown(i - 1); // Calling the function to itself recursively.
		}

		else
			System.out.println("Done!");
	} // end of countDown()

} // end of class RecursiveAlg
