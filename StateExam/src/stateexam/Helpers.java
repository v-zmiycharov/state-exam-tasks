package stateexam;

import java.util.LinkedList;

public class Helpers {
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
    
    public static int GetNumberOfEqualConsecutiveElements(LinkedList list) {
        int result = 0;
        if(list != null) {
            for (int i = 0;i<list.size() - 1;i++) {
                if(list.get(i) == list.get(i+1)) {
                    result++;
                    if(i == 0 || list.get(i-1) != list.get(i)) {
                        result++;
                    }
                }
            }
        }
        
        return result;
    }
}
