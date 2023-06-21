package week1.day3;

public class StringNew {

	public static void main(String[] args) {
		
		String name="Amazon";
		char[] charArray=name.toCharArray();
		
		
		for (int i = charArray.length-1; i>=0; i--) {
			System.out.print(charArray[i]);
		}
		
		
	}
}
