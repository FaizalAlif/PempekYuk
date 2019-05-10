package com.example.pempekyuk.Model;

public class Users {
    private String InputUsername, InputEmail, InputPassword;
    public Users(){

    }

    public Users(String username,String email,String password){
        this.InputUsername = username;
        this.InputEmail = email;
        this.InputPassword = password;
    }

    public String getInputUsername() {
        return InputUsername;
    }

    public String getInputEmail() {
        return InputEmail;
    }

    public String getInputPassword() {
        return InputPassword;
    }

    public void setInputUsername(String inputUsername) {
        InputUsername = inputUsername;
    }

    public void setInputEmail(String inputEmail) {
        InputEmail = inputEmail;
    }

    public void setInputPassword(String inputPassword) {
        InputPassword = inputPassword;
    }
}
