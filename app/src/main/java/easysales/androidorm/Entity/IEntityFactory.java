package easysales.androidorm.Entity;

import android.database.Cursor;

/**
 * Created by drmiller on 06.07.2016.
 */
public interface IEntityFactory<T extends Entity> {
    T BuildEntity(Cursor cursor);
}

