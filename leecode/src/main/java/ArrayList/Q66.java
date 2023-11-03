package ArrayList;

import java.util.Arrays;

/**
 * @className: Q66
 * @author: wx
 * @date: 2023/11/3 10:05
 **/

public class Q66 {
    public static void main(String[] args) {
        int[] digits = new int[]{9,8,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    // 取出
    public static int[] plusOne(int[] digits) {
        // 首尾都为9时
        if (digits[0] == 9 && digits[digits.length - 1] == 9) {
            int count = 0;
            int[] newArrays = new int[digits.length + 1];
            for (int i = 0; i < digits.length; i++) {
                if (digits[digits.length - i - 1] < 9) {
                    digits[digits.length - i - 1] = digits[digits.length - i - 1] + 1;
                    newArrays[newArrays.length - i - 1] = digits[digits.length - i - 1];
                    break;
                } else {
                    digits[digits.length - i -1] = 0;
                    newArrays[newArrays.length - i - 1] = 0;
                    count++;
                    if (count == digits.length) {
                        newArrays[0] = 1;
                        return newArrays;
                    }
                }
            }
            return digits;
        }
        // 尾位为9的时候需要进位
        if (digits[0] < 9 && digits[digits.length - 1] == 9) {
            for (int i = 0; i < digits.length; i++) {
                if (digits[digits.length - i - 1] < 9) {
                    digits[digits.length - i - 1] = digits[digits.length - i - 1] + 1;
                    break;
                } else {
                    digits[digits.length - i - 1] = 0;
                }
            }
            return digits;
        }
        digits[digits.length - 1] = digits[digits.length - 1] + 1;
        return digits;
    }
}
