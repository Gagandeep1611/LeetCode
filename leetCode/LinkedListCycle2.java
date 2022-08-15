package leetCode;

import java.util.ArrayList;
import java.util.List;

public class LinkedListCycle2 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    List<ListNode> list = new ArrayList<>();

//    public ListNode detectCycle(ListNode head) {
//        if (head == null) {
//            return null;
//        } else {
//            while (head.next != null) {
//                if (list.contains(head)) {
//                    return head;
//                } else {
//                    list.add(head);
//                    head=head.next;
//                }
//            }
//        }
//        return null;
//    }
public ListNode detectCycle(ListNode head) {
    if (head == null) {
        return null;
    }else{
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                while(fast!=head){
                    head=head.next;
                }
                return head;
            }
        }
    }
    return null;
}
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }else{
            ListNode fast=head;
            ListNode slow=head;
            while(fast.next!=null && fast.next.next!=null){
                fast=fast.next.next;
                slow=slow.next;
                if(fast==slow){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedListCycle2 cycle = new LinkedListCycle2();
        ListNode list = new ListNode(3);
        list.next = new ListNode(2);
        list.next.next = new ListNode(0);
        list.next.next.next = new ListNode(-4);
//        list.next.next.next.next = list.next;
        System.out.println(cycle.detectCycle(list));
        System.out.println(cycle.hasCycle(list));
    }
}
