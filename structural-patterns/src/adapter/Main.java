package adapter;

public class Main {
    public static void main(String[] args) {
        Database database = new AdapterAppToDB();
        database.insert();
        database.update();
        database.
                select();
        database.remove();
    }
}
