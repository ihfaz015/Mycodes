class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
    }
}

class Manager extends Employee {
    String department;

    public Manager(String name, String department) {
        super(name);
        this.department = department;
    }


    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, String programmingLanguage) {
        super(name);
        this.programmingLanguage = programmingLanguage;
    }


    public void displayInfo() {
        super.displayInfo();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

public class EmployeeHierarchy {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", "HR");
        Developer developer = new Developer("Bob", "Java");

        manager.displayInfo();
        developer.displayInfo();
    }
}
