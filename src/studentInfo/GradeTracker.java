package studentInfo;


	import java.util.Scanner;

	public class GradeTracker {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of students: ");
	        int numStudents = scanner.nextInt();

	        
	        String[] studentNames = new String[numStudents];
	        double[] studentGrades = new double[numStudents];

	        
	        System.out.println("Enter the names and grades for each student:");
	        for (int i = 0; i < numStudents; i++) {
	            System.out.print("Enter the name of student " + (i + 1) + "(In string) : ");
	            studentNames[i] = scanner.next();

	            System.out.print("Enter the grade of student " + (i + 1) + "(In Integer or Double) : ");
	            studentGrades[i] = scanner.nextDouble();
	        }

	        
	        System.out.println("\nStudent Grades:");
	        System.out.println("--------------------------");
	        System.out.println("Student Name |  Grade    |");
	        System.out.println("--------------------------");

	        
	        for (int i = 0; i < numStudents; i++) {
	            System.out.printf("%-12s |   %.2f   |%n", studentNames[i], studentGrades[i]);
	        }
	        System.out.println("--------------------------");

	        
	        double sum = 0;
	        double highestGrade = studentGrades[0];
	        double lowestGrade = studentGrades[0];

	        for (double grade : studentGrades) {
	            sum += grade;
	            if (grade > highestGrade) {
	                highestGrade = grade;
	            }
	            if (grade < lowestGrade) {
	                lowestGrade = grade;
	            }
	        }

	        double average = sum / numStudents;

	        
	        System.out.println("\nAverage Grade: " + average);
	        System.out.println("Highest Grade: " + highestGrade);
	        System.out.println("Lowest Grade: " + lowestGrade);

	        scanner.close();
	    }
	}


