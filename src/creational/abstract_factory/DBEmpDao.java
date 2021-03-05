package creational.abstract_factory;

public class DBEmpDao implements Dao {
    @Override
    public void saveData() {
        System.out.println("employee Data saved in DB");
    }
}