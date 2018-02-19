
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        
        //Top ten players based on goals
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        //Top 25 players based on penalty amounts
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        //Statistics for Sidney Crosby
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        //Statistics for Philadelphia Flyers (PHI)
        NHLStatistics.teamStatistics("PHI");
        
        //Players in Anaheim Ducks (ANA) ordered by points
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
        
    }
}
