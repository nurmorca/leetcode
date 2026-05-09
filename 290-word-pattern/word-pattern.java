class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] array = s.split(" ");
        HashMap<Character, String> map1 = new HashMap<Character, String>();
        HashMap<String, Character> map2 = new HashMap<String, Character>();
        int i = 0;

        if(pattern.length() != array.length) {
            return false;
        }
       
       while(i < pattern.length()) {
        if (map2.get(array[i]) != null && !map2.get(array[i]).equals(pattern.charAt(i))) {
            return false;
        }
        map1.putIfAbsent(pattern.charAt(i), array[i]);
        map2.putIfAbsent(array[i], pattern.charAt(i));
          i++;
       }

       StringBuilder str = new StringBuilder();
       
       i = 0;
        while(i < pattern.length()) {
          str.append(map1.get(pattern.charAt(i)));
          str.append(" ");
          i++;
       }

       str.deleteCharAt(str.length() - 1);

       System.out.println(str);

       if (s.equals(str.toString())) {
        return true;
       }

       return false;
    }
}