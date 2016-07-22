
public class PriorityThread extends Thread{
public void run()
{
	int ans=0;
	for(int i=0;i<5;i++)
	{
		ans+=i;
	}
	System.out.println("The sum of the integers from 0 to 5 is  "+ans);
}
}
