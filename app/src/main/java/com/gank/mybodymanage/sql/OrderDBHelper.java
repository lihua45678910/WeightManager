package com.gank.mybodymanage.sql;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * 数据库创建类
 * Created by Ly on 2018/2/22.
 */

public class OrderDBHelper extends SQLiteOpenHelper {

    public static final String DB_NAME = "BodyManage";
    public static final String TABLE_NAME = "weight";
    public static final int DB_VERSION = 1;

    public OrderDBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table if not exists " + TABLE_NAME + " (Id integer primary key, name varchar(20), weight integer(5), height integer(5), date integer(20))";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}