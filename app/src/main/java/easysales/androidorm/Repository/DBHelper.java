package easysales.androidorm.Repository;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.HashMap;
import java.util.List;

/**
 * Created by drmiller on 06.07.2016.
 */

public class DBHelper extends SQLiteOpenHelper {
    private String onCreateQuery;
    private String onUpdateQuery;
    private String tableName;

    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, String onCreateQuery, String onUpdateQuery) {
        super(context, name, factory, version);
        this.onCreateQuery = onCreateQuery;
        this.onUpdateQuery = onUpdateQuery;
        this.tableName = name;
    }
/*
    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }
/**/

    @Override
    public void onCreate(SQLiteDatabase db) {
        if(onCreateQuery != null && onCreateQuery.length() > 0)
        {
            Log.d("Execute sql", onCreateQuery);
            db.execSQL(onCreateQuery);
            Log.d("Execute sql", String.format("Table %1$s has been created", this.tableName));
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        if(onUpdateQuery != null && onUpdateQuery.length() > 0)
        {
            Log.d("Execute sql", onUpdateQuery);
            db.execSQL(onUpdateQuery);
        }

        onCreate(db);
    }
}
