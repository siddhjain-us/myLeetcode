class LeetCode_11_ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int area = 0;
        // System.out.println("Initial Area: " + area);
        for(int i = 0 ; i < height.length ; i++){
            area = Math.max(area, (right - left) * Math.min(height[left], height[right]));
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return area;
    }
}

