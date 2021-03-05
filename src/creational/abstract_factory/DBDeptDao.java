package creational.abstract_factory;

public class DBDeptDao implements Dao {
    @Override
    public void saveData() {
        System.out.println("department data saved in DB");
    }
}
