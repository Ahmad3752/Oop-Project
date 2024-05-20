/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author Admin
 */
public class Manager extends Person {
    public String username;
    public String password;
    public Manager(String name, String cnic, String salary, String address, String phone,String username,String password) {
        super(name, cnic, salary, address, phone);
        this.username = username;
        this.password =  password;
    }

    public String getPassword() {
        return password;
    }


    public String username() {
        return this.username();
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
