class LeetCode_557_reverseWordsInAStringIII {
    public String reverseWords(String s) {
        String [] arr = s.split(" ");
        for(String str : arr){
            // System.out.println(str);
        }
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = reverseString(arr[i].toCharArray());
            // System.out.println(reverseString(arr[i].toCharArray()));
        }
        return String.join(" ", arr);
    }
    public String reverseString(char[] s) {
        for(int i = 0 ; i < s.length - i ; i++){
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
        return new String(s);
    }
}