package medical_sales_automation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 * @author Omer Faruk
 */
public class List {
    public ArrayList<User> getKullanicilar() throws SQLException{ // Kullanıcıların bilgileri
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        ArrayList<User> users = null;
        
        try {
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from infos");
            users = new ArrayList<>();
            while (resultSet.next()) {
                users.add(new User(
                        resultSet.getString("Name"),
                        resultSet.getString("Surname"),
                        resultSet.getString("Email"),
                        resultSet.getString("User_name"),
                        resultSet.getString("Password")
                ));
            }
        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
        return users;
    }
    
    public ArrayList<Pharmacy> getKurumlar() throws SQLException{ // Kurumların (eczanelerin) bilgileri
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        ArrayList<Pharmacy> pharmacies = null;
        
        try {
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from pharmacies");
            pharmacies = new ArrayList<>();
            while (resultSet.next()) {
                pharmacies.add(new Pharmacy(
                        resultSet.getString("Business_no"),
                        resultSet.getString("Business_name"),
                        resultSet.getString("Email"),
                        resultSet.getString("User_name"),
                        resultSet.getString("Password")
                ));
            }
        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
        return pharmacies;
    }
    
    public ArrayList<Medicine> getKurumİlaclar(String kurum_no) throws SQLException{ // Eczanedeki ilaçların bilgileri
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        ArrayList<Medicine> medicines = new ArrayList<>();

        try {
            connection = dbHelper.getConnection();
            String sql = "SELECT ID, Pharmacy_ID, Medicine_ID, Name, Dosage,"
                    + "Stock, Time, Form FROM medicines WHERE Pharmacy_ID = ? and User_ID = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, kurum_no);
            preparedStatement.setString(2, "");
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                medicines.add(new Medicine(
                        resultSet.getString("Pharmacy_ID"),
                        resultSet.getString("Medicine_ID"),
                        resultSet.getString("Name"),
                        resultSet.getString("Dosage"),
                        resultSet.getString("Stock"),
                        resultSet.getString("Time"),
                        resultSet.getString("Form")
                ));
            }
        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        } finally {
            resultSet.close();
            preparedStatement.close();
            connection.close();
        }
        return medicines;
    }
    
    public ArrayList<Medicine> getKullaniciİlaclar(String kullanici_adi) throws SQLException{ // Kullanıcının ilaçları
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        ArrayList<Medicine> medicines = new ArrayList<>();

        try {
            connection = dbHelper.getConnection();
            String sql = "SELECT ID, User_ID, Medicine_ID, Name, Pharmacy_name,"
                    + "Dosage, Time, Form FROM medicines WHERE User_ID = ?";
            
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, kullanici_adi);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                medicines.add(new Medicine(
                        resultSet.getString("User_ID"),
                        resultSet.getString("Medicine_ID"),
                        resultSet.getString("Name"),
                        resultSet.getString("Pharmacy_name"),
                        resultSet.getString("Dosage"),
                        resultSet.getString("Time"),
                        resultSet.getString("Form")
                ));
            }
        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        } finally {
            resultSet.close();
            preparedStatement.close();
            connection.close();
        }
        return medicines;
    }
    
    public ArrayList<Medicine> getTumIlaclar() throws SQLException{ // Tüm eczanelerdeki tüm ilaçlar
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        ArrayList<Medicine> medicines = new ArrayList<>();

        try {
            connection = dbHelper.getConnection();
            String sql = "SELECT ID, Pharmacy_ID, Medicine_ID, Name, Pharmacy_name,"
                    + "Dosage, Stock, Time, Form FROM medicines WHERE User_ID = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                medicines.add(new Medicine(
                        resultSet.getString("Pharmacy_ID"),
                        resultSet.getString("Medicine_ID"),
                        resultSet.getString("Name"),
                        resultSet.getString("Pharmacy_name"),
                        resultSet.getString("Dosage"),
                        resultSet.getString("Stock"),
                        resultSet.getString("Time"),
                        resultSet.getString("Form")
                ));
            }
        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        } finally {
            resultSet.close();
            preparedStatement.close();
            connection.close();
        }
        return medicines;
    }
}
