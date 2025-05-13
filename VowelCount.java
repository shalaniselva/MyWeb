package StreamTasks;


import java.util.List;
import java.util.stream.Collectors;

public class VowelCount {
	public static void main(String[] args) {
		String a = "Shalini";
		
		List<Character> chars =  a.chars().mapToObj(x ->(char) x)
				.filter(x-> x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u').collect(Collectors.toList());
		System.out.println(chars);
		
		long count=a.chars().mapToObj(x->(char)x).filter(x-> (char) x=='a'||x=='e'||x=='i'||x=='o'||x=='u').count();
		System.out.println("vowel count: "+count);
		/*
		 * long Ccount=a.chars().filter(x-> ).count(); System.out.println(Ccount);
		 */

	}
}
