import java.rmi.*;

public interface Employee extends Remote {
    public String userLogin(String user,String password) throws RemoteException;
}