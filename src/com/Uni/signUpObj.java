package com.Uni;

public class signUpObj {

    public signUpObj(String username, String password,int roll) {
        this.username = username;
        this.password = password;
        this.roll = roll;
    }

    private  String username;
    private String password;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    private  int roll;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
