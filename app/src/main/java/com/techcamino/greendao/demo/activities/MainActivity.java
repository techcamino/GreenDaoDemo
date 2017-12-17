package com.techcamino.greendao.demo.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import com.techcamino.greendao.demo.R;
import com.techcamino.greendao.demo.database.DaoSession;
import com.techcamino.greendao.demo.database.User;
import com.techcamino.greendao.demo.database.UserDao;

public class MainActivity extends AppCompatActivity {

    private UserDao userDao;
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaoSession daoSession = ((MyApplication) getApplication()).getDaoSession();
        userDao = daoSession.getUserDao();

        saveInGreenDao();
    }

    public void saveInGreenDao()
    {
        user = new User();
        user.setName("Hello Green Dao");
        Long id = userDao.insertOrReplace(user);

        if (id > 0) {
            Log.d("Message",id+" Inserted Id");
            ((TextView)findViewById(R.id.greendao_txt)).setText(" Record Inserted with this id"+ id);
        }
    }
}
