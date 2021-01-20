package c.a.a.d;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class b extends SQLiteOpenHelper {
    public b(Context context) {
        super(context, "users.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS users (_id INTEGER PRIMARY KEY,username TEXT,firstname TEXT,lastname TEXT,password_hash TEXT)");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        super.onDowngrade(sQLiteDatabase, i, i2);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS users");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS users (_id INTEGER PRIMARY KEY,username TEXT,firstname TEXT,lastname TEXT,password_hash TEXT)");
    }
}
