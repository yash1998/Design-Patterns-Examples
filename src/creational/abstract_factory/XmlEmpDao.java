package creational.abstract_factory;

public class XmlEmpDao implements Dao {
    @Override
    public void saveData() {
        System.out.println("employee data saved in XML");
    }
}
