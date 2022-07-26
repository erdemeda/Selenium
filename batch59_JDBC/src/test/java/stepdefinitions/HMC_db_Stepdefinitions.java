package stepdefinitions;

import io.cucumber.java.en.Given;

import java.sql.*;

public class HMC_db_Stepdefinitions {

    String url="jdbc:sqlserver://184.168.194.58:1433;databaseName=hotelmycamp ; user=techproed;password=P2s@rt65";
    String username="techproed";
    String password="P2s@rt65";

    Connection connection; //Database'e baglanmamizi saglar
    Statement statement; //Query calistirmamizi saglar
    ResultSet resultSet; //Query sonucunda donen sonucu store etmemize yariyor


    @Given("kullanici HMC veri tabanina baglanir")
    public void kullanici_hmc_veri_tabanina_baglanir() throws SQLException {
        connection= DriverManager.getConnection(url,username,password);
        statement= connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);



    }

    @Given("kullanici {string} tablosundaki {string} verilerini alir")
    public void kullanici_tablosundaki_verilerini_alir(String table, String field) throws SQLException {
       String query="SELECT "+field+" FROM "+table;
        resultSet= statement.executeQuery(query);

    }

    @Given("kullanici {string} sutunundaki verileri okur")
    public void kullanici_sutunundaki_verileri_okur(String field) throws SQLException {


      //resultset iterator gibi calisir
        resultSet.first();
        System.out.println(resultSet.getShort("Price")); //225

        resultSet.next(); // iterator'a benzer sekilde calisir
                          // next()'u imleci bir sonraki degerin yanina goturur

                          // bize true veya false doner
        System.out.println(resultSet.getShort("Price"));//4000

        System.out.println(resultSet.next()); // true

        System.out.println(resultSet.getShort("Price"));//445
        // next() kullanilirken cok dikkatli olmaliyiz
        // cunku nerede olursa olsun imleci bir sonraki elemente gecirecektir

        System.out.println("===============Liste===============");
        resultSet.absolute(0);
        int sira=1;
        while(resultSet.next()){
            System.out.println(sira+". kayt : " + resultSet.getString("Price"));
            sira++;
        }
        // tabloda kac satir oldugunu nasil buluruz ?
        resultSet.last();
        System.out.println(resultSet.getRow()); // 416
    }
}