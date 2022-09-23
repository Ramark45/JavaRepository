package OnlineElectronicStore.Models;

public class Credentials {
    String username, password;
    public Credentials(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "Credentials [username=" + username + ", password=" + password + "]";
    }
    @Override
    public boolean equals(Object obj) {
        super.equals(obj);
        if(obj == null)
            return false;
        Credentials o = (Credentials) obj;
        return this.username.equals(o.getUsername()) && this.password.equals(o.getPassword());
    }
}


