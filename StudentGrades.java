import java.util.*;

public class StudentGrades {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many Student do you have?");
        int Students = input.nextInt();
        System.out.println("How many subject do they offer? ");
        int Subjects = input.nextInt();

        int [ ][ ] scores = new int[Students][Subjects];
      
        System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Saved successfully!");
        for (int index = 1; index <= Students; index++) {
            for(int count = 1; count <= Subjects; count++) {
                
                System.out.println("Entering score for student " + index +" ");
                System.out.println("Enter score for subject " + count + " ");
                int SUB1 = input.nextInt();
                scores[index - 1][count - 1] = SUB1;
    
                System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Saved successfully!");
            }
        }
  
        System.out.println("\n==================================================");
        System.out.println("                              SUBJECT SUMMARY                                         "); 
        System.out.println("===================================================");

        int passingMark = 50;

        for (int count = 1; count <= Subjects; count++) {
            int totalScore = 0;
            int highestScore = scores[0][count - 1];
            int highestStudent = 1;
            int lowestScore = scores[0][count - 1];
            int lowestStudent = 1;
            int passes = 0;
            int fails = 0;

            for (int index = 1; index <= Students; index++) {
                int currentScore = scores[index - 1][count - 1];
                totalScore += currentScore;

                if (currentScore > highestScore) {
                    highestScore = currentScore;
                    highestStudent = index;
                }

                if (currentScore < lowestScore) {
                    lowestScore = currentScore;
                    lowestStudent = index;
                }

                if (currentScore >= passingMark) {
                    passes++;
                } else {
                    fails++;
                }
            }

            double averageScore = (double) totalScore / Students;

            System.out.println("Subject " + count);
            System.out.println("Highest scoring student is: Student " + highestStudent + " scoring " + highestScore);
            System.out.println("Lowest Scoring student is: student " + lowestStudent + " scoring " + lowestScore);
            System.out.println("Total Score is: " + totalScore);
            System.out.printf("Average score is: %.2f\n", averageScore);
            System.out.println("Number of passes: " + passes);
            System.out.println("Number of Fails: " + fails);
            System.out.println("==================================================");
        }
    }
}
