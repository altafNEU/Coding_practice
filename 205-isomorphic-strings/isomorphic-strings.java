class Solution {
    public boolean isIsomorphic(String s, String t) {

        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        for(int i = 0; i< s.length(); i++){
            char key = s.charAt(i);
            char value = t.charAt(i);
            if(!map.containsKey(key)){
                map.put(key, value);
            }
            if(map.containsKey(key)){
                if(!map.get(key).equals(value))
                    return false;
               // else map.put(key, value);
            }
        }
        for(int i = 0; i< t.length(); i ++){
            char value = s.charAt(i);
            char key = t.charAt(i);
            if(!map2.containsKey(key)){
                map2.put(key, value);
            }
            if(map2.containsKey(key)){
                if(!map2.get(key).equals(value))
                    return false;
              //  else map.put(key, value);
            }
        }
        return true;
    }
}