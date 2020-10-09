import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Created by t00036478 on 01/02/2018.
 */
public class VanillaMovieManager {
    private String driverClass = "oracle.jdbc.driver.OracleDriver";
    private Connection connection = null;
    private String url = "jdbc:oracle:thin:@studentoracle.students.ittralee.ie:1521:orcl";
    private String username = "C##USER1"; // your username
    private String password = "AlanDaly2?"; //your password


    private void setConnection() {
        try {
            Class.forName(driverClass).newInstance();
            connection = DriverManager.getConnection(url, username, password);
        } catch (Exception ex) {

        }

    }

}