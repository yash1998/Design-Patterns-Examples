package behavioural.chain_of_responsibility;

public class ManagerialRound extends Round{

    @Override
    public boolean startRound(Candidate candidate) {
        // ask questions
        int score = 0;
        if (score >= 7 && nextRound != null) {
            return nextRound.startRound(candidate);
        }
        return false;
    }
}
