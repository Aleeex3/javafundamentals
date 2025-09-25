package datastructure;

public class ArrayTest {

	public static void main(String[] args) {
		//== operador de igualdad
		// = operador de establecer un valor a una variable
		System.out.println(1==1);	
				
		int[] score = {12, 123123, 435};
		int sum = score[0] + score[1] + score[2] ;
		System.out.println("the total score is " + sum);
		int totalScore = 0;
		for (int i = 0; i < score.length; i++) {
			totalScore = score[i] + totalScore;
		}		
		System.out.println("the total score is " + totalScore);
		//Un array
		User[] clients = new User[4];
		//Store a user object at the first position of the array
		clients[0] = new User(0, "amno", "pas", false, 0);
		//Store a user object at the second position of the array
		clients[1] = new User(1, "amno", "pas", false, 0);
		//Imprimir la longitud del array
		System.out.println(score.length);
		System.out.println("the length of the array clients " + clients.length);
		
 		for (int i = 0; i < clients.length; i++) {
 			clients[i] = new User(i, "amno" + i, "pas" + i, false, 0);
		}
 		
 		for (int i = 0; i < clients.length; i++) {
 			System.out.println(clients[i].getUsername());
		}
 		
 		//Exception in thread "main" java.lang.NullPointerException: Cannot read the array length because "booleans" is null
 		boolean[] booleans = null;
 		System.out.println(booleans.length);
 		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
 		User[] users = {new User(), new User(0, "amno", "pas", false, 0)};
 		System.out.println(users.length);
 		System.out.println(users[2]);
		
	}
}
