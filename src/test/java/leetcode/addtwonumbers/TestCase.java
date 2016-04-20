package leetcode.addtwonumbers;

import org.junit.Test;

/**
 * Created by sd102 on 2016-04-20.
 */
public class TestCase {
    @Test
    public void test(){
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5);
        ListNode l11 = new ListNode(3);
        ListNode l21 = new ListNode(2);
        l1.next = l11;
        l2.next = l21;
        Solution solution = new Solution();
        ListNode listNode = solution.addTwoNumbers(l1,l2);
        System.out.println();
    }

}
