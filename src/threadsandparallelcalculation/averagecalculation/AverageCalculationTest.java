package threadsandparallelcalculation.averagecalculation;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class AverageCalculationTest {
	/**
	 * Calcular el promedio de un array de tipo float empleando computacion pararela
	 * con multiples hilos
	 * 
	 */

	public static void main(String[] args) {
	//Definimos la variable random
		Random rd = new Random();
		// 1 Crea un array de numeros
		// 2 Usamos multiples hilos para encontrar calcular el avg
		//Array de numeros 
		float[] numerics = new float[200];
		for (int i = 0; i < numerics.length; i++) {
			numerics[i] = rd.nextFloat();
			
		}
			
//		float[] numerics2 = new float[200];
//		for (int j = 0; j < numerics2.length; j++) {
//			numerics2[j] = rd.nextFloat();
//		
//			
//		}
//		
//		System.out.println(Arrays.toString(numerics));
//		System.out.println(Arrays.toString(numerics2));
		
		//Definimos el hilo con el que vamos a trabaja para poder calcular el avg usando la array
		//y el numero de procesadores que disponemos (12)
		int numOfThreads = Runtime.getRuntime().availableProcessors();
		int index = numerics.length / numOfThreads;
		for (int i = 0; i < numOfThreads; i++) {
		Thread thread1 = 
				new Thread(new ThreadCalculator(numerics, i * index, i * index + index));
		thread1.start();
		}
		
		
	}
}