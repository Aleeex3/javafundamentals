package threadsandparallelcalculation.searching;

import datastructure.User;

public class UserSearchingTask implements Runnable {

	private String target;

	private User[] clients;

	private int beginning = -1, end = -1;
	
	private Thread main;

	public UserSearchingTask(String targetName, User[] clients1, int beginning2, int end1, Thread thread) {
		this.target = targetName;
		this.clients = clients1;
		this.beginning = beginning2;
		this.end = end1;
		this.main = thread;

		// TODO Auto-generated constructor stub
	}

	public void run() {
		for (int i = beginning ; i < end ; i++) {
			if (clients[i] != null && clients[i].getUsername().equals(target)) {
				System.out.println("id of the user is" + clients[i].getId());
				this.main.interrupt();
				break;
			}
		}
	}

}
