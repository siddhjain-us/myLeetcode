import java.util.*;
class LeetCode_1431_kidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int greatest = candies[0];
        for(int i = 0 ; i < candies.length ; i++){
            if(candies[i] >= greatest){
                greatest = candies[i];
            }
        }
        for(int i = 0 ; i < candies.length ; i++){
            if(candies[i] + extraCandies >= greatest){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        
        
        return ans;
    }
}