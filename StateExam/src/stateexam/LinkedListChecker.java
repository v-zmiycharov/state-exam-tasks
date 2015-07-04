package stateexam;

import java.util.LinkedList;

public class LinkedListChecker {
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
