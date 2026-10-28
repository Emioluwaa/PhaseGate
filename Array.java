public class Array {
	public static int [ ] [ ] reverseArray (int [ ] [ ] array) {
	
for (int count = 0; count < array.length; count++) {
	for (int row = 0; row < array[count].length; row++) {
		for (int column = row; column < array[count].length; column++) {
		
	int original = array[count][row];
	array[count][row] = array[count][column];
	array[count][column] = original;
		}
	}
}
        return array;
}
  public static void main(String[] args) {
          int [ ] [ ] array = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
          int [ ] [ ] result = reverseArray(array);
  for (int row = 0; row < result.length; row++){
    for (int column = 0; column < result.length; column++){
    System.out.print(result[row][column] + " ");
        }
        System.out.println();
    }
 }
 }
