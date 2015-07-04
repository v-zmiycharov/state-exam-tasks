/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stateexam;

import java.util.LinkedList;
import sun.security.util.Debug;

public class StateExam {

    public static void main(String[] args) {
        // System.out.println("(proba)(123(asd)))" + " : " + Helpers.CheckBrackets("(proba)(123(asd)))"));
        // System.out.println("(i tova(e nova proba) i o6te 1 tuk (asd123))" + " : " + Helpers.CheckBrackets("(i tova(e nova proba) i o6te 1 tuk (asd123))"));
        
        LinkedList list = new LinkedList();
        list.add(6);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(5);
        list.add(8);
        list.add(8);
        System.out.println(Helpers.GetNumberOfEqualConsecutiveElements(list));
    }
    
}
