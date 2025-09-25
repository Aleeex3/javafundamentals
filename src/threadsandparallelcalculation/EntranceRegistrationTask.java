package threadsandparallelcalculation;

//Tareas Paralelas 1: En un aeropuerto, hay varias entradas, tenemos que registrar las salidas y entradas de todas las personas
// Esta clase es una implementacion de la tarea para ser ejecutadda por un hilo
/**
 * 
 * PC-ProfesorCVE 19 sept 2025
 */
public class EntranceRegistrationTask implements Runnable {
	private Airport airport;

	public EntranceRegistrationTask(Airport airport) {
		this.airport = airport;
		// TODO Auto-generated constructor stub
	}

	// El metodo run es donde se define la tarea para un hilo
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Start the task");
		try {
			System.out.println("The thread name is" + Thread.currentThread().getName() + " has entered in the sleep mode");
			Thread.sleep(2000);
			for (int i = 0; i < 1000; i++) {
				airport.increment();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The task is finished");
	}
}