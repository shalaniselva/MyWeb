package StreamTasks;

import java.util.Arrays;
import java.util.List;

public class RemoveDupIntArray {
	public static void main(String[] args) {
		// remove the duplicate in int array

		int[] a = { 1, 2, 3, 2, 3, 2, 5, 6, 7 };
		 
		int [] dupRemove = Arrays.stream(a).distinct().toArray();
		
		System.out.println(Arrays.toString(dupRemove));

		// sorting the int array

		List<Integer> sort = Arrays.stream(a).boxed().distinct().sorted().toList();
		
		System.out.println(sort);
	}
}
