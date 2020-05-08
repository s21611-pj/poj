/**
 * Exercise 7 - Grades statistics
 * Author: Wojtek Turek
 */

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class GradesStatistics {
    public static void main(String[] args) {

        System.out.print("Enter the number of students: ");
        int numStudents = new Scanner(System.in).nextInt();

        int[] studentsGrades = new int[numStudents];

        boolean inputValidate;
        for(int i = 0 ; i < numStudents; i++) {
            do {
                System.out.print("Enter the grade for student (0-100 points) " + (i+1) + ": " );
                Scanner scanner = new Scanner(System.in);
                int grade = scanner.nextInt();
                if(grade >= 0 && grade <= 100) {
                    inputValidate = true;
                    studentsGrades[i] = grade;
                    scanner.nextLine();
                } else {
                    System.out.println("Please enter number in range 0-100");
                    inputValidate = false;
                    scanner.nextLine();
                }
            } while(!inputValidate);
        }

        printGrades(studentsGrades);
        printAverage(studentsGrades);
        printMedian(studentsGrades);
        printMinAndMax(studentsGrades);
        printStandardDeviation(studentsGrades);

    }

    public static void printGrades(int[] array) {
        System.out.println("The grades are " + Arrays.toString(array));
    }

    public static void printAverage(int[] array) {
        double sum = 0.0;
        for(int i : array) {
            sum += i;
        }
        double mean = sum / array.length;
        System.out.println(String.format(Locale.US, "The average is: %.2f ", mean));
    }

    public static void printMedian(int[] array) {
        double median;
        Arrays.sort(array);
        if(array.length % 2 != 0) {
            median = array[(array.length/2)];
            System.out.println(String.format(Locale.US, "The median is: %.2f", median));
        } else {
            median = ((double)array[array.length/2-1] + (double)array[array.length/2]) / 2;
            System.out.println(String.format(Locale.US, "The median is: %.2f", median));
        }

    }

    public static void printMinAndMax(int[] array) {
        Arrays.sort(array);
        System.out.println("The minimum is: " + array[0]);
        System.out.println("The maximum is: " + array[array.length-1]);
    }

    public static void printStandardDeviation(int[] array) {
        double sum = 0.0, variance = 0.0;
        for(int i : array) {
            sum += i;
        }
        double mean = sum / array.length;
        for(int i : array) {
            variance += Math.pow((i - mean), 2);
        }
        variance /= array.length;
        System.out.println(String.format(Locale.US, "The standard deviation is: %.2f", Math.sqrt(variance)));
    }
}
