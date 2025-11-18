package threadsandparallelcalculation.deadlock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DeadLockTest {

	public static void main(String[] args) {
		// Crear un objeto de clase @link {DeadLockTest}
		DeadLockTasks tasks = new DeadLockTasks();
		// Crear un objeto que nos administra un grupo de hilos reutilizable
		ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		// Entregamos las tareas a traves de submit para ejecutarlas en los hilo
		// paralelamente
		for (int i = 0; i < 2; i++) {

			executor.submit(() -> {
				tasks.task1();

			});
		}
		for (int i = 0; i < 2; i++) {
			executor.submit(() -> {

				tasks.task2();
			});
		}
//		for (int i = 0; i < 2; i++) {
//
//			executor.submit(() -> {
//				tasks.task3();
//
//			});
//		}
//		for (int i = 0; i < 2; i++) {
//
//			executor.submit(() -> {
//				tasks.task4();
//
//			});
//		}
		try {
			executor.awaitTermination(200, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
