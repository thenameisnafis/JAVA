public class Employee {
    private int id;
    private String name;

    public Employee() {
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setEmployeeId(int id) {
        this.id = id;
    }

    public void setEmployeeName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return id;
    }

    public String getEmployeeName() {
        return name;
    }

    public void showEmployeeInfo() {
        System.out.println("Employee Id: " + id);
        System.out.println("Employee Name: " + name);
    }
}




