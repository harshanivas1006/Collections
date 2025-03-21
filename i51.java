package venky.java;
import java.util.*;
public interface I5
{
	static Scanner sc = new Scanner(System.in);
	boolean m9(byte b);
	default long m10(boolean b)
	{
		System.out.println(b);
		return sc.nextLong(); 
	}
}