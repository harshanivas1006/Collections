package venky;
import java.util.*;
public class Concrete
{
	public static Scanner sc = new Scanner(System.in);
	public Concrete(int a)
	{
		System.out.println(a); 
	}
	public static Boolean m1(float f)
	{
		System.out.println(f);
		return sc.nextBoolean(); 
	}
	public long m2(short s)
	{
		System.out.println(s);
		return sc.nextLong(); 
	}
}