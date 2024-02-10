class Solution {
    public int lengthOfLastWord(String s) {
        int counter = 0;
        int i = 0;
                
        do{
            if(s.charAt((s.length() - 1 - i)) != ' '){
                counter++;
            }
            i++;
        } while((counter == 0 || s.charAt(s.length() - i) != ' ') && i < s.length()) ;
        
        return counter;
    }
}