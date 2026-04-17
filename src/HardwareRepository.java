import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HardwareRepository {
    private String url = "jdbc:mysql://localhost:3306/hardware_db";
    private String user = "root";
    private String pass = "kyhoon0808";

    public List<Hardware> getAllHardware() {
        List<Hardware> list = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(url, user, pass);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM hardware")) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String brand = rs.getString("brand");
                int spec = rs.getInt("spec");
                String type = rs.getString("type");

                if ("Laptop".equalsIgnoreCase(type)) {
                    list.add(new Laptop(id, brand, spec));
                } else if ("Phone".equalsIgnoreCase(type)) {
                    list.add(new Phone(id, brand, spec));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}