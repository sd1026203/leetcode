package leetcode._7_reverseinteger;

import org.junit.Test;

/**
 * Created by sd102 on 2016-04-20.
 */
public class TestCase_2 {
    @Test
    public void test(){
        Solution_2 solution_2 = new Solution_2();
        int x = solution_2.reverse(-123);
        System.out.println(x);
    }

    @Test
    public void test1(){
        int i= -1034;
        System.out.println(i%10);
    }

}
