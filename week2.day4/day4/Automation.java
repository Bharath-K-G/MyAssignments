package week2.day4;

public class Automation extends MultipleLanguage {

	public void selenium() {
		System.out.println("Selenium using automation");
		
	}

	public void java() {
		System.out.println("Java programming language");
	}

	@Override
	public void ruby() {
				System.out.println("Ruby is used in here");
	}
	public static void main(String[] args) {
		Automation Ai = new Automation();
		Ai.java();
		Ai.selenium();
		Ai.python();
		Ai.ruby();
	}

	
		
	
	
	

	
	}


