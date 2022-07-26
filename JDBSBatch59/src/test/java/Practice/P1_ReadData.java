package Practice;

import java.sql.*;

public class P1_ReadData {

      //MySql de day3 de..

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        //hata alanlar Class.forName("com.mysql.jdbc.Driver"); yapistirsin
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch59?serverTimezone=UTC", "root", "1234");

        Statement st = con.createStatement(); //query calistirmak icin

        // SORU1: Talebeler tablosundan tum kayitları listeleyiniz.

      //  ResultSet kayitlar = st.executeQuery("select * from talebeler");
      //  while (kayitlar.next()){
      //      System.out.printf("%-6d  %-15.15s  %-8s  %-5d\n", kayitlar.getInt(1),kayitlar.getString(2),
      //      kayitlar.getString(3), kayitlar.getInt(4));
      //  }

        // SORU2: Talebeler tablosunda notları 90 uzeri olan kayitları listeleyiniz.
    //   ResultSet kayitlarBuyuk90 = st.executeQuery("select * from talebeler where yazili_notu>90");

    //   while(kayitlarBuyuk90.next()){
    //       System.out.printf("\"%-6d  %-15.15s  %-8d\n", kayitlarBuyuk90.getInt(1), kayitlarBuyuk90.getString(2), kayitlarBuyuk90.getInt(4));

    //   }

        // SORU3: Talebeler tablosunda id'si 124 olan öğrencilerin tüm bilgilerini listeleyiniz.
   //    ResultSet id124 = st.executeQuery("select * from talebeler where id= 124");
   //    while (id124.next()) {
   //        System.out.printf("%-6s  %-15.15s  %-8s  %-5s\n", id124.getObject(1), id124.getObject(2), id124.getObject(3), id124.getObject(4));

   //    }

        // SORU4: Talebeler tablosunda notu 70 ile 90 arasindaki kisilerin isimlerini listeleyiniz.

   //     ResultSet not7090 = st.executeQuery("select isim, yazili_notu from talebeler where yazili_notu between '70' AND '90'");
   //     while(not7090.next()){
   //         System.out.printf("%-16s  %-16s \n", not7090.getObject(1), not7090.getObject(2));
   //     }

        // SORU5: Talebeler tablosunda isminin 2. harfi e olan kisilerin veli_isimleri ile birlikte listeleyiniz.
        ResultSet isim2E_veliIsim = st.executeQuery("select isim, veli_isim from talebeler where isim LIKE '_e%'");
        while (isim2E_veliIsim.next()){
            System.out.printf("%-16s  %-16s \n",isim2E_veliIsim.getObject(1), isim2E_veliIsim.getObject(2));
        }

    }

    }


