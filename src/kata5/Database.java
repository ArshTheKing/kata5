package kata5;

import java.sql.Connection;
import java.sql.DriverManager;
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
            System.out.println("Mensadjfafaslifu");
        } catch (Exception e) {
            System.out.println("Error DataBase::open (SQLException "+ e.getMessage()+" )");
        }
    }
    void close(){
        try {
            this.connection.close();
            System.out.println("Mensadjfafaslifucierra");
        } catch (Exception e) {
            System.out.println("Error DataBase::close (SQLException "+ e.getMessage()+" )");
        }
    }
    
    
    
    
}
