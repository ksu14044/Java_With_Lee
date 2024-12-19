package chapter05;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class BaseballPlayer {

    private String name ;
    private double battingAverage;
    private int homeRuns;

    static int playerCount;


    BaseballPlayer (String name, double battingAverage, int homeRuns) {
        this.name = name;
        this.battingAverage = battingAverage;
        this.homeRuns = homeRuns;

        playerCount++;
    }
    void updatesStatus(double newBattingAverage, int newHomeRuns) {
        battingAverage = newBattingAverage;
        homeRuns = newHomeRuns;
    }
    public String evaluateHomeRun() {
        if (getHomeRuns()> 20) {
            return "홈런상 후보에 등록됩니다.";
        } else {
            return "홈런상 후보에 들어갈 수 없습니다.";
        }
    }


    static String evaluateHomeRun(int homeRunCount) {
        if (homeRunCount > 20) {
            return "홈런상 후보에 등록됩니다.";
        } else {
            return "홈런상 후보에 들어갈 수 없습니다.";
        }
    }
}
public class MethodPractice {
    public static void main(String[] args) {
        //인스턴스 생성
        BaseballPlayer player1 = new BaseballPlayer("김영경", 0.325, 16);
        BaseballPlayer player2 = new BaseballPlayer("배수빈", 0.425, 13);
        BaseballPlayer player3 = new BaseballPlayer("권민정", 0.125, 6);
        BaseballPlayer player4 = new BaseballPlayer("이민우", 0.225, 9);


        System.out.println("총 생성된 선수의 수 : " + BaseballPlayer.playerCount); // 4

        player1.updatesStatus(0.316, 18);
        System.out.println(player1.getBattingAverage());
        System.out.println(player1.getHomeRuns());


        System.out.println(BaseballPlayer.evaluateHomeRun(21));
        System.out.println(BaseballPlayer.evaluateHomeRun(19));

        System.out.println(player1.getName());

        player1.setHomeRuns(25);
        System.out.println(player1.evaluateHomeRun());
        System.out.println(player1.evaluateHomeRun());


    }

}
