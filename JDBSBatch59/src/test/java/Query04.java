import java.sql.*;

public class Query04 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        Class.forName("com.mysql.jdbc.Driver");

        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/okul?serverTimezone=UTC","root","1234");

        //Statement st= con.createStatement();

        PreparedStatement ps = con.prepareStatement("select * from ogrenciler");

        ResultSet rs= ps.executeQuery();
        ResultSetMetaData rsmd = rs.getMetaData();

        System.out.println("1. sutun ismi: "+rsmd.getColumnName(1));
        System.out.println("2. sutun ismi: "+rsmd.getColumnName(2));
        System.out.println("3. sutun ismi: "+rsmd.getColumnName(3));
        System.out.println("4. sutun ismi: "+rsmd.getColumnName(4));

        System.out.println("toplam sutun sayisi: "+rsmd.getColumnCount());

        System.out.println("1. sutunun data tipi: "+rsmd.getColumnTypeName(1));
        System.out.println("2. sutunun data tipi: "+rsmd.getColumnTypeName(2));
        System.out.println("3. sutunun data tipi: "+rsmd.getColumnTypeName(3));
        System.out.println("4. sutunun data tipi: "+rsmd.getColumnTypeName(4));

        System.out.println("tablo ismi: "+rsmd.getTableName(1));


        while (rs.next()){
            System.out.printf("%-6d %-15.15s %-8s %-8s\n", rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
        }



    }
}
