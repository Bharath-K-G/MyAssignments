package week1.day1;

public class Car {

	public void driveCar() {
		System.out.println("drivecar");
	}
	public void applyBrake(){
		System.out.println("applyBrake");
	}
	public void soundHorn() {
		System.out.println("soundHorn");
	}
	public void isPuncture() {
		System.out.println("isPuncture");
	}
	public static void main(String[] args) {
	
		Car BMW=new Car();
		BMW.driveCar();
		BMW.applyBrake();
		BMW.soundHorn();
		BMW.isPuncture();
	}
}
