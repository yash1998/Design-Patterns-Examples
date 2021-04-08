package behavioural.chain_of_responsibility;

public abstract class Round {

    protected Round nextRound;

    public void setNextRound(Round nextRound) {
        this.nextRound = nextRound;
    }

    abstract boolean startRound(Candidate candidate);
}
