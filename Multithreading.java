// Main Class
public class Multithreading {
	public static void main(String[] args)
	{
		int n = 8; // Number of threads
		for (int i = 0; i < n; i++) {
			MultithreadingThread ob1 = new MultithreadingThread();
			Thread ob2 = new Thread(new MultithreadingRunnable());
			ob1.start();
			ob2.start();
		}
	}
}
class MultithreadingThread extends Thread {
	public void run()
	{
		try {
			// Displaying the thread that is running
			System.out.println("Thread " + Thread.currentThread().getId()+ " is running in extended Thread class");
		}
		catch (Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}
}

// Java code for thread creation by implementing
// the Runnable Interface
class MultithreadingRunnable implements Runnable {
    public void run()
    {
        try {
            // Displaying the thread that is running
            System.out.println("Thread " + Thread.currentThread().getId()+ " is running in implemented Runnable interface");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}

