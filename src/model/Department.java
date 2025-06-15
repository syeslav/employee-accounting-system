package model;

import java.io.Serializable;

//  Класс для хранения информации об отдел.

public class Department implements Serializable {
    private String name;                // Название отдела
    private String managerFullName;     // ФИО начальника отдела

    public Department(String name, String managerFullName) {
        this.name = name;
        this.managerFullName = managerFullName;
    }

    public String name() {
        return name;
    }
    public String managerFullName() {
        return managerFullName;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setManagerFullName(String managerFullName) {
        this.managerFullName = managerFullName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", managerFullName='" + managerFullName + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getManagerFullName() {
        return managerFullName;
    }
}