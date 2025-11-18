package threadsandparallelcalculation.deadlock;

import java.time.Duration;

public class DeadLockTasks {

	// Any instance of a class can be used as a lock to protect shared resources
	Object lock1 = new Object();
	Object lock2 = new Object();

	Integer lock3 = 3;

	// protected resource 1
	// protected by lock1
	private float balance = 1;
	// protected resource 2
	// protected by lock2
	private int stock = 10;

	public void task1() {
		synchronized (lock1) {
			System.out.println("task 1, the current thread name" + Thread.currentThread().getName());

			// Otras operaciones ignoradas
			// Examinar el almacen y reducir la cantidad
			if (stock <= 0) {
				return;
			}
			deductStock();

			try {
				Thread.sleep(Duration.ofMillis(100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			synchronized (lock2) {
				System.out
						.println("task 1 protected by lock2 starts by thread name" + Thread.currentThread().getName());
				deduct();
				System.out.println(
						"task 1, protected by lock2 finished by thread name" + Thread.currentThread().getName());

			}
			System.out.println("task 1, protected by lock2 finished by thread name" + Thread.currentThread().getName());

		}
	}

	public void task2() {
		synchronized (lock2) {
			System.out.println("task 2, the current thread name" + Thread.currentThread().getName());
			// Otras operaciones ignoradas asociadas con esta tarea
			synchronized (lock1) {
				System.out
						.println("task 2, protected by lock1 starts by thread name" + Thread.currentThread().getName());
				deduct();
				System.out.println(
						"task 2, protected by lock1 finished by thread name" + Thread.currentThread().getName());

			}
			System.out.println("task 2, protected by lock1 finished by thread name" + Thread.currentThread().getName());
		}

	}

	public void task3() {
		synchronized (lock2) {
			System.out.println("task 3, the current thread name" + Thread.currentThread().getName());
			try {
				Thread.sleep(Duration.ofMillis(100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("task 3 has finished, the current thread name" + Thread.currentThread().getName());
		}
	}

	public void task4() {
		System.out.println("task 4, the current thread name" + Thread.currentThread().getName());
		try {
			Thread.sleep(Duration.ofMillis(100));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("task 4 has finished, the current thread name" + Thread.currentThread().getName());
	}

	private void deduct() {
		System.out.println("deduct balance");
		balance--;
	}

	private void deductStock() {
		System.out.println("deduct stock");
		stock--;

	}
}
