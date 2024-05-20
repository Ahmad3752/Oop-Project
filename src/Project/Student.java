/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author Admin
 */


public class Student extends Person {
    public String departmentName;
    public String cmsId;
    public String roomNumber;
    public Student(String name, String cnic, String salary, String address, String phone, String departmentName, String cmsId, String roomNumber) {
        super(name, cnic, salary, address, phone);
        this.departmentName = departmentName;
        this.cmsId = cmsId;
        this.roomNumber = roomNumber;
    }

    public String getDepartmentName() {
        return departmentName;
    }


    public String getCmsId() {
        return cmsId;
    }


    public String getRoomNumber() {
        return roomNumber;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setCmsId(String cmsId) {
        this.cmsId = cmsId;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
}

