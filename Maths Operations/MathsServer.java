import java.rmi.*;
import java.rmi.registry.*;
public class MathsServer
{
	public static void main(String args[])
	{
		try
		{
			System.out.println("Server Started ");			
			Maths obj = new MathsOper();
			LocateRegistry.createRegistry(1900);
			Naming.rebind("rmi://localhost:1900"+"/neck",obj);
			System.out.println("Maths server is ready.");
		}
		catch(Exception ae)
		{
			System.out.println("Exception: " + ae);
		}
	}
}