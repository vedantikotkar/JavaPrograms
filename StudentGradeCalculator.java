import java.util.Scanner;

public class StudentGradeCalculator {
   public static void main(String[] args) {

      try (Scanner sc = new Scanner(System.in)) {
         System.out.println("Enter the number of subjects for student ");
         int numSubjects = sc.nextInt();

         int[] scores = new int[numSubjects];
         int sum = 0;

         for (int subjectIndex = 0; subjectIndex < numSubjects; subjectIndex++) {
            System.out.print("Enter the score for subject " + (subjectIndex + 1) + ": ");
            scores[subjectIndex] = sc.nextInt();
            sum += scores[subjectIndex];
            if (scores[subjectIndex] >= 35) {
               System.out.println("passed in this subject");
            } else {
               System.out.println("Failed in this subject");
            }

         }

         double averagePercentage = (double) sum / numSubjects;
         System.out.println("Average score for student is: " + averagePercentage);

         if (averagePercentage >= 90) {
            System.out.println("Grade : A+");
         } else if (averagePercentage >= 80) {
            System.out.println("Grade : A");
         } else if (averagePercentage >= 70) {
            System.out.println("Grade : B");
         } else if (averagePercentage >= 60) {
            System.out.println("Grade : C");
         } else if (averagePercentage >= 45) {
            System.out.println("Grade : D");
         } else {
            System.out.println("Failed");
         }
      }
   }
}