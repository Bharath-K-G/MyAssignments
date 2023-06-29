package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,7,6,8};
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<arr1.length; i++) {
			list.add(arr1[i]);
		}
		Collections.sort(list);
		System.out.println("The updated list is: "+list);
		
		for(int i=0; i<list.size(); i++) {
			if((i+1)!=list.get(i)) {
				System.out.println("The missing element in the list is: "+(i+1));
				break;
             
        	 }
         }

	}
}
