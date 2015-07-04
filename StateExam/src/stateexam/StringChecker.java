package stateexam;

import java.util.LinkedList;

public class StringChecker {
    public static boolean CheckBrackets(String word) {
        if(word == null || word.length() == 0)
            return true;
        
        CharStack stack = new CharStack(word.length());
        
        for(int i =0;i<word.length();i++) {
            if(word.charAt(i) == '(') {
                stack.push(word.charAt(i));
            }
            
            if(word.charAt(i) == ')') {
                if (stack.isEmpty())
                    return false;
                stack.pop();
            }
        }
        
        return stack.isEmpty();
    }
}
