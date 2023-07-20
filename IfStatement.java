import java.util.Scanner;
class IfStatement
{
	public static void main(String args[])
{
	Scanner u = new Scanner(System.in);
	System.out.println("Enter Your Age:");
	int age = u.nextInt();
	if(age>=18)
	{
		System.out.println("Eligible for voting");
	}
	else
	{
		System.out.println("Not Eligible for voting");
	}

	System.out.println("Enter your mark :");
	int mark = u.nextInt();
	if((mark>=0)&&(mark<=39))
	{
	System.out.println("Your Grade is D");
	}
	else if((mark>=40)&&(mark<=59))
	{
	System.out.println("Your Grade is C");
	}
	else if((mark>=60)&&(mark<=79))
	{
	System.out.println("Your Grade is B");
	}
	else if((mark>=80)&&(mark<=89))
	{
	System.out.println("Your Grade is A");
	}
	else if((mark>=90)&&(mark<=100))
	{
	System.out.println("Your Grade is O");
	}
	else
	{
	System.out.println("Your Grade is O");
	}
}
}