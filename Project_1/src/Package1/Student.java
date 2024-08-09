package Package1;

public class Student {

	int Roll_Number;
	int age;
	
	public void Display1()
	{
		System.out.println("Welcome to Java Class");
	}
	
	public void Display2()
	{
		System.out.println("Automation is very Easy");
	}
	public static void main(String[] args)
	{
		Student naveen = new Student();
		naveen.Roll_Number = 563;
		naveen.age = 33;
		System.out.println("Roll_Number: "+ naveen.Roll_Number);
		System.out.println("Age: "+ naveen.age);
		naveen.Display1();
		naveen.Display2();
	}

}
