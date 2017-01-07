package easysales.androidorm.Repository;

import android.database.Cursor;
import java.util.List;
import easysales.androidorm.Entity.Entity;

/**
 * Created by drmiller on 05.07.2016.
 */
public interface IRepository<T extends Entity> {
    T FindBy(Object key);
    List<T> FindAllList();
    Cursor FindAll();
    void Add(T entity);
    T Get(Object key);
    void Set(Object key, T entity);
    void Remove(T entity);
}
