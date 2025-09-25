package threadsandparallelcalculation;

public class ExitRegistrationTask implements Runnable{
	
	private Airport airport;
	public ExitRegistrationTask (Airport airport ) {
		this.airport = airport ;
		}

	@Override
	public void run() {
	
			// TODO Auto-generated method stub
			System.out.println("Start the task");
			System.out.println("The thread name is" + Thread.currentThread().getName());;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (int i = 0; i < 1000 ; i++) {
				airport.decrease();
			}
		
			
	}

}