import java.util.Scanner;
class SwitchExample
{
	public static void main(String args[])
{
	Scanner u = new Scanner(System.in);
	System.out.println("Enter the number between 1 to 7:");
	int number = u.nextInt();
	Case 1:
	{
	System.out.println("Sunday :\n");
 	break;	
	}
	Case 2:
	{
	System.out.println("Monday :\n");	
	break;
	}
	Case 3:
	{
	System.out.println("Tuesday :\n");	
	break;
	}
	Case 4:
	{
	System.out.println("Wednesday :\n");	
	break;
	}
	Case 5:
	{
	System.out.println("Thursday :\n");	
	break;
	}
	Case 6:
	{
	System.out.println("Friday :\n");
	break;	
	}
	Case 7:
	{
	System.out.println("Saturday :\n");	
	break;
	}
}
default:
	{
		System.out.println("Pleace enter correct value for 1 to 7");
	}
}
}