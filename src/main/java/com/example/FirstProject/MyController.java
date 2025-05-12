package com.example.FirstProject;

import java.util.ArrayList;
import java.util.Comparator;

import java.util.List;

import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping(value = "/getthis")
	// get the is is a end point

	public String getMessage() {
		return "Hello World";
	}

	@GetMapping(value = "/getval")
	public String getName() {
		return "Shalini";
	}

	@GetMapping(value = "/get/{n}")
	public String getNames(@PathVariable String n) {
		return n + " Shalini";
	}
	@GetMapping("/getValues")
	public ResponseEntity<Object> getHello(){
		return ResponseEntity.ok("Hello world");
	}
	@GetMapping(value = "getmin/{m}")
	public String getmin(@PathVariable int m) {
		if (m % 2 == 1) {
			return "Even";
		} else {
			return "Odd";

		}
	}
	

	@GetMapping(value = "geti/{n}")
	public String getVal(@PathVariable int n) {
		if (n % 2 == 0) {
			return "Even";
		} else {
			return "Odd";

		}
	}

	@GetMapping(value = "/getMax/{a}/{b}/{c}")
	public int getMax(@PathVariable int a, @PathVariable int b, @PathVariable int c) {
		if (a > b && a > c) {
			return a;
		} else if (b > c && b > a) {
			return b;
		} else {
			return c;
		}
	}

	@GetMapping(value = "/getPrime/{a}/{b}")
	public ArrayList<Integer> getPrime(@PathVariable int a, @PathVariable int b) {
		ArrayList<Integer> prime = new ArrayList<>();
		for (int i = a; i <= b; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				prime.add(i); 
			}

		}
		return prime;

	}

	@GetMapping(value = "/getChar/{a}")
	public char getChar(@PathVariable String a) {
		return a.charAt(a.length() - 1);
	}

	@GetMapping(value = "/getAccess")
	public String get(@RequestParam String a, @RequestParam String b) {
		if (a.equals("OneSoft") && b.equals("904030")) {
			return "Successful";
		} else {
			return "failed";
		}
	}

	@GetMapping(value = "/getAge")
	public String getAge(@RequestParam int a) {
		if (a >= 18) {
			return "ELIGIBLE FOR VOTE";
		} else {
			return "NOT ELIGIBLE";

		}
	}

	@GetMapping(value = "/getObject")
	public Car getCar1(@RequestBody Car c) {
		return c;
	}

	@GetMapping(value = "/getObjects")
	public Car getCar(@RequestBody List<Car> c) {
		return c.stream().sorted(Comparator.comparing(Car::getPrice).reversed()).findFirst().get();
	}

	@GetMapping(value = "/getB/{d}")
	public List<Car> getBmw(@RequestBody List<Car> c, @PathVariable String d) {
		return c.stream().filter(x -> x.getName().equals(d)).collect(Collectors.toList());
	}

//	@GetMapping(value="/getValue2")
//   public String getfi(@RequestParam String a) {
//        Set<Character> lower = new HashSet<>();
//	Set<Character> duplicatesLower = new HashSet<>();
//        Set<Character> upper = new HashSet<>();
//        Set<Character> uniqueUpper = new HashSet<>();
//
//        for (char x : a.toCharArray()) {
//            if (Character.isLowerCase(x)) {
//               if (!lower.add(x)) {
//                   duplicatesLower.add(x);
//                }
//            } 
//            else if (Character.isUpperCase(x)) {
//                if (!upper.add(x)) {
//                    uniqueUpper.remove(x); // Not unique anymore
//                } 
//                else {
//                    uniqueUpper.add(x); // Potentially unique
//                }
//            }
//        }
//
//        String lowerResult = duplicatesLower.stream()
//                .sorted()
//                .map(c -> String.valueOf(c))
//                .collect(Collectors.joining());
//
//        String upperResult = uniqueUpper.stream()
//                .sorted()
//                .map(c -> String.valueOf(c))
//                .collect(Collectors.joining());
//
//        return lowerResult + upperResult;
//   }
	

}
