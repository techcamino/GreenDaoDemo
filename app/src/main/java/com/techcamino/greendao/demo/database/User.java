package com.techcamino.greendao.demo.database;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Thinkpad on 17-12-2017.
 */

@Entity
public class User {

    // this will make your id autoincremented
    @org.greenrobot.greendao.annotation.Id (autoincrement = true)
    private Long Id;
    private String name;
    @Generated(hash = 690585871)
    public User(Long Id, String name) {
        this.Id = Id;
        this.name = name;
    }
    @Generated(hash = 586692638)
    public User() {
    }
    public Long getId() {
        return this.Id;
    }
    public void setId(Long Id) {
        this.Id = Id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
