package StreamTasks;

import java.util.Arrays;
//import java.util.HashSet;
import java.util.List;
//import java.util.Set;


public class CharCount {
public static void main(String[]args) {
	/*char [] chars= {'a','b','c','d','e'};
	long count2= chars.chars().maptoObj(x-> x).count();
	System.out.println(count2);*/
	List<Character>chars1 = Arrays.asList('a','a','s','d','e','f');
	int count=(int) chars1.stream().count();
	System.out.println(count);
	 String a ="Shalini";
	 String b="Dev";
	 // count using stream
	 long count1=a.chars().mapToObj(x-> x).count();
	 long count3=b.chars().mapToObj(x-> x).count();
	 System.out.println(count3);
	 System.out.println(count1);
	 
//	 List<String>nam=Arrays.asList(a);
//	 Set<String>name=new HashSet<>();

}
}
