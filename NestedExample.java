import java.util.Scanner;
class NestedExample
{
	public static void main(String args[])
{
	Scanner u = new Scanner(System.in);
	System.out.println("Enter Your Age:");
	int age = u.nextInt();
	if(age >= 18)
	{
	System.out.println("Eligible to Join COllege :\n");	
	System.out.println("Enter 12th Percentage :");
	int percentage = u.nextInt();
	if(percentage>=70)
	{
	System.out.println("Eligible for the Addmission");
	}
	else
	{
	System.out.println("Konjam Nalla Padikalam");
	}
}
else
	{
		System.out.println("Not Eligible for Age creteria");
	}
}
}