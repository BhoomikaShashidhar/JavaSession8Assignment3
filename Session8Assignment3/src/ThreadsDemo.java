
public class ThreadsDemo {
public static void main (String args[])
{
	PriorityThread thread1= new PriorityThread();
	thread1.start();
	thread1.setPriority(thread1.MAX_PRIORITY);
	Threads thread2= new Threads();
	thread2.start();
	thread2.setPriority(thread2.MIN_PRIORITY);
	MultiplicationDemo thread3= new MultiplicationDemo();
	thread3.start();
	thread3.setPriority(thread3.NORM_PRIORITY);
}

}