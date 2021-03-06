package beans;

import java.io.Serializable;

/**
 * Clase con los métodos get y set de los datos importantes de un usuario
 *
 * @author Ana Teresa Quesada Ramírez
 * @author Juan Miguel Arias Mejías
 */
public class User implements Serializable {

    private String nick;
    private String email;
    private String password;

    public User(String nick, String email, String password) {
        this.nick = nick;
        this.email = email;
        this.password = password;
    }

    public User() {
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "nick=" + nick + ", email=" + email + ", password=" + password + '}';
    }

}
