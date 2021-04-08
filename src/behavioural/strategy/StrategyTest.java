package behavioural.strategy;

public class StrategyTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alex", new SoftwareEngineer());
        Employee emp2 = new Employee("Alan", new SeniorSoftwareEngineer());

        emp1.doWork();
        emp2.doWork();

        emp1.promoteEmployee(new SeniorSoftwareEngineer());
        emp2.promoteEmployee(new TeamLead());

        emp1.doWork();
        emp2.doWork();

    }
}
