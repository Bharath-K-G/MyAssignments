package org.system;

public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("45 cm");
	}
	
	public static void main(String[] args) {
		Desktop DT =new Desktop();
		DT.computerModel();
		DT.desktopSize();
	}
}
