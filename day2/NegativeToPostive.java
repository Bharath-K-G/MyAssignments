package week1.day2;

public class NegativeToPostive {

	public static void main(String[] args) {
		
		int num = -40;
	if(num>0) {
		System.out.println("The number is positive:" +num);
		
	}
	else if(num==0){
		System.out.println("The number is negative or positive:" +num);
	 
	}
	else {
		System.out.println("The number is negative:" +num);
		num =(-num);	
	System.out.println("The negative number is converted into positive number:" +num);
		
	}
	}
}

	

