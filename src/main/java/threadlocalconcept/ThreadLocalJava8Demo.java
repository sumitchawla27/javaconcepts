package threadlocalconcept;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class ThreadSafeDateFormatterJava8{

	//withLocal is a factory method
	public static final ThreadLocal<SimpleDateFormat> threadLocalSimpleDateFormat = ThreadLocal.withInitial(()-> new SimpleDateFormat("yyyy-dd-mm"));

}

class NewTask implements Runnable{

	public void run() {
		for(int i=0; i<2; i++){
			System.out.println("Thread: " + Thread.currentThread().getName() + " Formatted Date: " + ThreadLocalJava8Demo.threadSafeFormat(new Date()) );
		}
	}
}

public class ThreadLocalJava8Demo {
	/*
	 * Thread safe format method because every thread will use its own DateFormat
	 */
	public static String threadSafeFormat(Date date){
		DateFormat formatter = ThreadSafeDateFormatterJava8.threadLocalSimpleDateFormat.get();
		return formatter.format(date);
	}


	public static void main(String args[]){
		Thread t1 = new Thread(new NewTask());
		Thread t2 = new Thread( new NewTask());

		t1.start();
		t2.start();

	}
}
