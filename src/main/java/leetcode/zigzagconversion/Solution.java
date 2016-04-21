package leetcode.zigzagconversion;

/**
 * Created by sd102 on 2016-04-21.
 */
public class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        String[][] strings = new String[numRows][s.length()];
        Integer index = 0;
        Boolean daoxu = false;
        int rowIndex = 0;
        for(int col = 0 ; col < s.length();){
            if(index == s.length()){
                break;
            }
            if(!daoxu) {
                for(int row = rowIndex; row < numRows; row++){
                    if (index < s.length()) {
                        strings[row][col] = String.valueOf(s.charAt(index));
                        index++;
                        if (row == numRows - 1) {
                            daoxu = true;
                            col++;
                        }
                    }else{
                        break;
                    }
                }
            }else{
                for(int row = numRows -2; row >=0; row--){
                    if (index < s.length()) {
                        strings[row][col] = String.valueOf(s.charAt(index));
                        col++;
                        index++;
                        if (row == 0) {
                            daoxu = false;
                            col--;
                            rowIndex = 1;
                        }
                    }else {
                        break;
                    }
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int row = 0; row < numRows; row++){
            String[] ss = strings[row];
            for(int i = 0 ; i <ss.length ; i ++){
                if(ss[i] != null){
                    stringBuilder.append(ss[i]);
                }
            }
        }
        return stringBuilder.toString();
    }
}
