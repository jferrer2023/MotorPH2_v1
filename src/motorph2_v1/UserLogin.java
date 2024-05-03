
package motorph2_v1;
import java.util.Scanner;

public class UserLogin {
    private String username;
    private String password;

    public UserLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean authenticate() {
        return this.username.equals("user1") && this.password.equals("123");
    }
}
