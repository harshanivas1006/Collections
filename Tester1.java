package Tester;
import venky.*;
import venky.java.*;
import java.util.*;
class Tester extends E implements I3,I4,I5
{
	static Scanner sc =new Scanner(System.in);
	Tester()
	{
		super(sc.nextInt());
	}
	public char m3(byte b)
	{
		System.out.println(b);
		return sc.next().charAt(0); 
	}
	public double m6(short s)
	{
		System.out.println(s);
		return sc.nextDouble(); 
	}
	public float m7(long l)
	{
		System.out.println(l);
		return sc.nextFloat(); 
	}
	public boolean m9(byte b)
	{
		System.out.println(b);
		return sc.nextBoolean(); 
	}
	public static void main(String[]args)
	{
		Concrete obj = new Concrete(sc.nextInt());
		E obj1 =new Tester();
		I3 obj2 = new Tester();
		I4 obj3 = new Tester();
		I5 obj4 = new Tester();
		System.out.println(obj.m1(Concrete.sc.nextFloat()));
		System.out.println(obj.m2(Concrete.sc.nextShort())); 
		System.out.println(obj1.m3(E.sc.nextByte())); 
		System.out.println(obj1.m4(E.sc.next())); 
		System.out.println(I3.m5(sc.nextBoolean()));
		System.out.println(obj2.m6(sc.nextShort())); 
		System.out.println(obj3.m7(sc.nextLong()));
		System.out.println(obj3.m8(sc.nextFloat()));
		System.out.println(obj4.m9(sc.nextByte()));
		System.out.println(obj4.m10(sc.nextBoolean()));
		
	}
}