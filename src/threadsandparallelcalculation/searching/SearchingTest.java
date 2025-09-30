/**
 * 
 */
package threadsandparallelcalculation.searching;

import java.io.InputStream;
import java.util.Iterator;

import datastructure.User;
/**
 * @author  26 sept 2025
 */
public class SearchingTest {
	
	public static void main(String[] args) {
		
		String targetName = "Luis";
		System.out.println("Luis" == targetName);
		
		 //InputStream in = System.in;
		
		// 1 Crea un array de objetos de usuario
		// 2 Usamos multiples hilos para encontrar un usuario concreto
		// An array of user
		User[] Clients = new User[20000];
		for (int i = 0; i < Clients.length; i++) {
			Clients[i] = new User("Luis" + i, i, "emilianogmail0", "arribadds", i, false);
		}
		
		for (int i = 0; i < Clients.length; i++) {
			if(Clients[i].getUsername() == targetName);
			System.out.println(Clients[i].getId());
		}
		searchWithOneThread(targetName, Clients);
		searchingWithMultipleThreads(targetName, Clients);

	}

	private static void searchingWithMultipleThreads(String targetName, User[] clients) {
		// TODO Auto-generated method stub
		
	}

	private static void searchWithOneThread(String targetName, User[] clients) {
		// TODO Auto-generated method stub
		
	}		
}