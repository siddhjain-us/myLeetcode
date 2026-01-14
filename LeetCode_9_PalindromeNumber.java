class LeetCode_9_PalindromeNumber {
    public boolean isPalindrome(int x) {
        @SuppressWarnings("ReplaceStringBufferByString")
        StringBuilder sb = new StringBuilder().append(x);
        for(int i = 0 ; i < sb.length()/2 ; i++){
            if(!(sb.charAt(i) == sb.charAt(sb.length() - i - 1))){
                return false;
            }
        }
        return true;
    }
}