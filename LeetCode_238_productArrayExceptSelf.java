class LeetCode_238_productArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int [] ans = new int[nums.length];
        // for(int j = 0 ; j < ans.length ; j++){
        //     ans[j] = 1;
        // }
        // int i = 0;
        // while(i < nums.length){
        //     int behind = i - 1;
        //     while(behind >= 0){
        //         ans[i] *= nums[behind--];
        //     }
        //     int front = i + 1;
        //     while(front < nums.length){
        //         ans[i] *= nums[front++];
        //     }
        //     ++i;
        // }
        // return ans;
        int prod = 1;
        int zeroes = 0;
        for(int k = 0 ; k < nums.length ; k++){
            if(nums[k] == 0){
                zeroes += 1;
            }
        }
        if(zeroes == 1){
            int index = 0;
            for(int i = 0 ; i < nums.length ; i++){
                if(nums[i] != 0){
                    prod *= nums[i];
                }
                if(nums[i] == 0){
                    index = i;
                }
        }

            for(int j = 0 ; j < nums.length ; j++){
                if(j == index){
                    ans[j] = prod;
                }
        }
        return ans;
        }

        if(zeroes >= 2){
            return new int[nums.length];
        }
        
        
        
        for(int i = 0 ; i < nums.length ; i++){
            prod *= nums[i];
        }

        for(int j = 0 ; j < nums.length ; j++){
            ans[j] = prod/nums[j];
        }

        return ans;

    }
}