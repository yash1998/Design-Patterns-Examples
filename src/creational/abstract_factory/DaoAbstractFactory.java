package creational.abstract_factory;

interface DaoAbstractFactory {
    Dao getNewDao(String type);
}
