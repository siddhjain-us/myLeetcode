class LeetCode_121_bestTimeToBuyAndSell {
    public int maxProfit(int[] prices) {
        // Map<Integer, Integer> profits = new HashMap<>();
        int profit = 0;
        // int i = 0;
        // for(int i = 0 ; i < prices.length; i++){
        //     for(int j = i+1 ; j < prices.length ; j++){
        //         if(profit < prices[j] - prices[i]){
        //             profit = prices[j] - prices[i];
        //         }
        //     }
        // }


        // for(int j = 0 ; j < prices.length ; j++){
        //     if(i < prices.length && profit < prices[i] - prices[j]){
        //         profit = prices[i] - prices[j];
        //         i = j+1;
        //         continue;
        //     }
        //     ++i;
        // }

        int smaller, prev, diff;
        diff = 0;
        smaller = prices[0];
        prev = prices[0];
        for(int i : prices){
            if(i < smaller){
                prev = smaller;
                smaller = i;
            }
            diff = Math.max(diff, i - smaller);
        }
        return diff;
    }
}