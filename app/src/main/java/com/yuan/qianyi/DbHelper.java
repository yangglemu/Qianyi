package com.yuan.qianyi;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {
    private final static String name = "Qianyi.db";
    private final static int version = 1;

    public DbHelper(Context context) {
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE [goods] (tm INTEGER,sl INTEGER,shop VARCHAR(20))");
        db.execSQL("CREATE TABLE [mail] (uid VARCHAR(100),rq DATE)");
        db.execSQL("CREATE TABLE [note] (rq DATETIME,text TEXT)");
        db.execSQL("CREATE TABLE [sale_db] (djh VARCHAR(20),sl INTEGER,je INTEGER,ss INTEGER,zl INTEGER,rq DATETIME,syy VARCHAR(10),shop VARCHAR(20))");
        db.execSQL("CREATE TABLE [sale_mx] (djh VARCHAR(20),tm INTEGER,sl INTEGER,zq REAL,je INTEGER,shop VARCHAR(20),rq DATETIME)");
        db.execSQL("CREATE TABLE [shop] (pname VARCHAR(20) PRIMARY KEY,name VARCHAR(40),address VARCHAR(100),worker VARCHAR(20),tel VARCHAR(100),rq DATETIME)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        throw new UnsupportedOperationException();
    }
}
