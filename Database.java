import java.sql.*;          // 1

class Database
{
    public static void main(String arg[]) throws Exception
    {
        String URL = "jdbc:mysql://localhost:3306/ppa51";
        String Username = "root";
        String Password = "";
        String Query = "select * from student";

        Connection cobj = DriverManager.getConnection(URL,Username,Password);   // 2
        
        Statement sobj = cobj.createStatement();        // 3

        ResultSet robj = sobj.executeQuery(Query);      // 4

        while(robj.next())          // 5
        {
            System.out.println("RID : "+robj.getInt("rno"));
            System.out.println("Name : "+robj.getString("name"));
            System.out.println("City : "+robj.getString("city"));
            System.out.println("Marks : "+robj.getInt("marks"));   
            System.out.println("");
        }
    }
}

// execute()            Create table
// executeQuery()       select
// executeUpdate()      delete / update / alter / insert