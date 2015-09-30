
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		float num1;
		float num2;
		float sum;
		float quotient;
		float difference;
		float product;
		char response = 'Y';

		Scanner input = new Scanner(System.in);

		System.out.print("You will be entering two numbers.");

		do {
			System.out.println("Please enter the first number and press enter: ");
			num1 = input.nextInt();

			System.out.print("Enter the second number and press enter: ");
			num2 = input.nextInt();

			sum = num1 + num2;
			quotient = num1 / num2;
			difference = num1 - num2;
			product = num1 * num2;

			System.out.print("Select what you would like to do with the numbers: \n");
			System.out.print("Select \"S\" for the sum \n");
			System.out.print("Select \"D\" for the difference \n");
			System.out.print("Select \"P\" for the product \n");
			System.out.print("Select \"Q\" for the quotient \n");
			char answer = input.next().toUpperCase().charAt(0);

			if (answer == 'S')
				System.out.printf("The sum is: " + sum + "\n");
			else if (answer == 'P')
				System.out.printf("The product is: " + product + "\n");
			else if (answer == 'D')
				System.out.printf("The difference is: " + difference + "\n");
			else if (answer == 'Q')
				System.out.printf("The quotient is: " + quotient + "\n");
			else
				System.out.println("You have entered an invalid character.");

			System.out.println("Do it again?");
			response = input.next().toUpperCase().charAt(0);
		} while (response != 'N');
		
		System.out.println("Goodbye!");
	}

}
