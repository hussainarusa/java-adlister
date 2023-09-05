
import java.sql.*;

public class JDBCAlbumDao {

    private final Connection connection;

    public JDBCAlbumDao(Connection connection) {
        this.connection = connection;

        public int insertAlbum(Album) {}
        int lastInsertedId = 0;
        try {
            Statement statement = this.connection.createStatement();
            String insertQuery = String.format("INSERT INTO albums (artist, name, release_date, sales, genre) VALUES ('%s', '%s', %d, %f, '%s')",
                    album.getArtist(),
                    album.getName(),
                    album.getReleaseDate(),
                    album.getSales(),
                    album.getGenre()
            );
            statement.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                lastInsertedId = rs.getInt(1);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lastInsertedId;
    }

    public static <Album> void main(String[] args) {
        JDBCAlbumDao albumDao = new JDBCAlbumDao(connection);
        Album album = new Album(
                "Kendrick Lamar",
                "To Pimp a Butterfly",
                2015,
                24.2,
                "Hip hop");
        int lastInsertedId = albumDao.insertAlbum(album);
        System.out.println("Added a new album with an id of..." + lastInsertedId);
    }
}


