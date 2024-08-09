package Package1;

public class Assignment1 
{
	public int Sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("Result is "+c);
		return c;
	}
	
	public int Sub(int d, int e)
	{
		int f;
		f=d-e;
		System.out.println("Result is "+f);
		return f;
	}
	
	public int Multi(int g, int h)
	{
		int i;
		i=g*h;
		System.out.println("Result is "+i);
		return i;
	}
	
	public void Div(int j, int k)
	{
		int l;
		l=j/k;
		System.out.println("Result is "+l);
		
	}

	public static void main(String[] args)
	{
		Assignment1 obj = new Assignment1();
		int Sumres=obj.Sum(10, 2);
		int Multip=obj.Multi(Sumres, 2);
		int Subres=obj.Sub(Multip, 2);
		int Multip2=obj.Multi(Subres, 2);
		obj.Div(Multip2, 2);	
		
	}
}
