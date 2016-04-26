package leetcode._7_reverseinteger;

/**
 * Created by sd102 on 2016-04-22.
 */
public class Solution_2 {
    public int reverse(int x) {
        if(x==Integer.MIN_VALUE){
            return 0;
        }
        int num_remain = x;
        int ret = 0;
        while(num_remain != 0){
            int digit = num_remain % 10;
            if(ret != 0) {
                if (((Integer.MAX_VALUE - digit) / ret < 10 && ret > 0)) {
                    return 0;
                }
                if ((-1*((Integer.MIN_VALUE - digit) / ret) > -10 && ret < 0)) {
                    return 0;
                }
            }
            ret = ret * 10 + digit;
            num_remain = num_remain / 10;
        }
        return ret;
    }
}