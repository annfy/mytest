package com.Linked;

import java.util.*;

public class Solution148 {

    public boolean isPalindrome(ListNode head) {
        List<Integer> listNodes=new ArrayList<Integer>();
        while(head!=null){
            listNodes.add(head.val);
            head=head.next;
        }
        int first=0;
        int last=listNodes.size()-1;
        for (int j = 0; j <listNodes.size()/2; j++) {
            if (!listNodes.get(first).equals(listNodes.get(last))){
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
}
