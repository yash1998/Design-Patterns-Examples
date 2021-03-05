package creational.abstract_factory;

public class DBDaoFactory implements DaoAbstractFactory {
    @Override
    public Dao getNewDao(String type) {
        Dao dao = null;
        if (type.equalsIgnoreCase("emp")) {
            dao = new DBEmpDao();
        } else if (type.equalsIgnoreCase("dept")) {
            dao = new DBDeptDao();
        }
        return dao;
    }
}
