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
    
  System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
  System.out.println("Saved successfully!");
              }
    }
  





	}
	  //  public static void ([] SUB1) {  
       //System.out.println("\n" + STUDENT + "   " +  );
     //  System.out.println("========================");
     //  System.out.println(SUB1[count] + "    " +  SUB1[index]);
      // System.out.println("====================================================");
       //System.out.println(SUB[count] + "   " + "\n");    
      // System.out.println("==================================================");
       //System.out.println(SUB1[count] + "    "+ SUB1[index] + "   " + ;
       //System.out.println("====================================================");
    //   System.out.println( SUB1[6] + "|" + SUB1[7] + "|" + SUB1[] + "\n");    

}
