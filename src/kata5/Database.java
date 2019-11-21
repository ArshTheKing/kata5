package kata5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
class Database {
    private final String url;
    private Connection connection;

    Database(String url) {
        this.url=url;
    }
    
    void open(){
        try {
            this.connection=DriverManager.getConnection(this.url);
            System.out.println("----\nOpen\n----");
        } catch (Exception e) {
            System.out.println("Error DataBase::open (SQLException "+ e.getMessage()+" )");
        }
    }
    void close(){
        try {
            this.connection.close();
            System.out.println("-----\nClose\n------");
        } catch (Exception e) {
            System.out.println("Error DataBase::close (SQLException "+ e.getMessage()+" )");
        }
    }

    void select_PERSONAS() {
        String sql = "Select * from people";
        try {
            Statement statement=this.connection.createStatement();
            ResultSet res = statement.executeQuery(sql);
            
            System.out.println("ID \t Name \t APELLIDOS \tDEPARTAMENTO");
            System.out.println("----------------------------------------");
            while (res.next()) {
            System.out.println(res.getInt("ID")+" \t "+
                               res.getString("Name") +" \t "+
                               res.getString("Apellidos")+" \t \t"+
                               res.getString("Departamento"));
                
            }
        } catch (Exception e) {
            System.out.println("Error DataBase::select_PERSONAS (SQLException "+ e.getMessage()+" )");
        }
    }

    void insert_PERSONAS(People people) {
        String sql= "Insert into people(Name, Apellidos, Departamento) values(?,?,?)";
        
        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
            preparedStatement.setString(1, people.getNombre());
            preparedStatement.setString(2, people.getApellidos());
            preparedStatement.setString(3, people.getDep());
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error DataBase::insert_PRESONAS (SQLException "+ e.getMessage()+" )");
        }
    }
    
    
    
    
}
