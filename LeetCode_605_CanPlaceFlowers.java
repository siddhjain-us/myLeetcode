class LeetCode_605_CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // // Map<Integer, Boolean> = new HashMap<>();
        // int p =0;
        // // for(int i = 0 ; i < flowerbed.length; i++){
        // //     if(i == 0 && i+1 < flowerbed.length){
        // //         if(flowerbed[i] == 1 && flowerbed[i+1] == 0){
        // //             p++;
        // //         }
        // //     }
        // //     if(i == flowerbed.length - 1 && i - 1 >= 0){
        // //         if(flowerbed[i] == 1 && flowerbed[i-1] == 0){
        // //             p++;
        // //         }
        // //     }
        // //     else if(flowerbed[i] == 1 && i-1 >= 0 && flowerbed[i-1] == 0 && i+1 < flowerbed.length && flowerbed[i+1] == 0){
        // //         p++;
        // //     }
        // //     if(p >= n){
        // //         return true;
        // //     }
        // // }
        // // return p>=n;
        // int greatest = 0;
        // int length = 0;
        // for(int i = 0 ; i < flowerbed.length ; i++){
        //     // if(flowerbed[i] == 0){
        //     //     p++;
        //     // }
        //     // else{
        //     //     greatest = p >= greatest ? p : greatest;
        //     //     p = 0;
        //     // }
        //     if(flowerbed[i] == 0){
        //         p++;
        //         length++;
        //     }
        //     else if(p > 2){
        //         greatest += p/2;
        //         length = 1;
        //         p = 0;
        //     }
        // }
        // // System.out.println(p);
        // // if(flowerbed[flowerbed.length - 1] == 1 && flowerbed[0] == 1){
        // //     return greatest > 2*n;
        // // }
        // return greatest >= n;
        int counter = 0;
        if(flowerbed.length == 1){
            if(flowerbed[0] == 0){
                ++counter;
                return counter >= n;
            }
        }
        for(int i = 0 ; i < flowerbed.length ; i++){
            if(flowerbed[i] == 0){
                if(i == 0 && i + 1 < flowerbed.length && flowerbed[i+1] == 0){
                    //At i = 0 , if i + 1 exists and there is no flower at i+1, increment counter;
                    flowerbed[i] = 1;
                    counter ++;
                }
                // else if(i == 0){
                //     counter ++;
                // }
                else if(i == flowerbed.length - 1 && i-1 >= 0 && flowerbed[i-1] == 0){
                    //At i = final position, if i-1 exists and there is no flower at final place, increment counter;
                    flowerbed[i] = 1;
                    counter ++;
                }

                else if(i + 1 < flowerbed.length && i - 1 >= 0 && flowerbed[i+1] == 0 && flowerbed[i-1] == 0){
                    flowerbed[i] = 1;
                    counter++;
                }
            }
        }
        return counter >= n;
    }
}