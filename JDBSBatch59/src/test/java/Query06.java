import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Query06 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/batch59?serverTimezone=UTC", "root", "1234");

        Statement st = con.createStatement();

        // SORU1: Bölümler tablosunda yeni bir kayıt (80, 'ARGE', 'ISTANBUL')

        int s1 = st.executeUpdate("insert into bolumler values (80, 'ARGE', 'ISTANBUL')");
        System.out.println(s1+ " Satir eklendi");

        // executeUpdate etkilenen satir sayisisni döndürür.


        // SORU2; Bölümler tablosuna birden fazla kayıt ekleyelim.
        //1.yol

        String [] veri1= {"insert into bolumler values (95, 'YEMEKHANE', 'ISTANBUL')",
                "insert into bolumler values (85, 'OFİS1', 'ANKARA')",
                "insert into bolumler values (75, 'OFİS2', 'TRABZON')"};


        int count=0;
        for(String each:veri1){
            count=count+st.executeUpdate(each);
        }

        System.out.println(count + "data eklendi");

        //2.yol

        String [] veri2= {"insert into bolumler values (81, 'YEMEKHANE', 'ISTANBUL')",
                "insert into bolumler values (82, 'OFİS1', 'ANKARA')",
                "insert into bolumler values (83, 'OFİS2', 'TRABZON')"};


        for(String each:veri2){
            st.addBatch(each); // yukardaki verilerin tamamini bira araya topluyor
        }
        st.executeBatch();  // biraraya getirilen verileri

        System.out.println(" veriler database'e eklendi");




        // SORU3; Bölümler tablosuna birden fazla kayıt ekleyelim.

        String [] veri3= {"insert into bolumler values (100, 'YEMEKHANE', 'ISTANBUL')",
                "insert into bolumler values (101, 'OFİS1', 'ANKARA')",
                "insert into bolumler values (102, 'OFİS2', 'ANKARA')",
                "insert into bolumler values (103, 'OFİS2', 'ANKARA')",
                "insert into bolumler values (104, 'OFİS2', 'ANKARA')",
                "insert into bolumler values (105, 'OFİS2', 'TRABZON')"};

        for(String each:veri3){
            st.addBatch(each); // yukardaki verilerin tamamini bira araya topluyor
        }
        st.executeBatch();  // biraraya getirilen verileri

        System.out.println(" veriler database'e eklendi");


    }
}
