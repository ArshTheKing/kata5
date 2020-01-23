package kata5;
public class Kata5 {
    public static void main(String[] args) {
        Database db=new Database("jdbc:sqlite:C:\\Users\\Azael\\Desktop\\Universidad\\IS2\\Kata5\\kata5\\SQLite\\BD.db");
        db.open();
        
        
        db.select_PERSONAS();
        People people=new People("Alba","Tros","Ornitologia");
        db.insert_PERSONAS(people);
        System.out.println("-------------------------------------");
        db.select_PERSONAS();
        db.close();
    }
    
}
