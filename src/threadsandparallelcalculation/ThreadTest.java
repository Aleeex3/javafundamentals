/**
 * 
 */
package threadsandparallelcalculation;

/**
 * 
 * @author tanku Sep 12, 2025
 */
public class ThreadTest {

	public static void main(String[] args) {
		Airport airport = new Airport();
		
		// Creacion de un nuevo hilo
		Thread thread1 = new Thread(new EntranceRegistrationTask(airport));
		// Ejecuta la tarea que tiene el hilo
		thread1.start();
		Thread thread2 = new Thread(new ExitRegistrationTask(airport));
		thread2.start();
		try {
			// Hace que el hilo main se duerma 4 segundos
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.println(airport.getCounter());
	System.out.println(Runtime.getRuntime().availableProcessors());
}
}	