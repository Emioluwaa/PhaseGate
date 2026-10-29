
import java.util.Scanner;

public class CarSlot {
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	
	 String FreeSlot = {"O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O","O"};
	
	  for (int count = 0; count <= FreeSlot.length; count++) {
	
	  System.out.println("Choose  slot from (1 - 20)" + ":");
	  int number = input.nextInt();

	  int index = number - 1;
	  
	  if (FreeSlot.length == 1 ) {
	   //   printTheSlot(slots); 
	     System.out.println("Slot Updated"  + " ");
	      continue;
	      }
	      else {
            FreeSlot[count] = FreeSlot;
    }
      if (FreeSlot  == 1) {
          slot = FreeSlot;
      } else {
          FreeSlot = FreeSlot;
      }
	     }
  }
}	
