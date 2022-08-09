package leetCode;


import java.util.Arrays;

import static leetCode.MergeTwoSortedLists.createLinkedList;


public class RemoveDuplicatesLL {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        else {
            ListNode currNode, pointer;
            pointer = head;
            currNode = head;
            while (true) {
                if (currNode.val != pointer.val) {
                    if (currNode.next == null) {
                        pointer.next = currNode;
                        return head;
                    } else {
                        pointer.next = currNode;
                        pointer = currNode;
                        currNode = pointer.next;
                    }
                } else {
                    if (currNode.next == null) {
                        pointer.next = null;
                        return head;
                    } else {
                        currNode = currNode.next;
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        ListNode list;
        list=createLinkedList(Arrays.asList());
        RemoveDuplicatesLL duplicates=new RemoveDuplicatesLL();
        ListNode list2=duplicates.deleteDuplicates(list);
        MergeTwoSortedLists.displayNodes(list2);

    }
}
