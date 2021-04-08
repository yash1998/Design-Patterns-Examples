package behavioural.chain_of_responsibility;

public class HrRound extends Round {

    @Override
    public boolean startRound(Candidate candidate) {
        // ask questions
        int score = 0;
        if (score >= 7) {
            return true;
        }
        return false;
    }
}
