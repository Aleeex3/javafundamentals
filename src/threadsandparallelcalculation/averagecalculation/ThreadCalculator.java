/**
 * 
 */
package threadsandparallelcalculation.averagecalculation;

public class ThreadCalculator implements Runnable {

	private int beginning = -1, end = -1;
	private float[] numerics = null;
	private Thread main;

	/**
	 * @param numerics2
	 * @param i
	 * @param j
	 */
	public ThreadCalculator(float[] numerics, int i, int j) {
		beginning = i;
		end = j;
		this.numerics = numerics;
	}

	// Definimos el total para poder realizar la operacion del avg la cual sera
	// total/count
	public void run() {
		float total = 0;
		for (int i = beginning; i < end; i++) {

			total = numerics[i] + total;
		}

		// avg = total/count
		int count = end - beginning;

		if (count > 0) {
			float avg = total / count;
			System.out.println("El promedio es: " + avg);
		}
	}

}
