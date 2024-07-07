import java.rmi.*;
import java.rmi.registry.*;

public class EmployeeServer {

    public static void main(String[] var0) {
        try {
            System.out.println("Server Started.....");
            Employee obj  = new EmployeeTask();
            LocateRegistry.createRegistry(1900);
            Naming.rebind("rmi://localhost:1900/employee", obj);
        } catch (Exception ae) {
            System.out.println(ae);
        }
    }
}