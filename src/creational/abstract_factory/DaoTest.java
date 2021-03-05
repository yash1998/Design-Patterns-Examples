package creational.abstract_factory;

public class DaoTest {
    public static void main(String[] args) {
        DaoAbstractFactory factory = DaoMaker.makeDao("db");
        Dao dao = factory.getNewDao("dept");

        dao.saveData();
    }
}
