package com.techcamino.greendao.demo.activities;

import android.app.Application;

import com.techcamino.greendao.demo.database.DaoMaster;
import com.techcamino.greendao.demo.database.DaoSession;

import org.greenrobot.greendao.database.Database;


/**
 * Created by Thinkpad on 04-02-2017.
 */

public class MyApplication extends Application {

    /** A flag to show how easily you can switch from standard SQLite to the encrypted SQLCipher. */
    public static final boolean ENCRYPTED = true;

    private DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();

        /*DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "notes-db");
        Database db = helper.getWritableDb();
        daoSession = new DaoMaster(db).newSession();*/

        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, ENCRYPTED ? "telenor-db-encrypted" : "telenor-db");
        Database db = ENCRYPTED ? helper.getEncryptedWritableDb("telenor") : helper.getWritableDb();
        daoSession = new DaoMaster(db).newSession();
    }

    public DaoSession getDaoSession() {
        return daoSession;
    }
}