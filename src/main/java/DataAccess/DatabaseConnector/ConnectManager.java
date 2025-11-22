package DataAccess.DatabaseConnector;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbutils.DbUtils;

public class ConnectManager {
    private Connection connect;
    private String url;
    private String username;
    private String password;
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

    public ConnectManager() {
        DbUtils.loadDriver(JDBC_DRIVER);
        Properties properties = new Properties();
        try {
            // Đường dẫn tài nguyên trên classpath
            String resourcePath = "DataAccess/DatabaseConnector/dbconfig.properties";
            
            // Tải file từ classpath
            InputStream is = getClass().getClassLoader().getResourceAsStream(resourcePath);

            // Rất quan trọng: Kiểm tra xem file có thực sự được tìm thấy không
            if (is == null) {
                throw new IOException("Không thể tìm thấy file cấu hình: " + resourcePath);
            }

            properties.load(is); // Tải từ InputStream


            this.url = properties.getProperty("url");
            this.username = properties.getProperty("username");
            this.password = properties.getProperty("password");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connect;
    }

    public void openConnection() {
        try {
            this.connect = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            System.out.println("Can't connect database " + url);
        }
    }

    public void closeConnection() {
        try {
            DbUtils.close(connect);
        } catch (SQLException e) {
            System.out.println("Something went wrong when closing database");
            ;
        }
    }
}
