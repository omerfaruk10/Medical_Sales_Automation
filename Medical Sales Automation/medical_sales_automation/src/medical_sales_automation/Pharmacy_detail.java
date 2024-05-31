package medical_sales_automation;
/**
 * @author Omer Faruk
 */
public class Pharmacy_detail{
    private String pharmacy_id;
    private String pharmacy_name;

    public Pharmacy_detail(String pharmacy_id, String pharmacy_name) {
        this.pharmacy_id = pharmacy_id;
        this.pharmacy_name = pharmacy_name;
    }

    public String getPharmacy_id() {
        return pharmacy_id;
    }

    public void setPharmacy_id(String pharmacy_id) {
        this.pharmacy_id = pharmacy_id;
    }

    public String getPharmacy_name() {
        return pharmacy_name;
    }

    public void setPharmacy_name(String pharmacy_name) {
        this.pharmacy_name = pharmacy_name;
    }

}
