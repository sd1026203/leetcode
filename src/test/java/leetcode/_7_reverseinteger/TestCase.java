package leetcode._7_reverseinteger;

import org.junit.Test;

/**
 * Created by sd102 on 2016-04-20.
 */
public class TestCase {
    @Test
    public void test(){
        Solution solution = new Solution();
        int i = solution.reverse(-2147483647);
        System.out.println(i);
    }

}
