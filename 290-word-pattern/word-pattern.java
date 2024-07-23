class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");

        if(pattern.length() != str.length)
            return false;
        
        HashMap<Character, String>pmap = new HashMap<>();
        HashMap<String, Character>smap = new HashMap<>();
        
        for(int i=0; i<pattern.length(); i++){

           char pchar = pattern.charAt(i);
           String schar = str[i];

           if(pmap.containsKey(pchar)){
               if(!schar.equals(pmap.get(pchar)))
                return false;
              
           }else   pmap.put(pchar,schar);
            
            if(smap.containsKey(schar)){
                if(smap.get(schar) != pchar)
                    return false;
            }else 
                smap.put(schar,pchar);
        }

        return true;
    }
}