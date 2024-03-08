package medical_sales_automation;
/**
 * @author Omer Faruk
 */
public class Pharmacy extends Pharmacy_detail{
    private String email;
    private String user_name;
    private String password;

    public Pharmacy(String pharmacy_id, String pharmacy_name, String email, String user_name, String password) {
        super(pharmacy_id, pharmacy_name);
        this.email = email;
        this.user_name = user_name;
        this.password = password;
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
