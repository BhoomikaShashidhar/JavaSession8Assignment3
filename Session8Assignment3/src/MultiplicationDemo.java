
public class MultiplicationDemo extends Thread{
	public void run()
	{
		int ans=1;
		for(int i=1;i<5;i++)
		{
			ans=ans*i;
		}
		System.out.println("The sum of the integers from 0 to 5 is  "+ans);
	}
}
