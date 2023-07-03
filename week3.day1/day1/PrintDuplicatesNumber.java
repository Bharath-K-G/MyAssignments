package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicatesNumber {
	public static void main(String[] args) {
		int[] data = {4,3,6,8,29,1,2,4,7,8};
		
		Set<Integer>unqiue =new LinkedHashSet<Integer>();
		Set<Integer>duplicate =new LinkedHashSet<Integer>();

		for(int i=0;i<data.length;i++){
			boolean add=unqiue.add(data[i]);
			if(!add) {
				duplicate.add(data[i]);

			}
			}
			System.out.println(duplicate);
			}

	}
    

