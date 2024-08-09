package Package1;

public class Arithmetic

{
	public int Sum(int a,int b)
		{
			int c;
			c=a+b;
			System.out.println("Result is " +c);
			return c;
		}
	
	public int Sub(int c, int d)
	{
		int e;
		e=c-d;
		System.out.println("Result is " +e);
		return e;
	}
	
	public void Multi(int f, int g)
	{
		int h;
		h=f*g;
		System.out.println("Result is " +h);
	}
	
	public static void main(String[] args)
	{
		Arithmetic obj = new Arithmetic();
		int Addition= obj.Sum(10, 12);
		int Substraction = obj.Sub(4, 2);
		obj.Multi(Addition, Substraction);
		
	}
}
