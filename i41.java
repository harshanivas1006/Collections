package venky.java;
import java.util.*;
public interface I4
{
	Scanner sc = new Scanner(System.in);
	float m7(long l);
	default String m8(float f)
	{
		System.out.println(f);
		return sc.next(); 
	}
	
}