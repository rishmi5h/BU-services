package org.rishmi5h.dto.auth;

public class SignInDto {

    private String firstName;
    private String lastName;
    private String email;
    private String password;


    SignInDto(){

    }

    @Override
    public String toString(){
        return "SignInDto{" +
                "email=" + email +
                ", password=" + password +
                ", firstName=" + firstName +
                ", lastName=" + lastName +
                ",";
    }


    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
