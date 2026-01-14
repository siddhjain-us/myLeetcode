class LeetCode_1071_gcdOfStrings {
    public String gcdOfStrings(String str1, String str2) {
    // New attempt:
    String sb = "";
        StringBuffer checker = new StringBuffer();
        if(str1.length() >= str2.length()) {
            for(int i = 0 ; i < str2.length() ; i++) {
                checker.append(str2.charAt(i));
                if(helper(str1, checker.toString()) && helper(str2, checker.toString())) {
                    sb = checker.toString();
                }
                // System.out.printf("\n\n\nChecker : %s, StringBuffer : %s, \nDoes checker divide string 1: %b, \nDoes checker divide string 2: %b", checker.toString(), sb.toString(), helper(str1, checker.toString()), helper(str2, checker.toString()));
            }
        }
        else {
            for(int i = 0 ; i < str1.length() ; i++) {
                checker.append(str1.charAt(i));
                if(helper(str1, checker.toString()) && helper(str2, checker.toString())) {
                    sb = checker.toString();
                }
                // System.out.printf("\n\n\nChecker : %s, StringBuffer : %s, \nDoes checker divide string 1: %b, \nDoes checker divide string 2: %b", checker.toString(), sb.toString(), helper(str1, checker.toString()), helper(str2, checker.toString()));
            }
        }
        return sb;
    }

    public boolean helper(String str1, String str2) {
        StringBuffer sb = new StringBuffer();
        int reps = 0;
        reps = str1.length()/str2.length();
        for(int i = 0 ; i < reps ; i++) {
            sb.append(str2);
        }
        if(sb.toString().equals(str1)) {
            return true;
        }
        return false;
    }
}
