import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class jdbcLecture {
    public static void main(String[] args) throws SQLException {
        DriverManager.registerDriver(new Driver());
        Config config = new Config();
        Connection connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()
        );
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM albums");
//        System.out.println(rs);
        while (rs.next()) {
            System.out.println("Artist: " +rs.getString("artist"));
            System.out.println("Album name: " +rs.getString("name"));
            System.out.println("Sales in millions: " +rs.getString("sales"));
            System.out.println();
        }
    }
}
