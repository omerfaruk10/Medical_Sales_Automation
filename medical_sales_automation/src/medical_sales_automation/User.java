package medical_sales_automation;
/**
 * @author Omer Faruk
 */
public class User {
    private String name;
    private String surname;
    private String email;
    private String user_name;
    private String password;

    public User(String name, String surname, String email, String user_name, String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.user_name = user_name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
