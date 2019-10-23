package Springxml.Beans;

import Springxml.Services.loginService;

import java.security.SecureRandom;

public class User {
    int ID;
    String userName;
    String firstName;
    String LastName;
    int avatar;
    String password;
    loginService in;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public boolean login () {
        in.login(userName,password);
        return true;
    }

    public loginService getIn() {
        return in;
    }

    public void setIn(loginService in) {
        this.in = in;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }


}
