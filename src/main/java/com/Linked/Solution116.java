package com.Linked;

import java.util.HashSet;
import java.util.Set;

public class Solution116 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> nodeSet=new HashSet<ListNode>();
        ListNode temp=headA;
        while (temp!=null){
            nodeSet.add(temp);
            temp=temp.next;
        }
        temp=headB;
        while (headB!=null){
            if (nodeSet.contains(headB)){
                return headB;
            }
            headB=headB.next;
        }
        return null;
    }


}