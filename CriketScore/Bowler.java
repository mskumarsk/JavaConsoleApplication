package Cricket_Score;

import java.util.HashMap;

public class Bowler {
    private String bowlerName;
    private int over;
    private int run;
    private int wicker;
    private int balls;

    HashMap<String, Bowler> teamTwoBowler = new HashMap<>();
    HashMap<String, Bowler> teamOneBowler = new HashMap<>();

    public String getBowlerName() {
        return bowlerName;
    }

    public void setBowlerName(String bowlerName) {
        this.bowlerName = bowlerName;
    }

    public int getBalls() {
        return balls;
    }

    public void setBalls(int balls) {
        this.balls = this.balls + balls;
    }

    public int getOver() {
        return over;
    }

    public void setOver(int over) {
        this.over = this.over + over;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = this.run + run;
    }

    public int getWicker() {
        return wicker;
    }

    public void setWicker(int wicker) {
        this.wicker = this.wicker + wicker;
    }
}
