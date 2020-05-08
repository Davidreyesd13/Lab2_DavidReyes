package lab2_davidreyes;

public class login {
private String user;
private String pass;

    public login() {
    }

    public login(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "login{" + "user=" + user + ", pass=" + pass + '}';
    }

}
