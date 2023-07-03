package week3.day1;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueChar {
public static void main(String[] args) {
	String name = "Bharath";
	char[] ca = name.toCharArray();
	Set<Character> name1 = new HashSet<Character>();
	for (Character i : ca) {
		name1.add(i);
	}
	System.out.println(name1);
		
	}
	
}

