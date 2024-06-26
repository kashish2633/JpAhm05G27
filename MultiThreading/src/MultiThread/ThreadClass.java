package MultiThread;

public class ThreadClass extends Thread 
{
    private int N;
    private String message;
	
	public ThreadClass(int n, String message)
	{
		this.N=n;
		this.message=message;
	}
	
	public void run() 
	{
		for(int i=0;i<=N;i++)
		{
			try 
			{
				Thread.sleep(300);
			}
			
			catch(Exception e)
			{
				System.err.println("Thread Interrupted "+e.getMessage());
			}
			System.out.println(message+i+" "+"Current Thread "+ Thread.currentThread().getName());
		}
	}
}
/*
    public ThreadClass(int n, String msg) 
    {
        this.N = n;
        setName(msg); // Set thread name to msg
    }

    @Override
    public void run() 
    {
        for (int i = 0; i <= N; i++) 
        {
            try 
            {
                Thread.sleep(300); // Sleep for 300 milliseconds
            } 
            
            catch (InterruptedException e) 
            {
                System.out.println("Thread Interrupted: " + e.getMessage());
            }
            System.out.println("Message " + i + " from " + Thread.currentThread().getName());
        }
    }
}*/
