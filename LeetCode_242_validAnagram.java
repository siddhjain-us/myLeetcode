import java.util.*;
class LeetCode_242_validAnagram {
    public boolean isAnagram(String s, String t) {
        int slength = s.length();
        int tlength = t.length();
        if(slength != tlength || slength == 0 || tlength == 0)
           return false;
        Map <Character, Integer> chars = new HashMap<>(); 
        for(int i = 0 ; i < s.length() ; i++){
            if(!chars.containsKey(s.charAt(i))){
                chars.put(s.charAt(i), 1);
                continue;
            }
            chars.put(s.charAt(i), chars.get(s.charAt(i)) + 1);
        }
        int occ;
        for(Character c : chars.keySet()){
            occ = 0;
            for(int i = 0 ; i < tlength ; i++){
                if(c == t.charAt(i)){
                    ++occ;
                }
            }
            if(!(occ == chars.get(c)))
                return false;
        }
        Map <Character, Integer> chars2 = new HashMap<>(); 
        for(int j = 0 ; j < t.length() ; j++){
            if(!chars2.containsKey(t.charAt(j))){
                chars2.put(t.charAt(j), 1);
                continue;
            }
            chars2.put(t.charAt(j), chars2.get(t.charAt(j)) + 1);
        }
        // if(!(chars.keySet().size() == chars2.keySet().size())){
        //     return false;
        // }
        for(Character c : chars.keySet()){
            if(!(chars.get(c).equals(chars2.get(c))))
                return false;
        }
        return true;
    }
}