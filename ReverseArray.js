function ReverseArray(num) {
for (let count = 0; count < array.length; count++) {
	for (let row = 0; row < array[count].length; row++) {
		for (let column = row; column < array[count].length; column++) {
		
	let original = array[count][row];
	array[count][row] = array[count][column];
	array[count][column] = original;
		}
	}
}
        return array;
}
	    let array = [[1, 2, 3],[4, 5, 6],[7, 8, 9]];
          let result = ReverseArray(array);
console.log(result)
