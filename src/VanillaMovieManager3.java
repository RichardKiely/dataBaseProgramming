//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//
///**
// * Created by t00036478 on 01/02/2018.
// */
//public class VanillaMovieManager3 {
//    private String driverClass = "oracle.jdbc.driver.OracleDriver";
//    private Connection connection = null;
//    private String url = "jdbc:oracle:thin:@localhost:1521:orcl";
//    private String username = "C##USER1"; // your username
//    private String password = "AlanDaly2?"; //your password
//    private String insertSql = "INSERT INTO MOVIES VALUES (3, 'Michael Collins','Neil Jordan', 'Irish civil war')";
//    private String selectSql = "SELECT * FROM MOVIES";
//
//    public VanillaMovieManager3() {
//    }
//
//    private void setConnection() {
//        try {
//            Class.forName(driverClass).newInstance();
//            connection = DriverManager.getConnection(url, username, password);
//            System.out.println(connection);
//        } catch (Exception ex) {
//            System.err.println("Exception:" + ex.getMessage());
//            ex.printStackTrace();
//        }
//
//    }
//
//    private Connection getConnection() {
//        if (connection == null) {
//            setConnection();
//        }
//        return connection;
//    }
//
//    private void persistMovie() {
//        try {
//            Statement st = getConnection().createStatement();
//// Execute the statement
//            st.executeUpdate(insertSql);
//            System.out.println("Movie persisted successfully!");
//        } catch (java.sql.SQLException ex) {
//            System.err.println(ex.getMessage());
//            ex.printStackTrace();
//        }
//    }
//
//    public static void main(String[] args) {
//        VanillaMovieManager7 manager = new VanillaMovieManager7();
//       // manager.setConnection();
//       // manager.persistMovie();
//       // manager.queryMovies();
//
//    }
//
//    private void queryMovies() {
//        try {
//            Statement st = getConnection().createStatement();
//            ResultSet rs = st.executeQuery(selectSql);
//            while (rs.next()) {
//                System.out.println("Movie Found: " + rs.getInt("ID") +
//                        ", Title:" + rs.getString("TITLE"));
//            }
//
//        } catch (java.sql.SQLException ex) {
//
//            System.err.println(ex.getMessage());
//        }
//    }
//}
