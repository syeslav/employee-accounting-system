package service;

import model.Department;

import java.util.List;

// Класс для управления отделами.

public class DepartmentService {
    private List<Department> departments;

    // добавить новый отдел.
    public void addDepartment(Department dep) {
        departments.add(dep);
    }

    // получить список всех отделов.
    public List<Department> getAll() {
        return departments;
    }

    // установить (заменить) список отделов.
    public void setAll(List<Department> departments) {
        this.departments = departments;
    }
}
