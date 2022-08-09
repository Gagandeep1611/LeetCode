package leetCode;

import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedLists{
    public static void displayNodes(ListNode list){
        while(list!=null){
            System.out.println(list.val);
            list=list.next;
        }
    }
    public static ListNode createLinkedList(List<Integer> list){
        ListNode root = null, currNode = null;

        for (Integer x : list) {
            ListNode newNode =  new ListNode(x);

            if (currNode == null) {
                currNode = newNode;
                root = currNode;
            }else {
                currNode.next = newNode;
                currNode = currNode.next;
            }
        }
        return root;
    }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode newRoot = null, currNode = null;
        while(list1!=null && list2!=null){
            if(list1.val>= list2.val){
                if(currNode == null){
                    currNode = list2;
                    newRoot = currNode;
                }else {
                    currNode.next = list2;
                    currNode = currNode.next;
                }
                list2=list2.next;

            }else {
                if(currNode == null){
                    currNode = list1;
                    newRoot = currNode;
                }else {
                    currNode.next =  list1;
                    currNode = currNode.next;
                }
                list1=list1.next;
            }
        }
        while(list1!=null){

                if(currNode == null){
                    currNode = list1;
                    newRoot = currNode;
                }else {
                    currNode.next =  list1;
                    currNode = currNode.next;
                }
                list1=list1.next;

        }
        while(list2!=null){
                if(currNode == null){
                    currNode = list2;
                    newRoot = currNode;
                }else {
                    currNode.next = list2;
                    currNode = currNode.next;
                }
                list2=list2.next;
            }
        return newRoot;
    }

    public static void main(String[] args) {
        ListNode list1;
        list1 = createLinkedList(Arrays.asList(1, 2, 4));
        ListNode list2= createLinkedList(Arrays.asList(1,3,4,5,6,7,8));
        MergeTwoSortedLists ms=new MergeTwoSortedLists();
        ListNode list3=ms.mergeTwoLists(list1,list2);
        displayNodes(list3);

    }
}
