import java.rmi.*;

public class EmployeeClient {
    public static void main (String args[]){
        String ul="employee",pwd="1234";
        String response;
        try {
            Employee db = (Employee)Naming.lookup("rmi://localhost:1900"+"/dbService");
            response = db.userLogin(u1,pwd);
            System.out.println("Server Response: "+response);
        }
        catch (Exception ae){
            System.out.println(ae);
        }
    }
}
