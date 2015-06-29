package BaseDatos;

import beans.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Ana Teresa
 */
public class DataBaseManager {

    public DataBaseManager() {
        cargarDriver();
    }

    private void cargarDriver() {
        try {

            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            System.err.println(e);
        }
    }

    public Connection conectarBaseDatos() {
        Connection c = null;
        try {

            c = DriverManager.getConnection("jdbc:mysql://localhost/databaseusers", "root", "root");

        } catch (SQLException e) {
            System.err.println(e);
        }
        return c;
    }

    public Statement getStatement() {

        Statement st = null;

        try {

            Connection c = conectarBaseDatos();
            st = c.createStatement();

        } catch (SQLException e) {
            System.err.println(e);
        }

        return st;
    }

    public void registrar(String tabla, User user) {

        Statement st = getStatement();
        String nick = sqlFormat(user.getNick());
        String email = sqlFormat(user.getEmail());
        String password = sqlFormat(user.getPassword());

        String sql = "insert into " + tabla + " (nick, email, password) values(" + nick + ", " + email + ", " + password + ")";

        try {

            st.executeUpdate(sql);

        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public String contenidoTabla(String tabla) {

        Statement st = getStatement();
        StringBuilder sb = new StringBuilder();
        try {
            // select * from tabla
            ResultSet rs = st.executeQuery("select * from " + tabla);
            while (rs.next()) {
                sb.append("id: ").append((int) rs.getObject("id"))
                        .append(" nick: ").append((String) rs.getObject("nick"))
                        .append(" email: ").append((String) rs.getObject("email"))
                        .append(" password: ").append((String) rs.getObject("password"))
                        .append("\n");
            }
            rs.close();
        } catch (SQLException e) {
            System.err.println(e);
        }

        return sb.toString();
    }

    public User login(String tabla, String identificador, String password) {

        Statement st = getStatement();
        User userNick = nickLog(tabla, identificador);
        User userEmail = emailLog(tabla, identificador);

        if (userNick != null) {

            // Se encontro
            if (userNick.getPassword().equals(password)) {
                return userNick;
            }
        }

        if (userEmail != null) {

            if (userEmail.getPassword().equals(password)) {

                return userEmail;
            }
        }

        // No se encontro
        return null;
    }

    public void editarNick(String tabla, String nickAnt, String nuevo) {
        Statement st = getStatement();
        String nickNuevo = sqlFormat(nuevo);
        String sql = "update " + tabla + " set nick = " + nickNuevo + " where nick = " + sqlFormat(nickAnt);
        try {
            st.executeUpdate(sql);
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public void editarPassword(String tabla, String nick, String passwordAnt, String nuevo) {
        // Tere hacer
    }

    public void editarEmail(String tabla, String nuevo) {
        // Tere hacer
    }

    private User nickLog(String tabla, String nick) {

        Statement st = getStatement();
        User user = null;

        String sql = "select * from " + tabla + " where nick = " + sqlFormat(nick);

        try {
            ResultSet rs = st.executeQuery(sql);

            String nickU = (String) rs.getObject("nick");
            String emailU = (String) rs.getObject("email");
            String passwordU = (String) rs.getObject("password");

            rs.close();
            return new User(nickU, emailU, passwordU);

        } catch (SQLException e) {
            System.err.println(e);
        }
        return null;
    }

    private User emailLog(String tabla, String email) {

        Statement st = getStatement();
        User user = null;

        String sql = "select * from " + tabla + " where email = " + sqlFormat(email);

        try {
            ResultSet rs = st.executeQuery(sql);

            String nickU = (String) rs.getObject("nick");
            String emailU = (String) rs.getObject("email");
            String passwordU = (String) rs.getObject("password");

            rs.close();
            return new User(nickU, emailU, passwordU);

        } catch (SQLException e) {
            System.err.println(e);
        }
        return null;
    }

    public String sqlFormat(String value) {
        return "\"" + value + "\"";
    }

}
