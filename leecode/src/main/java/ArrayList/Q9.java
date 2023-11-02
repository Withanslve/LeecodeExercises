package ArrayList;

import java.util.Arrays;

/**
 * @className: Q9
 * @author: wx
 * @date: 2023/11/2 11:45
 **/

public class Q9 {
    //    9. 回文数
//    提示
//    给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
//
//    回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
//
//    例如，121 是回文，而 123 不是。
//
//
//    示例 1：
//
//    输入：x = 121
//    输出：true
//    示例 2：
//
//    输入：x = -121
//    输出：false
//    解释：从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
//    示例 3：
//
//    输入：x = 10
//    输出：false
//    解释：从右向左读, 为 01 。因此它不是一个回文数。
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        String[] split = String.valueOf(x).split("");
        // 如果为奇数 取出奇数标志位作为分割线前与后的数字
        // 如果为偶数+
        return true;
    }
    public static void main(String[] args) {

    }
}
