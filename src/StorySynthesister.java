
//Adapted from... P. Kumar, "Java main method", JournalDev, 2019. [Online]. Available: https://www.journaldev.com/12552/public-static-void-main-string-args-java-main-method. [Accessed: 30- May- 2019].

import java.util.Scanner; // Imports the Scanner class which helps collect user input.

public class StorySynthesister { // This is the name of our application!

	public static void main(String[] args) { /*
												 * this is the most important Java method - without going into too much
												 * detail, this line of code makes sure: it's accessible from anywhere
												 * (public), you can start it without creating an instance (static), and
												 * it doesn't return anything (void). It's the starting point.
												 */

		String first, second; // Creating objects with String class . String deals with characters.
		String newLine = System.getProperty("line.separator"); // This will retrieve a line separator dependent on OS.
																// It is used for readability.
		int year; // int is another class that only deals with integers (whole numbers)
		// Here I am setting up objects to use in my code later on, to prevent
		// repetition.

		System.out.println("Please enter your name:"); // Asks the user to enter their name in the console
		Scanner yourname = new Scanner(System.in); // Creates a Scanner object which holds the properties of the user
													// input. (You type x, first = x)
		first = yourname.nextLine(); // Reads user input for use later on

		System.out.println("Now please enter the name of our Intro to Programming teacher:"); // Same as above but need
																								// a new object for
																								// another name
		Scanner hisname = new Scanner(System.in);
		second = hisname.nextLine();

		System.out.println(
				"Finally, please enter the current year (e.g 1920):"); /*
																		 * Same as above but now with integer class
																		 * instead of String. Pitfall of using int
																		 * instead of string is that if the user inputs
																		 * something other than a number, it crashes.
																		 */
		Scanner time = new Scanner(System.in);
		year = yourname.nextInt();

		// final print containing user inputs and newLine object.
		System.out.println("It was the year " + year + " and the winter winds had just settled into " + first
				+ "'s bones and the pale glow of the Eclipse IDE did nothing to warm them. " + newLine + "You see, "
				+ first + " was a programmer just starting out in the vast and confusing world of PROGRAMMING. " + first
				+ " was pulling their hair and their teeth could be heard gnashing from miles away." + newLine
				+ "Serendipitously, a holy light beamed down upon " + first
				+ " and they were struck with the all knowing glow of " + second + ". " + newLine
				+ "'STACK EXCHANGE WILL BE YOUR SALVATION!' he decreed, fixing bugs with his right hand and changing Eclipse into Dark Mode with his left. "
				+ newLine + first
				+ " sat in awe as the deity then shot through the ceiling, surely to help other young devs in need."
				+ newLine + "The moral of this story, young readers, is that if you're whether you're a " + first
				+ " or a " + second + ", no one likes light theme IDEs.");

	}
}
