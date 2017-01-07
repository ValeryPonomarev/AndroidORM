package easysales.androidorm.Repository;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.util.HashMap;

/**
 * Created by drmiller on 07.01.2017.
 */

public final class DBHelperRepository {
    private static HashMap<String, DBHelper> helpers;

    public DBHelperRepository() {
        helpers = new HashMap<>();
    }

    public static DBHelper Get(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, String onCreateQuery, String onUpdateQuery) {
        DBHelper helper;
        if(helpers.containsKey(name)){
            helper = new DBHelper(context, name, factory, version, onCreateQuery, onUpdateQuery);
            helpers.put(name, helper);
        }
        else{
            helper = helpers.get(name);
        }
        return helper;
    }
}

