/** Week 01 – Exercises 01
 * (Git&Github - Requires lectures about Git&Github from week 01)
 * 1. Create a project in Java (Or any programming language of your choice!).
 * 1.1. Your program will invert the values of two variables. Start by assigning values to two integer variables; e.g. a =10 and b =20. Print those values with the println command. Your task now is to switch the values stored in the variables and so print again a and b. Next time you print a and b, they should have the values 20 and 10 respectively.
 * 1.2. After finishing the coding part, you should create a remote repository at Github and push your code there.
 **/

public class Excercise01 {

	public static void main(String[] args) {
		// declare variables
		int a = 10;
		int b = 20;
		int temp;
		String br = "===============";

		// print variables
		// should be a = 10, b = 20
		System.out.println("Initial values");
		System.out.println("a = " + a); 	// a = 10
		System.out.println("b = " + b); 	// b = 20
		System.out.println(br);

		// invert variable values
		temp = a;
		a = b;
		b = temp;

		// print inverted variables
		// should be a = 20, b = 10
		System.out.println("Inverted values");
		System.out.println("a = " + a); 	// a = 20
		System.out.println("b = " + b); 	// b = 10
		System.out.println(br);

	}

}