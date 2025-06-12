package employee_accounting.model;

import java.time.LocalDate;

public class Employee {
    public String id;
    public String fullName;
    public String phoneNumber;
    public String position;
    public String departmentName;
    public String managerId;
    public LocalDate hireDate;
    public LocalDate dareOfBirth = null;
    public Gender gender;
    public double salary;

    public String getId() {
        return id;
    }
    public String getFullName() {
        return fullName;
    }
    public String getPosition() {
        return position;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public String getManagerId() {
        return managerId;
    }
    public LocalDate getHireDate() {
        return hireDate;
    }
    public LocalDate getDareOfBirth() {
        return dareOfBirth;
    }
    public Gender getGender() {
        return gender;
    }
    public double getSalary() {
        return salary;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }
    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
    public void setDareOfBirth(LocalDate dareOfBirth) {
        this.dareOfBirth = dareOfBirth;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String id, String fullName, String phoneNumber, String position, String departmentName,
                    String managerId, LocalDate hireDate, LocalDate dareOfBirth, Gender gender, double salary) {
        this.id = id;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.position = position;
        this.departmentName = departmentName;
        this.managerId = managerId;
        this.hireDate = hireDate;
        this.dareOfBirth = dareOfBirth;
        this.gender = gender;
        this.salary = salary;
    }
}