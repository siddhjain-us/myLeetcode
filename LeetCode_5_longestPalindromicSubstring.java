class LeetCode_5_longestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String ans = "";
        for(int i = 0 ; i < s.length() ; i++){
            String len1 = helper(s, i, i);
            String len2 = helper(s, i, i+1);
            if(len1.length() >= len2.length() && ans.length() <= len1.length()){
                ans = len1;
            }
            else if(ans.length() <= len2.length()){
                ans = len2;
            }
        }
        return ans;
    }

    public String helper(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1, right);
    }
}