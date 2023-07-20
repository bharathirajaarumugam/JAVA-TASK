class TypeCastingEx{

public static void main(String arg[])
{
	int a = 10;
	double b = a ;//Automatic Casting know as Widening
	System.out.println(a);
	System.out.println(b);
	double c = 10.3d;
	int d = (int) c;//Manuval Casting know as Barrowing
	System.out.println(c);
	System.out.println(d);
}
}