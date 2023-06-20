package week1.day2;

public class NumberIsPositive {

	public static void main(String[] args) {
		int num= -40;
		
		if(num>0)
		{
			System.out.println("The number is positive ");
			
		}
		else if(num==0)
		{
			System.out.println("The number is negative or positive:" +num);
		}
		else {
			
			num=num*(-1);
			
			System.out.println("The Positive number is :" +num);
		}
		
		
	}
}
