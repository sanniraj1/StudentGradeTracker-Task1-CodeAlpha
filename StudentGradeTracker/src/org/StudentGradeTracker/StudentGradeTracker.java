package org.StudentGradeTracker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentGradeTracker {
	static int numStudents;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Double> grades = new ArrayList<>();

		System.out.print("Enter the number of students: ");
		numStudents = scanner.nextInt();
		
		for (int i = 1; i <= numStudents; i++) {
			System.out.print("Enter grade for student " + i + ": ");
			double grade = scanner.nextDouble();
			grades.add(grade);
		}
		System.out.println("Results of average, highest, and lowest scores of student is:");
		System.out.println("Lowest score of student  : " + findLowestGrade(grades));
		System.out.println("Average score of student : " + calculateAverageGrade(grades));
		System.out.println("Highest score of student : " +  findHighestGrade(grades));
		System.out.println();
		System.err.println("Thank you for using StudentGradeTracker ");

		scanner.close();
	}

	private static double calculateAverageGrade(ArrayList<Double> grades) {
		double sum = 0;
		for (double grade : grades) {
			sum = sum + grade;
		}
		return sum /numStudents;

	}

	private static double findHighestGrade(ArrayList<Double> grades) {
		return Collections.max(grades);
	}

	private static double findLowestGrade(ArrayList<Double> grades) {
		return Collections.min(grades);
	}
}
