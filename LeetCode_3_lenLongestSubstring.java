class LeetCode_3_lenLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        // int maxLength = 0;
        // int length = 0;
        // Set <Character> characters = new HashSet<>();

        // for(int i = 0 ; i < s.length() ; i++){
        //     System.out.printf("\n%d %d %d", i, length, maxLength);

        //     if(characters.contains(s.charAt(i))) {
        //         maxLength = characters.size() >= maxLength ? characters.size() : maxLength;
        //         // length = 1;
        //         characters = new HashSet<>();
        //         characters.add(s.charAt(i));
        //     } else {
        //         characters.add(s.charAt(i));
        //         // length++;
        //         // maxLength = length >= maxLength ? length : maxLength;
        //     }

        //     System.out.printf("\n%d %d %d", i, length, maxLength);
        // }

        // maxLength = characters.size() >= maxLength ? characters.size() : maxLength;

        StringBuilder sb = new StringBuilder();
        // for(int i = 0 ; i < s.length(); i++){
        //     if(sb.indexOf("" + s.charAt(i)) != -1){
        //         if(sb.indexOf("" + s.charAt(i)) == sb.length() - 1){
        //             sb = new StringBuilder().append(s.charAt(i));
        //             continue;
        //         }
        //         else{
        //         sb.deleteCharAt(sb.indexOf("" + s.charAt(i)));
        //         sb.append(s.charAt(i));
        //         }
        //     }
        //     else{
        //         sb.append(s.charAt(i));
        //     }
        // }
        int length = 0; 
        for(int i = 0 ; i < s.length(); i++){
            if(sb.indexOf("" + s.charAt(i)) != -1){
                if(sb.indexOf("" + s.charAt(i)) != 0){
                    sb.append(s.charAt(i));
                    String g = sb.substring(sb.indexOf("" + s.charAt(i)) + 1);
                    sb = new StringBuilder().append(g);
                    length = length >= sb.length() ? length : sb.length();
                    // System.out.printf("\ni: %d SB: %s Max Length: %d" ,i , sb.toString(), length);
                    continue;
                }
                else{
                    sb.deleteCharAt(sb.indexOf("" + s.charAt(i)));
                    sb.append(s.charAt(i));
                    length = length >= sb.length() ? length : sb.length();
                }
            }
            else{
                sb.append(s.charAt(i));
                length = length >= sb.length() ? length : sb.length();
            }
            // System.out.printf("\ni: %d SB: %s Max Length: %d" ,i , sb.toString(), length);
        }
        
        return length;
    }
}
