package threadsandparallelcalculation.searching;

import datastructure.User;

public class UserSearchingTask implements Runnable {

	private String target;

	private User[] clients;

	private int beginning = -1, end = -1;

	public UserSearchingTask(String targetName, User[] clients1, int beginning2, int end1) {
		this.target = targetName;
		this.clients = clients1;
		this.beginning = beginning2;
		this.end = end1;

		// TODO Auto-generated constructor stub
	}

	public void run() {
		for (int i = beginning ; i < end ; i++) {
			if (clients[i].getUsername() == target) {
				System.out.println("id of the user is" + clients[i].getId());

			}
		}
	}

}
