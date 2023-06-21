package week1.day3;

public class ReverseEvenWords {

	public static void main(String[] args) {
        String test = "I am a software tester";
        String[] words = test.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (i % 2 == 0) {
            	char[] characters = word.toCharArray();
                for (int j = characters.length - 1; j >= 0; j--) {
                    System.out.print(characters[j]);
                }
                System.out.print(" ");
            } else {
            	 System.out.print(word + " ");
            }
            }
            }
}
	    