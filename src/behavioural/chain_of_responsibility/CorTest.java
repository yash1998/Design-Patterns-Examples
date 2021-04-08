package behavioural.chain_of_responsibility;

public class CorTest {
    public static void main(String[] args) {
        Candidate candidate = new Candidate();
        candidate.setName("Alex");

        InterviewPanel panel = new InterviewPanel();
        boolean isHired = panel.hire(candidate);
        if (isHired) {
            System.out.println(candidate.getName() + " is hired.");
        } else {
            System.out.println(candidate.getName() + " is not hired.");
        }

    }
}
