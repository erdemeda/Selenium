import java.sql.*;

public class Query07 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/okul?serverTimezone=UTC", "root", "1234");



        // STATEMENT, PREPAREDSTATEMENT FARKI


        // STATEMENT:
       // Statement st = con.createStatement();
       // st.executeUpdate("insert into ogrenciler values(200, 'Ali Can', 10, 'E')");

        // PREPAREDSTATEMENT:  ifadeler parametre kullanilarak yollanabilir
        PreparedStatement ps= con.prepareStatement("insert into ogrenciler values(?,?,?,?)");
        ps.setInt(1,201);
        ps.setString(2,"Veli Can");
        ps.setString(3,"12");
        ps.setString(4,"E");

        ps.executeUpdate();
        System.out.println("Veri girisi yapildi");











    }
}
