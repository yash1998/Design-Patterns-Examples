package creational.abstract_factory;

// factory of factories(Xml DaoFactory, DB DaoFactory)
public class DaoMaker {
    public static DaoAbstractFactory makeDao(String saveIn) {
        DaoAbstractFactory factory = null;
        if (saveIn.equalsIgnoreCase("xml")) {
            factory = new XmlDaoFactory();
        } else if (saveIn.equalsIgnoreCase("db")) {
            factory = new DBDaoFactory();
        }
        return factory;
    }
}
