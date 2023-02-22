package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student std = new Student();
		System.out.print("Student Name: ");
		std.name = sc.nextLine();
		System.out.print("Grade 1: ");
		std.grade1 = sc.nextDouble();
		System.out.print("Grade 2: ");
		std.grade2 = sc.nextDouble();
		System.out.print("Grade 3: ");
		std.grade3 = sc.nextDouble();
		
		System.out.println();
		System.out.println("FINAL GRADE = " + std);

		if (std.finalGrade() >= 60)
			System.out.println("PASS");
		else {
			System.out.println("FAILED");		
			System.out.printf("MISSING %.2f POINTS%n", std.missingPoints());
		}

		sc.close();

	}

}
