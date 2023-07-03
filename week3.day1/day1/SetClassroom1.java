package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetClassroom1 {

	public static void main(String[] args) {
		

        String CompanyName= "google";
		String output ="";
		char[] cn = CompanyName.toCharArray();
		Set<Character> name = new LinkedHashSet<Character>();
		for(Character i : cn) {
			if(name.add(i)) {
				output=output+i;
			}
			}
		System.out.println(output);
		System.out.println(name);
		
	}
	}


