package medical_sales_automation;
/**
 * @author Omer Faruk
 */
public class Medicine {
    private String pharmacy_id;
    private String medicine_id;
    private String medicine_name;
    private String dosage;
    private String stock;
    private String time;
    private String form;
    private String pharmacy_name;
    
    // Eczanedeki ilaçlar ve kullanıcının ilaçları için kullandığım constructor
    public Medicine(String pharmacy_id, String medicine_id, String medicine_name, String dosage, String stock, String time, String form) {
        this.pharmacy_id = pharmacy_id;
        this.medicine_id = medicine_id;
        this.medicine_name = medicine_name;
        this.dosage = dosage;
        this.stock = stock;
        this.time = time;
        this.form = form;
    }
    
    // Tüm eczanelerdeki tüm ilaçlar için kullandığım constructor
    public Medicine(String pharmacy_id, String medicine_id, String medicine_name, String pharmacy_name, String dosage, String stock, String time, String form) {
        this.pharmacy_id = pharmacy_id;
        this.medicine_id = medicine_id;
        this.medicine_name = medicine_name;
        this.pharmacy_name = pharmacy_name;
        this.dosage = dosage;
        this.stock = stock;
        this.time = time;
        this.form = form;
    }

    public String getPharmacy_id() {
        return pharmacy_id;
    }

    public void setPharmacy_id(String pharmacy_id) {
        this.pharmacy_id = pharmacy_id;
    }

    public String getMedicine_id() {
        return medicine_id;
    }

    public void setMedicine_id(String medicine_id) {
        this.medicine_id = medicine_id;
    }

    public String getMedicine_name() {
        return medicine_name;
    }

    public void setMedicine_name(String medicine_name) {
        this.medicine_name = medicine_name;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getPharmacy_name() {
        return pharmacy_name;
    }

    public void setPharmacy_name(String pharmacy_name) {
        this.pharmacy_name = pharmacy_name;
    }
    
    
}
