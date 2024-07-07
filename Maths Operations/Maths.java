import java.rmi.*;

public interface Maths extends Remote {
    public int add(int x, int y) throws RemoteException;
    public int subtract(int x, int y) throws RemoteException;
    public int multiply(int x, int y) throws RemoteException;
    public int divide(int x, int y) throws RemoteException;
}
