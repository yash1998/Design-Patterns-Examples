package creational.abstract_factory;

public class XmlDeptDao implements Dao {
    @Override
    public void saveData() {
        System.out.println("department data saved in XML");
    }
}
