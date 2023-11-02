package ArrayList;

/**
 * @author wengxiang
 * @date 2023/11/2 22:06
 */


public class Q14 {
    public static void main(String[] args) {
//        String[] str = new String[]{"flower", "flow", "flight"};
        String[] str = new String[]{"dog", "racecar", "car"};
        System.out.println(longestCommonPrefixMy(str));
    }

    // 超时
    public static String longestCommonPrefixMy(String[] strs) {
        boolean flag = true;
        int index = 0;
        String[] string0 = strs[0].split("");
        String pre = string0[0];
        while (flag) {
            //  第一次循环取第一个字符
            // 下标为0
            for (int i = 1; i < strs.length; i++) {
                // 元素不包含就退出循环 第一次循环
                if (!strs[i].contains(pre)) {
                    flag = false;
                    break;
                }
                // 在最后一次循环的时候拼接下一个字符
                if (i == strs.length - 1) {
                    index++;
                    pre = pre + string0[index];
                }
            }
        }
        return pre.substring(0, pre.length() - 1);
    }

    // 通过的代码
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(strs[0]) != 0) {
                strs[0] = strs[0].substring(0, strs[0].length() - 1);
                if (strs[0].isEmpty()) {
                    return "";
                }
            }
        }
        return strs[0];
    }


}
