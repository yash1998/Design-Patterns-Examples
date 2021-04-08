package behavioural.strategy;

public class TeamLead implements Role {

    @Override
    public String getJob() {
        return "decide architecture";
    }
}
