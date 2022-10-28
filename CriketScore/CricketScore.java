package Cricket_Score;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CricketScore {
    public static void main(String[] args) {
        CricketScore cricketScore = new CricketScore();
        cricketScore.cricketScore();
    }

    private void cricketScore() {
        ScoreBoard scoreBoard = new ScoreBoard();
        MatchDetails matchDetails = new MatchDetails();
        Bowler bowler = new Bowler();
        SelectTeam selectTeam = new SelectTeam();
        boolean isTrue = true;
        try {
            while (isTrue) {
                System.out.println("=======================>> CRICKET SCORE <<=======================");
                System.out.println("1. SELECT TEAM");
                System.out.println("2. SCOREBOARD");
                System.out.println("3. EXIT");
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter the number:");
                int option = scan.nextInt();
                switch (option) {
                    case 1: {
                        selectTeam.selectDefaultTeam(matchDetails, bowler);
                        break;
                    }
                    case 2: {
                        scoreBoard.viewData(matchDetails, bowler);
                        break;
                    }
                    case 3: {
                        isTrue = false;
                    }
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter the number...");
            isTrue = false;
            cricketScore();
        }
    }
}
