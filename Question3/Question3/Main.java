package Question3;

class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void printEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class EmployeeSalary {
    private double salary;

    public EmployeeSalary(double salary) {
        this.salary = salary;
    }

    public void giveRaise(double percent) {
        salary += salary * percent / 100;
        System.out.println("New salary: " + salary);
    }
}

class EmployeeDepartment {
    private String department;

    public EmployeeDepartment(String department) {
        this.department = department;
    }

    public void changeDepartment(String newDepartment) {
        department = newDepartment;
        System.out.println("Department changed to: " + department);
    }
}

class EmployeeAddress {
    private String address;

    public EmployeeAddress(String address) {
        this.address = address;
    }

    public void updateAddress(String newAddress) {
        address = newAddress;
        System.out.println("Address updated to: " + address);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Lindy Crain", 101);
        EmployeeSalary salary = new EmployeeSalary(500000);
        EmployeeDepartment department = new EmployeeDepartment("Engineering");
        EmployeeAddress address = new EmployeeAddress("777 W. Main St");

        employee.printEmployeeDetails();
        salary.giveRaise(10);
        department.changeDepartment("Product");
        address.updateAddress("2323 W. Regan Ave.");
    }
}
 
 
