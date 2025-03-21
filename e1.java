package venky;
import java.util.*;
public abstract class E
{
	public static Scanner sc = new Scanner(System.in);
	public E(int a)
	{
		System.out.println(a); 
	}
	public abstract char m3(byte b);
	public float m4(String s)
	{
		System.out.println(s);	
		return sc.nextFloat(); 
	}
}