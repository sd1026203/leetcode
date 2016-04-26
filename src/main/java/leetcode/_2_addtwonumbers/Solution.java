package leetcode._2_addtwonumbers;

/**
 * Created by sd102 on 2016-04-20.
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val = l1.val+l2.val;
        int tmp = 0;
        if(val >= 10){
            val = val - 10;
            tmp = 1;
        }
        ListNode listNode = new ListNode(val);
        ListNode l1n = l1.next;
        ListNode l2n = l2.next;
        if(l1n == null && l2n != null){
            l2n.val = l2n.val+tmp;
            l1n = new ListNode(0);
            listNode.next = addTwoNumbers(l1n,l2n);
        }else if(l1n != null && l2n == null){
            l1n.val = l1n.val+tmp;
            l2n = new ListNode(0);
            listNode.next = addTwoNumbers(l1n,l2n);
        }else if(l1n != null){
            l1n.val = l1n.val+tmp;
            listNode.next = addTwoNumbers(l1n,l2n);
        }else{
            if(tmp == 1){
                listNode.next = new ListNode(1);
            }
        }
        return listNode;
    }
}
