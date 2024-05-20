/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author Admin
 */
public  class Person {
    private String name;
    private String cnic;
    private String salary;
    private String address;
    private String phone;
    public Person(String name, String cnic, String salary, String address, String phone){
        this.name=name;
        this.cnic=cnic;
        this.salary=salary;
        this.address=address;
        this.phone=phone;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCnic() {
        return cnic;
    }

    public String getPhone() {
        return phone;
    }

    public String getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

}

