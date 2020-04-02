package threadlocalconcept;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class ThreadSafeDateFormatter{

	private static final ThreadLocal<SimpleDateFormat> threadLocalSimpleDateFormat = new ThreadLocal<SimpleDateFormat>() {

		@Override
		protected SimpleDateFormat initialValue() {
			System.out.println("Creating SimpleDateFormat for Thread : " + Thread.currentThread().getName());
			return new SimpleDateFormat("dd/MM/yyyy");
		}
	};

		public static DateFormat getDateFormatter() {
			return threadLocalSimpleDateFormat.get();
		}

}

class Task implements Runnable{

	public void run() {
		for(int i=0; i<2; i++){
			System.out.println("Thread: " + Thread.currentThread().getName() + " Formatted Date: " + ThreadLocalDemo.threadSafeFormat(new Date()) );
		}
	}
}



public class ThreadLocalDemo {

	/*
	 * Thread safe format method because every thread will use its own DateFormat
	 */
	public static String threadSafeFormat(Date date){
		DateFormat formatter = ThreadSafeDateFormatter.getDateFormatter();
		return formatter.format(date);
	}


	public static void main(String args[]){
		Thread t1 = new Thread(new Task());
		Thread t2 = new Thread( new Task());

		t1.start();
		t2.start();

	}


}
