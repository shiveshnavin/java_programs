package in.hoptec;

import java.util.ArrayList;
import java.util.List;

public class ClimbingLeaderBoard {

    // Start 7:45
    // https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem


    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here

        List<Integer> result  =new ArrayList<>();

        for(int j=0;j<player.size();j++){

            int curScore=player.get(j);
            if(curScore<ranked.get(ranked.size())){
                result.add(ranked.size()+1);
                continue;
            }
            for(int i=0;i<ranked.size()-1;i++){

                if(curScore < ranked.get(i) && curScore > ranked.get(i+1))
                {
                    result.add(i+1);
                    break;
                }
            }

        }

        return result;
    }

}
