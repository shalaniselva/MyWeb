package StreamTasks;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateRemove {
public static void main(String[]args) {
	String a="@123&";
	List<Character> sc = a.chars() // IntStream of char values
            .mapToObj(c -> (char) c) // convert to Character stream
            .filter(c -> !Character.isLetterOrDigit(c)) // filter special characters
            .collect(Collectors.toList());
	System.out.println(sc);
	
	// String count
	
	String b="Shalini";
	long  ch=b.chars().mapToObj(c-> (char)c).count();
	System.out.println(ch);
	String  name="Im coding";
	long count=name.chars().mapToObj(c-> (char)c).count();
	System.out.println(count);
	
	
	 // find the length of String array     
	String[] names = {"Nisha", "Kralice",  "Demet"};
	
	Map<String, Integer> nameLengths = Arrays.stream(names)
	  .collect(Collectors.toMap(Function.identity(), String::length));
	 System.out.println(nameLengths);
	 

	
	 // convert to Uppercase
	List<String> alapa=Arrays.asList("aaa","ccc","ddd","rrr","sss");
	List<String> al=alapa.stream().map(String::toUpperCase).toList();
	System.out.println(al);
}
}
