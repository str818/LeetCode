package com.str818.offer;

/**
 * 打印从 1 到最大的 n 位数
 *
 * 标签：数学
 *
 * Code It Now：https://leetcode-cn.com/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/
 *
 * Note：https://str818.github.io/2019/07/08/sword-refers-to-offer-up.html#17-%E6%89%93%E5%8D%B0%E4%BB%8E-1-%E5%88%B0%E6%9C%80%E5%A4%A7%E7%9A%84-n-%E4%BD%8D%E6%95%B0
 *
 * @author str818
 * @date 2020/4/7
 */
public class Solution_17 {

    public void print1ToMaxOfNDigits(int n) {
        if (n <= 0)
            return;
        char[] number = new char[n];
        print1ToMaxOfNDigits(number, 0);
    }

    private void print1ToMaxOfNDigits(char[] number, int digit) {
        if (digit == number.length) {
            printNumber(number);
            return;
        }
        for (int i = 0; i < 10; i++) {
            number[digit] = (char) (i + '0');
            print1ToMaxOfNDigits(number, digit + 1);
        }
    }

    private void printNumber(char[] number) {
        int index = 0;
        while (index < number.length && number[index] == '0')
            index++;
        while (index < number.length)
            System.out.print(number[index++]);
        System.out.println();
    }

}
