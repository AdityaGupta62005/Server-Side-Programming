import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.rmi.*;
import java.rmi.server.*;

public class EmployeeTask extends UnicastRemoteObject
                         implements Employee
        {
            EmployeeTask() throws RemoteException
            {
                super();
            }

            @Override
            public String userLogin(String usr, String pswd)
            {
                    String s1 =" ";
                try{
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        System.out.println("Driver Loaded");

                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","1234");

                        String sql1 = "select * from employee where username=? and password=?";

                        PreparedStatement stmt=con.prepareStatement(sql1);
                        stmt.setString(1,usr);
                        stmt.setString(2,pswd);

                        ResultSet rs=stmt.executeQuery();

                        if (rs.next()){
                            s1="You are a valid user";
                        }
                        else {
                            s1="Check your User Name and Password";
                        }
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
            return s1;
        }