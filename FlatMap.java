package StreamTasks;

import java.util.Arrays;
import java.util.List;


public class FlatMap {
public  static void main(String[]args) {
	List<Integer> nums = Arrays.asList(10, 20, 10, 30, 45, 20, 15);
	List<Integer> nums1 = Arrays.asList(12, 34, 4, 5, 23, 12);
	List<Integer> nums2 = Arrays.asList(12, 33, 22, 21);
	List<List<Integer>>nums3=Arrays.asList(nums,nums1,nums2);
	List<Integer> nums4=nums3.stream().flatMap(x->x.stream()).toList();
	int evenNum=nums4.stream().filter(n->n%2==0).mapToInt(Integer::intValue).sum();
    int oddNum=nums4.stream().filter(n->n%2!=0).mapToInt(Integer::intValue).sum();
    
   System.out.println(evenNum+" "+oddNum);
   System.out.println(nums4);
   
}
}
