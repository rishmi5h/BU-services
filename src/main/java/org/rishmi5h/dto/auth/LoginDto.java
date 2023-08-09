package org.rishmi5h.dto.auth;

public class LoginDto {

    private String email;
    private String password;


    LoginDto(){

    }

    @Override
    public String toString(){
        return "LoginDto{" +
                "email=" + email +
                ", password=" + password +
                ",";
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
