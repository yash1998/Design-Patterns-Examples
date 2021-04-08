package behavioural.strategy;

public class Employee {
    private String name;
    private Role role;

    public Employee(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    public void setName(String name) {
        this.name = name;
    }

    void doWork() {
        System.out.println(name + " will " + role.getJob());
    }

    void promoteEmployee(Role role) {
        this.role = role;
    }
}
