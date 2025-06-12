package employee_accounting.model;

public class Department {
    public String name;
    public String headOfDepartmentId = null;

    public String getName() {
        return name;
    }
    public String getHeadOfDepartmentId() {
        return headOfDepartmentId;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setHeadOfDepartmentId(String headOfDepartmentId) {
        this.headOfDepartmentId = headOfDepartmentId;
    }

    public Department(String name, String headOfDepartmentId) {
        this.name = name;
        this.headOfDepartmentId = headOfDepartmentId;
    }
}