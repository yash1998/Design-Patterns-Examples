package behavioural.chain_of_responsibility;

public class InterviewPanel {

    public boolean hire(Candidate candidate) {

        Round round = new TechnicalRound();

        Round round2 = new ManagerialRound();
        round.setNextRound(round2);

        Round round3 = new HrRound();
        round2.setNextRound(round3);

        return round.startRound(candidate);
    }
}
