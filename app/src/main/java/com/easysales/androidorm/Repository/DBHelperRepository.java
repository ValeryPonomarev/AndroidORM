package com.easysales.androidorm.Repository;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.util.HashMap;

/**
 * Created by drmiller on 07.01.2017.
 */

public final class DBHelperRepository {
    private static HashMap<String, DBHelper> helpers;

    static {
        helpers = new HashMap<>();
    }

    public static DBHelper Get(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, String onCreateQuery, String onUpdateQuery) {
        DBHelper helper;
        if(helpers.containsKey(name)){
            helper = helpers.get(name);
        }
        else{
            helper = new DBHelper(context, name, factory, version, onCreateQuery, onUpdateQuery);
            helpers.put(name, helper);
        }
        if(helper == null) throw new IllegalArgumentException(String.format("DBHelper with name [%1$s] not found", name));
        return helper;
    }
}

