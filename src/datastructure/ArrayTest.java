package datastructure;

import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args) {
		// == se utiliza para igualar
		// = se utiliza para establecer un valor a una variable
		System.out.println(1 == 1);

		int[] scores = { 1, 12, 78, 8, 45 };

		reverse(scores);

		sumup(scores);

		findMaxMin(scores);

		switchValues(scores, 1, 4);
		// {12, 1, 8, 45, 78}

		createObject();

		// Array
		User[] Clients = new User[2];
		User[] users = { new User(), new User() };
		Clients[0] = new User("unknow", 10, "emilianogmail0", "arribadds", 0, false);
		Clients[1] = new User("unknow", 10, "emilianogmail0", "arribadds", 1, false);
		// Imprimir lo que deseemos, (longitud)
		System.out.println(scores.length);
		System.out.println(users.length);
		System.out.println("longitud del array del cliente " + Clients.length);
		for (int i = 0; i < Clients.length; i++) {
			Clients[i] = new User("Luis" + i, i, "emilianogmail0", "arribadds", i, false);
		}
		for (int i = 0; i < Clients.length; i++) {
			System.out.println(Clients[i].getUsername());
		}
		boolean[] booleans = null;

		System.out.println(booleans.length);
		// java.lang.ArrayIndexOutOfBoundsException
		System.out.println(users[2]);
		System.out.println(users.length);
	}

	private static void createObject() {
		// TODO Auto-generated method stub
		User[] Clients = new User[2];
		User[] users = { new User(), new User() };
		Clients[0] = new User("unknow", 10, "emilianogmail0", "arribadds", 0, false);
		Clients[1] = new User("unknow", 10, "emilianogmail0", "arribadds", 1, false);
		// Imprimir lo que deseemos, (longitud)
		System.out.println(users.length);
		System.out.println("longitud del array del cliente " + Clients.length);
		for (int i = 0; i < Clients.length; i++) {
			Clients[i] = new User("Luis" + i, i, "emilianogmail0", "arribadds", i, false);
		}
		for (int i = 0; i < Clients.length; i++) {
			System.out.println(Clients[i].getUsername());
		}
		boolean[] booleans = null;

		System.out.println(booleans.length);
		// java.lang.ArrayIndexOutOfBoundsException
		System.out.println(users[2]);
		System.out.println(users.length);
	}

	private static void reverse(int[] arr) {
		System.out.println(Arrays.toString(arr));
		int temp = arr[0];
		arr[0] = arr[arr.length - 1];
		arr[arr.length - 1] = temp;

		temp = arr[1];
		arr[1] = arr[arr.length - 1 - 1];
		arr[arr.length - 1 - 1] = temp;

		temp = arr[2];
		arr[2] = arr[arr.length - 1 - 2];
		arr[arr.length - 1 - 2] = temp;

		System.out.println(Arrays.toString(arr));

		int j = 0;
		temp = arr[j];
		arr[j] = arr[arr.length - 1 - j];
		arr[arr.length - 1 - j] = temp;
		j++;

		temp = arr[j];
		arr[j] = arr[arr.length - 1 - j];
		arr[arr.length - 1 - j] = temp;
		j++;

		temp = arr[j];
		arr[j] = arr[arr.length - 1 - j];
		arr[arr.length - 1 - j] = temp;

		System.out.println(Arrays.toString(arr));

		for (int k = 0; k < arr.length /2; k++) {
			temp = arr[k];
			arr[k] = arr[arr.length - 1 - k];
			arr[arr.length - 1 - k] = temp;
			

		}
		System.out.println(Arrays.toString(arr));

	}

	/**
	 * @param arr
	 * @param i
	 * @param j
	 */
	private static void switchValues(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int num = arr[i];
		arr[i] = arr[j];
		arr[j] = num;
		System.out.println(Arrays.toString(arr));
	}

	/**
	 * Encontrar el maximo y el minimo valor en la array
	 * 
	 * @param scores
	 */
	private static void findMaxMin(int[] scores) {
		// TODO Auto-generated method stub
		int max = scores[0];
		int min = scores[scores.length - 1];
		for (int i = 0; i < scores.length; i++) {
			// si el max es menor que el dato aactual que hemois codigo "scores[i]"
			// max = scores[i]
//			if(condition) {
//				statement;
//			}
//			else {
//				statement;
//			}
			if (max < scores[i]) {
				max = scores[i];
			}
		}
		System.out.println("the maximum value is " + max);
	}

	/**
	 * @param scores
	 */
	private static void sumup(int[] scores) {
		int sum = scores[0] + scores[1] + scores[2] + scores[3];
		System.out.println("the total score is " + sum);
		int totalScore = 0;
		for (int i = 0; i < scores.length; i++) {
			totalScore = scores[i] + totalScore;
		}
		System.out.println("the total score is " + totalScore);
		// TODO Auto-generated method stub

	}
}
