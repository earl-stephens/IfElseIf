package application;

import java.util.Scanner;

//package <package name> must be the first line in the class
public class App {

	public static void main(String[] args) {

		System.out.println("Menu");
		System.out.println("====");
		//Can't havee double quotes within double quotes
		System.out.println("1. Print 'hello'");
		System.out.println("2. Exit program");
		//this is another way to output a blank line
		System.out.println();
		System.out.print("Enter an option > ");
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		scanner.close();

		if(input == 1) {
			System.out.println("Hello");
		}
		else if(input == 2) {
			System.out.println("Good bye");
		}
		else {
			System.out.println("Invalid option");
		}
		//else runs if the if or else if statement is not run/true
	}

}
