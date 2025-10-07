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
		
		String targetName = "Luis4000000";
		System.out.println("Luis" == targetName);
		
		 //InputStream in = System.in;
		
		// 1 Crea un array de objetos de usuario
		// 2 Usamos multiples hilos para encontrar un usuario concreto
		// An array of user
		User[] Clients = new User[20000000];
		for (int i = 0; i < Clients.length; i++) {
			Clients[i] = new User("Luis" + i, i, "emilianogmail0", "arribadds", i, false);
		}
		
		for (int i = 0; i < Clients.length; i++) {
			if(Clients[i].getUsername().equals(targetName));
//			System.out.println(Clients[i].getId());
		}
		long startTime = System.currentTimeMillis();
		searchWithOneThread(targetName, Clients);
		long endTime = System.currentTimeMillis();
		System.out.println("the time used by the single thread mode is" + (endTime - startTime));
		
		
		startTime = System.currentTimeMillis();
		searchingWithMultipleThreads(targetName, Clients);
		
		try {
			Thread.sleep(1000000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		endTime = System.currentTimeMillis();
		System.out.println(" the time used by multiple threads mode is " +(endTime - startTime));

	}

	private static void searchingWithMultipleThreads(String targetName, User[] clients) {
		// TODO Auto-generated method stub
		int index = clients.length / 4;
		//Thread thread1 = new Thread(new UserSearchingTask(targetName, clients, 0, index));
		//Thread thread2 = new Thread(new UserSearchingTask(targetName, clients, index , 2*  index));
		//Thread thread3 = new Thread(new UserSearchingTask(targetName, clients, 2*  index, 3 * index ));
		//Thread thread4 = new Thread(new UserSearchingTask(targetName, clients, 3 * index , 4 * index));
		//thread1.start();
	//	thread2.start();
		//thread3.start();
		//thread4.start();
		int numOfThreads = Runtime.getRuntime().availableProcessors();
		index = clients.length / numOfThreads;
		for (int i = 0; i < numOfThreads; i++) {
			Thread thread5 =
						new Thread(new UserSearchingTask(targetName, clients, i * index , i * index + index, Thread.currentThread()));
			thread5.start();
			
		}

		
	}

	private static void searchWithOneThread(String targetName, User[] clients) {
		// TODO Auto-generated method stub
		 for ( int i = 0; i < clients.length; i++) {
			 if (clients [i].getUsername().equals(targetName)) {
				 System.out.println("id of the user is" + clients[i].getId());
			 }
		 }
		
	}		
}