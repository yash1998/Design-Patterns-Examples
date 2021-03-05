package creational.abstract_factory;

public class XmlDaoFactory implements DaoAbstractFactory {
    @Override
    public Dao getNewDao(String dataType) {
        Dao dao = null;
        if (dataType.equalsIgnoreCase("emp")) {
            dao = new XmlEmpDao();
        } else if (dataType.equalsIgnoreCase("dept")) {
            dao = new XmlDeptDao();
        }
        return dao;
    }
}
