package BaseDatos;

import beans.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Clase encargada del manejo de la conexión con la base de datos. Acciones como
 * consulta, ingreso y modificación de un usuario en la tabla
 *
 * @author Ana Teresa Quesada Ramírez
 * @author Juan Miguel Arias Mejías
 */
public class DataBaseManager {

    final String TABLE_NAME = "users"; // nombre de la tabla de usuarios

    public DataBaseManager() {
        loadDriver();
    }

    private void loadDriver() {
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

    public void registrar(User user) throws SQLException {

        Statement st = getStatement();
        String nick = sqlFormat(user.getNick());
        String email = sqlFormat(user.getEmail());
        String password = sqlFormat(user.getPassword());

        String sql = "insert into " + TABLE_NAME + " (nick, email, password) values(" + nick + ", " + email + ", " + password + ")";
        st.executeUpdate(sql);
    }

    public String contenidoTabla() {

        Statement st = getStatement();
        StringBuilder sb = new StringBuilder();
        try {
            // select * from tabla
            ResultSet rs = st.executeQuery("select * from " + TABLE_NAME);
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

    public User login(String identificador, String password) {

        Statement st = getStatement();
        User userNick = nickLog(identificador);
        User userEmail = emailLog(identificador);

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

    public void editarNick(String nickAntig, String nuevo) {
        Statement st = getStatement();
        String nickNuevo = sqlFormat(nuevo);
        String sql = "update " + TABLE_NAME + " set nick = " + nickNuevo + " where nick = " + sqlFormat(nickAntig);
        try {
            st.executeUpdate(sql);
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public void editarPassword(String nick, String passwordAnt, String nuevo) {
        Statement st = getStatement();
        String passwordNueva = sqlFormat(nuevo);
        String sql = "update " + TABLE_NAME + " set password = " + passwordNueva + " where nick = " + sqlFormat(nick);
        try {
            st.executeUpdate(sql);
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public void editarEmail(String old_email, String new_email) {
        Statement st = getStatement();
        String emailNuevo = sqlFormat(new_email);
        String sql = "update " + TABLE_NAME + " set email = " + emailNuevo + " where email = " + sqlFormat(old_email);
        try {
            st.executeUpdate(sql);
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    private User nickLog(String nick) {

        Statement st = getStatement();
        User user = null;

        String sql = "select * from " + TABLE_NAME + " where nick = " + sqlFormat(nick);

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

    private User emailLog(String email) {

        Statement st = getStatement();
        User user = null;

        String sql = "select * from " + TABLE_NAME + " where email = " + sqlFormat(email);

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
