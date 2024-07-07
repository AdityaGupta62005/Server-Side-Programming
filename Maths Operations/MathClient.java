import java.rmi.*;

public class MathClient {
    public static void main(String args[]) {
        int a = 10, b = 20, ans;
        try {
            Maths m1 = (Maths) Naming.lookup("rmi://localhost:1900" + "/neck");
            
            ans = m1.add(a, b);
            System.out.println("Sum of " + a + " and " + b + " is " + ans);

            ans = m1.subtract(a, b);
            System.out.println("Subtraction of " + b + " from " + a + " is " + ans);

            ans = m1.multiply(a, b);
            System.out.println("Multiplication of " + a + " and " + b + " is " + ans);

            ans = m1.divide(a, b);
            System.out.println("Division of " + a + " by " + b + " is " + ans);
        } catch (Exception ae) {
            System.out.println("Exception caught: " + ae);
        }
    }
}
