package com.jeremy.javacoding;

import java.util.ArrayList;

/**
 * Created by Jeremy L on 6/3/2017.
 */

public class User {
    private String userName;
    private String password;
    private Integer lives;
    private Integer level;
    private ArrayList<Award> awards;

    public User(String userName, String password, Integer lives, Integer level, ArrayList<Award> awards) {
        this.userName = userName;
        this.password = password;
        this.lives = lives;
        this.level = level;
        this.awards = awards;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getLives() {
        return lives;
    }

    public void setLives(Integer lives) {
        this.lives = lives;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ArrayList<Award> getAwards() {
        return awards;
    }

    public void setAwards(ArrayList<Award> awards) {
        this.awards = awards;
    }
}
