package com.str818.offer;

/**
 * 把数字翻译成字符串
 *
 * 标签：动态规划、递归
 *
 * Code It Now：https://leetcode-cn.com/problems/ba-shu-zi-fan-yi-cheng-zi-fu-chuan-lcof/
 *
 * Note：https://str818.github.io/2019/07/09/sword-refers-to-offer-middle.html#46-%E6%8A%8A%E6%95%B0%E5%AD%97%E7%BF%BB%E8%AF%91%E6%88%90%E5%AD%97%E7%AC%A6%E4%B8%B2
 *
 * @author str818
 * @date 2020/4/17
 */
public class Solution_46 {

    public int translateNum(int num) {
        if (num <= 9) return 1;
        // xyzcba
        int ba = num % 100;
        if (ba <= 9 || ba >= 26) return translateNum(num / 10);
        else return translateNum(num / 10) + translateNum(num / 100);
    }

}


