package training;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;

import java.sql.*;
import java.util.Scanner;

public class trans{
    public static void main(String... args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/infinite";
        String user = "root";
        String password = "india@123";
        Connection con = null;
        try {
            Connection com = DriverManager.getConnection(url, user, password);
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the  account number");
            int name=sc.nextInt();
            System.out.println("enter the bill month");
            int month= sc.nextInt();
            System.out.println("enter the bill amount");
            int amount=sc.nextInt();

                String sql = "{call transprocedure(?,?,?) }";
            CallableStatement stmt=com.prepareCall(sql);
            stmt.setInt(1,name);
            stmt.setInt(2,month);
            stmt.registerOutParameter(3, Types.VARCHAR);
            stmt.executeQuery();
            int due= stmt.getInt(3);
            int amount1=due/100*5;
            due=due-amount1;
            System.out.println("total due is "+due);
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}


