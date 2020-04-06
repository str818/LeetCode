package com.str818.offer;

/**
 * 矩形覆盖
 *
 * 标签：递归
 *
 * Code It Now：https://www.nowcoder.com/practice/72a5a919508a4251859fb2cfb987a0e6?tpId=13&tqId=11163&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 *
 * Note：https://str818.github.io/2019/07/08/sword-refers-to-offer-up.html#102-%E7%9F%A9%E5%BD%A2%E8%A6%86%E7%9B%96
 *
 * @author str818
 * @date 2020/4/6
 */
public class Solution_10_2 {

    public int RectCover(int target) {
        if (target <= 2) return target;
        int a = 1, b = 2;
        for (int i = 3; i <= target; i++) {
            int sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

}
