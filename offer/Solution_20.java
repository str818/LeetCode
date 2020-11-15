package com.str818.offer;

/**
 * 表示数值的字符串
 *
 * 标签：字符串、数学
 *
 * Code It Now：https://leetcode-cn.com/problems/biao-shi-shu-zhi-de-zi-fu-chuan-lcof/
 *
 * Note：https://str818.github.io/2019/07/08/sword-refers-to-offer-up.html#20-%E8%A1%A8%E7%A4%BA%E6%95%B0%E5%80%BC%E7%9A%84%E5%AD%97%E7%AC%A6%E4%B8%B2
 *
 * @author str818
 * @date 2020/4/7
 */
public class Solution_20 {

    // 解法一：正则表达式
    public boolean isNumber1(String s) {
        if (s == null || s.length() == 0) return false;
        return s.trim().matches("[+-]?([0-9]+(\\.[0-9]*)?|\\.[0-9]+)(e[+-]?[0-9]+)?");
    }

    // 解法二：循环判断
    public boolean isNumber2(String s) {
        if(s == null || s.length() == 0) return false;
        //标记是否遇到相应情况
        boolean numSeen = false;
        boolean dotSeen = false;
        boolean eSeen = false;
        char[] str = s.trim().toCharArray();
        for(int i = 0;i < str.length; i++) {
            if(str[i] >= '0' && str[i] <= '9'){
                numSeen = true;
            } else if(str[i] == '.'){
                //.之前不能出现.或者e
                if(dotSeen || eSeen){
                    return false;
                }
                dotSeen = true;
            } else if(str[i] == 'e' || str[i] == 'E') {
                //e之前不能出现e，必须出现数
                if(eSeen || !numSeen){
                    return false;
                }
                eSeen = true;
                numSeen = false;//重置numSeen，排除123e或者123e+的情况,确保e之后也出现数
            } else if(str[i] == '-' || str[i] == '+') {
                //+-出现在0位置或者e/E的后面第一个位置才是合法的
                if(i != 0 && str[i-1] != 'e' && str[i-1] != 'E'){
                    return false;
                }
            } else{//其他不合法字符
                return false;
            }
        }
        return numSeen;
    }
}
