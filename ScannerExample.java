import java.untill.Scanner;
calss ScannerExample{

public static void main(String args[]){

System.out.println("Enter your first name:");
Scanner sc = new Scanner(System.in);

String firstName = sc.nextLine();
System.out.println("Enter your age:");
int value = sc.nextInt();
System.out.println("Your First name is :" + firstName);
System.out.println("Your initial name is :" + initialname);
System.out.println("Your Last name is :" + lastname);
}
}