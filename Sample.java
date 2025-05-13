package StreamTasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Sample {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(10, 20, 10, 30, 45, 20, 15);
		List<Integer> nums1 = Arrays.asList(12, 34, 4, 5, 23, 12);
		List<Integer> nums2 = Arrays.asList(12, 33, 22, 21);
		List<List<Integer>> l = Arrays.asList(nums, nums1, nums2);
		/*
         //calculate sum of even numbers
		
		List<Integer> evenSum = l.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();

		// Calculate sum of odd numbers

		List<Integer> oddSum = l.stream().filter(n -> n % 2 != 0).mapToInt(Integer::intValue).sum();
		System.out.println(even);
*/
		
		// get sum of even int array 
		
		int []value= {10,10,3,45,7,3,4,6};
		int sum=Arrays.stream(value).filter(x-> x%2==0).sum();
		System.out.println(sum);
		
		// find duplicate values
		Set<Integer> dup = new HashSet<>();
		List<Integer> n = nums.stream().filter(x -> !dup.add(x)).toList();
		System.out.println(n);

		// print even num only
		List<Integer> n1 = nums.stream().filter(x -> x % 2 == 0).toList();
		System.out.println(n1);

		// convert integer to float values
		float add = nums.stream().collect(Collectors.summingInt(x -> x));
		System.out.println(add);

	}
}
