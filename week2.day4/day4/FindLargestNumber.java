package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindLargestNumber {

	public static void main(String[] args) {
		
	    int[] data = {3,2,11,4,6,7};
		
		List<Integer> Sl = new ArrayList<Integer>();
		for(int i=0; i<data.length; i++) {
			Sl.add(data[i]);
		}
		Collections.sort(Sl);
		System.out.println("The updated list is: "+Sl);
		
		System.out.println("The second largest number in the list is: "+Sl.get(Sl.size()-2));
	}}