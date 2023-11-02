package ArrayList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @className: Test
 * @author: wx
 * @date: 2023/10/13 15:13
 **/
public class Q1 {

    public static void main(String[] args) {
        int[] ints1 = new int[]{3,3};
        int[] ints = easyTwoSum(ints1, 6);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] ints = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int b = nums[j];
                if ((a + b) == target){
                    ints[0] = i;
                    ints[1] = j;
                }
            }
        }
        return ints;
    }

    // 可以假设每个输入只有一种产出
    // 在第一次循环的时候 取出所有数并放在map里 利用map做相减判断
    public static int[] easyTwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ints = new int[2];
        for (int i = 0; i < nums.length; i++) {
            // 存储分值和下标
            int result = target - nums[i];
            if (map.containsKey(result)){
                // 存入当前下标
                ints[0] = i;
                // 取出下标存入
                ints[1] = map.get(result);
            }
            map.put(nums[i],i);
        }
        return ints;
    }


}
