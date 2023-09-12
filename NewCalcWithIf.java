import java.util.Scanner;

public class NewCalcWithIf {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double fahrenheit, celsius;
		System.out.println("Enter 'f' to convert from Fahrenheit to Celsius or enter 'c' to convert from Celsius to Fahrenheit.");

		char c1 = keyboard.findWithinHorizon(".", 0).charAt(0);

		if (c1 == 'f') {
			System.out.println("Enter Temperature in Fahrenheit: ");
			fahrenheit = keyboard.nextDouble();
			celsius = 5.0/9.0 * (fahrenheit - 32.0);
			System.out.println("Temperature in Celsius is: " + celsius);

		}
		
		if (c1 == 'c'){
			System.out.println("Enter Temperature in Celsius: ");
			celsius = keyboard.nextDouble();
			fahrenheit = 9.0/5.0 * celsius + 32.0;
			System.out.println("Temperature in Fahrenheit is: " + fahrenheit);
		}
		
		if (c1 != 'c' && c1 != 'f'){
			System.out.println("Please enter either 'c' or 'f'.");
		}
		
		//how do we get this to recycle back to our initial if.
		//Probably we will start with this if and make the other conditions else statements.
		
		keyboard.close();
	}
}
