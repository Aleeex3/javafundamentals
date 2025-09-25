package threadsandparallelcalculation;

public class Airport { 
	private int counter = 0 ;
	//

	public synchronized void increment() {
		// 
		// incrementar el valor de la variable de counter por uno
		// counter = counter +1
		// los dos comandos son iguales
		// CPU
		// PASO 1: leer el valor actual de la variable 'counter', la mmete en la memoria
		//PASO 2: hacer la suma con el valoir actual de 'counter' con 1
		// PASOO 3: actualizar el valor guardado enla variable con el valor nuevo
		counter++;
		
	}
	public void decrease() {
		// decrecer el valor de la variable por uno
		synchronized(this) {
		counter--;
	}
	}
	public int getCounter() {
		return counter;
	}
	
	

}
