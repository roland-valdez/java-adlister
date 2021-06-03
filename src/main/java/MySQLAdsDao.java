import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.mysql.cj.jdbc.Driver;

public class MySQLAdsDao implements Ads{
    private Connection connection;
//    private List<Ad> ads;

//    public MySQLAdsDao (Config config) throws SQLException {
//        this.connection = DriverManager.getConnection(
//                config.getUrl(),
//                config.getUser(),
//                config.getPassword()
//        );
//    }
public MySQLAdsDao() throws SQLException {

            DriverManager.registerDriver(new Driver());
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost/adlister_db?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true",
                "root",
                "codeup"
        );
}
    @Override
    public List<Ad> all()  {

        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ads");
            return addToList(rs);
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving all products.", e);
        }
    }
    private List<Ad> addToList(ResultSet rs) throws SQLException {
        List<Ad> ads = new ArrayList<>();
        while (rs.next()) {
            ads.add(readSingleAd(rs));
        }
        return ads;
    }
    private Ad readSingleAd(ResultSet rs) throws SQLException {
        return new Ad(
                rs.getLong("id"),
//                rs.getLong("userId"),
                rs.getString("title"),
                rs.getString("description")
        );
    }


    @Override
    public Long insert(Ad ad) {

        try {
            Statement stmt = connection.createStatement();
            String query = "INSERT INTO ads(title, description) VALUES ('" + ad.getTitle()+ "', '" + ad.getDescription() + "')";
            System.out.println(query);
            stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            System.out.println("Created new product with ID: " + rs.getLong(1));
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new ad.", e);
        }

    }
}
