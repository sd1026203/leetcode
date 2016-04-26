package leetcode._7_reverseinteger;

/**
 * Created by sd102 on 2016-04-22.
 */
public class Solution {
    public int reverse(int x) {
        StringBuilder stringBuilder = new StringBuilder();
        if(x==Integer.MIN_VALUE){
            return 0;
        }
        if(x < 0){
            stringBuilder.append("-");
            x = Math.abs(x);
            System.out.println(x);
        }
        String xStr = String.valueOf(x);
        StringBuffer sb = new StringBuffer();
        sb.append(xStr);
        StringBuffer sb1 = sb.reverse();
        stringBuilder.append(sb1);
        Long tmpLong = Long.valueOf(stringBuilder.toString());
        if(tmpLong > Integer.MAX_VALUE || tmpLong < Integer.MIN_VALUE){
            return 0;
        }
        return tmpLong.intValue();
    }
}