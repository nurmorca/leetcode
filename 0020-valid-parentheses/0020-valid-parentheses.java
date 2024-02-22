import java.util.*;

class Solution {
    public boolean isValid(String s) {
        
        if(s.length() % 2 == 1){
            return false;
        }      
        
        int i = 0, temp;
        Stack<Character> stack = new Stack<Character>();
        
        do{
           if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
               stack.push(s.charAt(i));
           } else{
                try{
                    stack.peek();
                 } catch(Exception e) {
                   return false;
                 }
               temp = s.charAt(i) - stack.peek();
               if(Math.abs(temp) > 2 || temp == 0){
                   return false;
               } else 
               {
                stack.pop();
             }   
           }
            i++;
        }while(i < s.length());
        
        try{
            if(stack.peek() != null){
                return false;
            }
        } catch(EmptyStackException e){
            return true;
        }
        
        return true;
        }      
}