package ArrayList;

import java.util.Objects;

/**
 * @className: Q9
 * @author: wx
 * @date: 2023/11/2 11:45
 **/

public class Q9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1));
    }
    public static boolean isPalindromeMy(int x) {
        boolean flag = false;
        if (x < 0){
            return false;
        }
        String[] split = String.valueOf(x).split("");
        int length = split.length;
        if (length == 1){
            return true;
        }
        if (length == 2){
            return Objects.equals(split[0],split[1]);
        }
        for (int i = 0; i < length / 2; i++) {
            System.out.println("split[i]:" + split[i] + " " +  "split[length - i -1]:" + split[length - i -1]);
            flag = Objects.equals(split[i],split[length - i -1]);
            if (!flag){
                break;
            }
        }
        return flag;
    }

    public static boolean isPalindrome(int x) {
        String str= Integer.toString(x);
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
