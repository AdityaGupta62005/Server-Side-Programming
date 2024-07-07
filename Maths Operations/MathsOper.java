import java.rmi.*;
import java.rmi.server.*;

public class MathsOper extends UnicastRemoteObject implements Maths {
    MathsOper() throws RemoteException {
        super();
    }

    public int add(int x, int y) throws RemoteException {
        return x + y;
    }

    public int subtract(int x, int y) throws RemoteException {
        return x - y;
    }

    public int multiply(int x, int y) throws RemoteException {
        return x * y;
    }

    public int divide(int x, int y) throws RemoteException {
        if (y == 0) throw new ArithmeticException("Division by zero");
        return x / y;
    }
}
