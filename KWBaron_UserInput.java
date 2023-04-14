/*
Kevin Baron
11/5/12
User Input Lab
*/

import java.util.Scanner;

public class KWBaron_UserInput {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
// 		problem1(console);
// 		problem2(console);
// 		problem3(console);
// 		problem4(console);
// 		problem5(console);
 		problem6(console);
 		problem7(console);
	}//eomain
	public static void problem1(Scanner console) {
		System.out.println("What is your name?");
		String userName = console.next();
		for (int i = 1; i <= 3; i++) {
			System.out.println("Hi, " + userName + "!");
		}//eofor
		System.out.println();
	}//eoproblem1
	public static void problem2(Scanner console) {
		System.out.println("Two integers, please.");
		int x = console.nextInt();
		int y = console.nextInt();
		System.out.println("Sum: " + (x + y) + "\n");
	}//eoproblem2
	public static void problem3(Scanner console) {
		System.out.print("How old are you? ");
		int age = console.nextInt();
		System.out.print("What year is it? ");
		int year = console.nextInt();
		System.out.print("Pick a year in the future. ");
		int futureYear = console.nextInt();
		System.out.println("\nIn the year " + futureYear +
		", you will be " + (age + futureYear - year) + " years old.\n");
	}//eoproblem3
	public static void problem4(Scanner console) {
		System.out.println("Four grades, please. (On a 100-point scale)");
		double sum = 0;
		for (int i = 1; i <= 4; i++) {
			sum += console.nextDouble();
		}//eofor
		System.out.printf("\nYour average grade is %.2f\n", (sum / 4));
	}//eoproblem4
	public static void problem5(Scanner console) {
		System.out.print("What is your first name? ");
		String first = console.next();
		System.out.print("What is your middle initial? ");
		String middle = console.next();
		System.out.print("What is your last name? ");
		String last = console.next();
		String full = last + ", " + first + " " + middle;
		System.out.println(full.toUpperCase() + "\n");
	}//eoproblem5
	public static void problem6(Scanner console) {
		int falseCounter = 0;
		System.out.print("So......Sally! You hit the books every night? ");
		if (console.nextBoolean() == false) {
			falseCounter++;
		}//eoif
		System.out.print("Hmmmmm, I see. Your big sister \"helps\" you with your homework? ");
		if (console.nextBoolean() == false) {
			falseCounter++;
		}//eoif
		System.out.print("These questions are gettin' tough, huh? You CHEATED Sally Smith!\n" +
		"I KNOW YOU DID IT! I'VE GOT A SNITCH ON YOU! NOW TELL ME THE GODDAMN TRUTH? ");
		if (console.nextBoolean() == false) {
			falseCounter++;
		}//eoif
		String determination = "GUILTY";
		if (falseCounter > 1) {
			determination = "INNOCENT";
		}//eoif
		String finalWords = "Well, Sally, we've made our decision. We think you are...";
		System.out.print(finalWords);
		for (int i = 0; i < 30; i++) {
			System.out.println();
			for (int j = 1; j <= finalWords.length() + i - 2; j++) {
				System.out.print(" ");
			}//eofor
			System.out.print("...");
		}//eofor
		System.out.println(determination + "!\n");
	}//eoproblem6
	public static void problem7(Scanner console) {
		System.out.print("Now Jeremiah, you little bullfrog you, how many days was the rental for? ");
		int rentalDays = console.nextInt();
		System.out.print("Jeremiah, you were a good friend of mine, but how many days did it take you to return the video? ");
		int returnDays = console.nextInt();
		int debt = 0;
		if (returnDays > rentalDays) {
			debt = 4 * (returnDays - rentalDays);
		}//eoif
		System.out.println("Jeremiah, I never understood a single word you said, but you owe our store $" + debt + ".\n" +
		"Have a nice day and JOY TO THE WORLD!\n");
	}//eoproblem7
}//eoclass