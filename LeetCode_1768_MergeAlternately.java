class LeetCode_1768_MergeAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        if(word1.length() <= word2.length()){
            for(int i = 0 ; i < word1.length() ; i++){
                ans.append(word1.charAt(i));
                ans.append(word2.charAt(i));
            }
            ans.append(word2.substring(word1.length(), word2.length()));
            return ans.toString();
        }
        for(int i = 0 ; i < word2.length() ; i++){
                ans.append(word1.charAt(i));
                ans.append(word2.charAt(i));
            }
            ans.append(word1.substring(word2.length(), word1.length()));
            return ans.toString();
    }
}