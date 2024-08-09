/**
 * 
 */
package Package1;

/**
 * @author navee
 *
 */
public class Assignment2 
{
	public void Sum1(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("Result is "+c);
		
	}
	
	public int Sub1(int d, int e)
	{
		int f;
		f=d-e;
		System.out.println("Result is "+f);
		return f;
	}
	
	public int Multi1(int g, int h)
	{
		int i;
		i=g*h;
		System.out.println("Result is "+i);
		return i;
	}
	
	public int Div1(int j, int k)
	{
		int l;
		l=j/k;
		System.out.println("Result is "+l);
		return l;
	}

	public static void main(String[] args)
	{
		Assignment2 obj = new Assignment2();
	    int Divresult=obj.Div1(10, 2);
	    int Subresult=obj.Sub1(Divresult, 2);
	    int Multiresp=obj.Multi1(Subresult, 2);
	    int Subres2=obj.Sub1(Multiresp, 2);
	    obj.Sum1(Subres2, 2);
	    }
}
