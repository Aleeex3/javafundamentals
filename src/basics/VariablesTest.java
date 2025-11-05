package basics;

public class VariablesTest {
	
	boolean isRunning = false;
	
	public static void main(String[] args) {
		// tipo + nombre de la variablee = el valor concreto
		boolean isRunning = true;
		isRunning = false;
		
		byte number0 = 120;
		
		short number1 = 23;
		number0 = (byte)number1;
		System.out.println("number0 =" + number0);
		number1= number0;
		int number2 = 999999; 
	}
	
	void stop() {
		isRunning = false;
		
	}

}
