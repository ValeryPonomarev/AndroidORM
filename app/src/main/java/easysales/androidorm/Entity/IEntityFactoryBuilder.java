package easysales.androidorm.Entity;

/**
 * Created by drmiller on 16.12.2016.
 */
public interface IEntityFactoryBuilder {
    IEntityFactory GetFactory(String tableName);
}
