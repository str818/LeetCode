# 索引

- [算法复杂度基础](https://str818.github.io/2019/02/16/algorithm_complexity_basis.html)
- [排序算法](#排序算法)
- [剑指Offer](#剑指Offer)


## 排序算法

| NO.  | Title                      |  Description           			                   | Solution 								| Note        		|
| :---:| :------------------------: | :-------------------------------------------------:  | :-------------------------------------:| :--------------:  |
| 1    | 选择排序                    | 将最小的数交换到待排序序列的最前面                          | [Java][SortS01]                        | [Note][SortN01]	|
| 2    | 冒泡排序                    | 每轮冒泡（循环）把最小/大的数放在最后                       | [Java][SortS02]                        | [Note][SortN02]	|
| 3    | 插入排序                    | 维护一个有序列，不停把新元素插入其中                        | [Java][SortS03]                        | [Note][SortN03]	|
| 4    | 希尔排序                    | 通过粗粒度的插入排序改善数列的有序程序，逐步细化，直到间隔为 1  | [Java][SortS04]                        | [Note][SortN04]	|
| 5    | 归并排序                    | 先拆分，后按顺序合并                                     | [Java][SortS05]                        | [Note][SortN05]	|
| 6    | 快速排序                    | 选择一个基准数，使得基准数左边小右面大，左右再次迭代           | [Java][SortS06]                        | [Note][SortN06]	|
| 7    | 堆排序                      | 通过建立最大/小堆 + 下沉元素找到最值                       | [Java][SortS07]                        | [Note][SortN07]	|
| 8    | 计数排序                    | 开辟额外空间，统计每个元素的数量                           | [Java][SortS08]                        | [Note][SortN08]	|
| 9    | 桶排序                      | 划分多个范围相同的区间，每个自区间自排序，最后合并            | [Java][SortS09]                        | [Note][SortN09]	|
| 10   | 基数排序                    | 从最低位向最高位依次排序                                 | [Java][SortS10]                        | [Note][SortN10]	|

[SortS01]: https://github.com/str818/LeetCode/blob/master/src/com/str818/sort/SelectionSort.java
[SortN01]: https://str818.github.io/2019/03/25/algorithm-sorting.html#%E4%B8%80%E9%80%89%E6%8B%A9%E6%8E%92%E5%BA%8F

[SortS02]: https://github.com/str818/LeetCode/blob/master/src/com/str818/sort/BubbleSort.java
[SortN02]: https://str818.github.io/2019/03/25/algorithm-sorting.html#%E4%BA%8C%E5%86%92%E6%B3%A1%E6%8E%92%E5%BA%8F

[SortS03]: https://github.com/str818/LeetCode/blob/master/src/com/str818/sort/InsertionSort.java
[SortN03]: https://str818.github.io/2019/03/25/algorithm-sorting.html#%E4%B8%89%E6%8F%92%E5%85%A5%E6%8E%92%E5%BA%8F

[SortS04]: https://github.com/str818/LeetCode/blob/master/src/com/str818/sort/ShellSort.java
[SortN04]: https://str818.github.io/2019/03/25/algorithm-sorting.html#%E5%9B%9B%E5%B8%8C%E5%B0%94%E6%8E%92%E5%BA%8F

[SortS05]: https://github.com/str818/LeetCode/blob/master/src/com/str818/sort/MergeSort.java
[SortN05]: https://str818.github.io/2019/03/25/algorithm-sorting.html#%E4%BA%94%E5%BD%92%E5%B9%B6%E6%8E%92%E5%BA%8F

[SortS06]: https://github.com/str818/LeetCode/blob/master/src/com/str818/sort/QuickSort.java
[SortN06]: https://str818.github.io/2019/03/25/algorithm-sorting.html#%E5%85%AD%E5%BF%AB%E9%80%9F%E6%8E%92%E5%BA%8F

[SortS07]: https://github.com/str818/LeetCode/blob/master/src/com/str818/sort/HeapSort.java
[SortN07]: https://str818.github.io/2019/03/25/algorithm-sorting.html#%E5%85%AD%E5%BF%AB%E9%80%9F%E6%8E%92%E5%BA%8F

[SortS08]: https://github.com/str818/LeetCode/blob/master/src/com/str818/sort/CountingSort.java
[SortN08]: https://str818.github.io/2019/03/25/algorithm-sorting.html#%E5%85%AB%E8%AE%A1%E6%95%B0%E6%8E%92%E5%BA%8F

[SortS09]: https://github.com/str818/LeetCode/blob/master/src/com/str818/sort/BucketSort.java
[SortN09]: https://str818.github.io/2019/03/25/algorithm-sorting.html#%E4%B9%9D%E6%A1%B6%E6%8E%92%E5%BA%8F

[SortS10]: https://github.com/str818/LeetCode/blob/master/src/com/str818/sort/RadixSort.java
[SortN10]: https://str818.github.io/2019/03/25/algorithm-sorting.html#%E5%8D%81%E5%9F%BA%E6%95%B0%E6%8E%92%E5%BA%8F

## 剑指Offer

| NO.  | Title                      |  Tags           			   |  Difficult           | Solution 				| Note        	     | Code It Now!!      |
| :---:| :------------------------: | :--------------------------: | :----------------:   | :---------------------: | :----------------: | :----------------: |
| 3    | 数组中重复的数字              | 数组、哈希表                   |  简单                 | [Java][OfferS03]        | [Note][OfferN03]   | [GO!][OfferC03]    |
| 4    | 二维数组中的查找              | 数组、双指针                   |  简单                 | [Java][OfferS04]        | [Note][OfferN04]   | [GO!][OfferC04]    |
| 5    | 替换空格                     | 字符串                        |  简单                 | [Java][OfferS05]        | [Note][OfferN05]   | [GO!][OfferC05]    |
| 6    | 从尾到头打印链表              | 链表                          |  简单                 | [Java][OfferS06]        | [Note][OfferN06]   | [GO!][OfferC06]    |
| 7    | 重建二叉树                   | 树、递归                      |  中等                 | [Java][OfferS07]        | [Note][OfferN07]   | [GO!][OfferC07]    |
| 8    | 二叉树的下一个结点            | 树                            |  简单                 | [Java][OfferS08]        | [Note][OfferN08]   | [GO!][OfferC08]    |
| 9    | 用两个栈实现队列              | 栈                           |  简单                 | [Java][OfferS09]        | [Note][OfferN09]   | [GO!][OfferC09]    |
| 10.1 | 斐波那契数列                 | 递归                          |  简单                 | [Java][OfferS10_1]      | [Note][OfferN10_1] | [GO!][OfferC10_1] |
| 10.2 | 矩形覆盖                    | 递归                          |  简单                 | [Java][OfferS10_2]      | [Note][OfferN10_2] | [GO!][OfferC10_2] |
| 10.3 | 跳台阶                      | 递归                          |  简单                 | [Java][OfferS10_3]      | [Note][OfferN10_3] | [GO!][OfferC10_3] |
| 10.4 | 变态跳台阶                   | 递归、动态规划                 |  简单                 | [Java][OfferS10_4]      | [Note][OfferN10_4] | [GO!][OfferC10_4] |
| 11   | 旋转数组的最小数字            | 二分                          |  简单                 | [Java][OfferS11]        | [Note][OfferN11]   | [GO!][OfferC11]    |
| 12   | 矩阵中的路径                 | 深度优先搜索                   |  中等                 | [Java][OfferS12]        | [Note][OfferN12]   | [GO!][OfferC12]    |
| 13   | 机器人的运动范围             | 深度优先搜索                    |  中等                 | [Java][OfferS13]        | [Note][OfferN13]   | [GO!][OfferC13]    |
| 14.1 | 剪绳子                      | 动态规划、数学                 |  中等                 | [Java][OfferS14_1]      | [Note][OfferN14_1] | [GO!][OfferC14_1] |

[OfferS03]: https://github.com/str818/LeetCode/blob/master/src/com/str818/offer/Solution_3.java
[OfferN03]: https://str818.github.io/2019/07/08/sword-refers-to-offer-up.html#3-%E6%95%B0%E7%BB%84%E4%B8%AD%E9%87%8D%E5%A4%8D%E7%9A%84%E6%95%B0%E5%AD%97
[OfferC03]: https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/

[OfferS04]: https://github.com/str818/LeetCode/blob/master/src/com/str818/offer/Solution_4.java
[OfferN04]: https://str818.github.io/2019/07/08/sword-refers-to-offer-up.html#4-%E4%BA%8C%E7%BB%B4%E6%95%B0%E7%BB%84%E4%B8%AD%E7%9A%84%E6%9F%A5%E6%89%BE
[OfferC04]: https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/

[OfferS05]: https://github.com/str818/LeetCode/blob/master/src/com/str818/offer/Solution_5.java
[OfferN05]: https://str818.github.io/2019/07/08/sword-refers-to-offer-up.html#5-%E6%9B%BF%E6%8D%A2%E7%A9%BA%E6%A0%BC
[OfferC05]: https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/

[OfferS06]: https://github.com/str818/LeetCode/blob/master/src/com/str818/offer/Solution_6.java
[OfferN06]: https://str818.github.io/2019/07/08/sword-refers-to-offer-up.html#6-%E4%BB%8E%E5%B0%BE%E5%88%B0%E5%A4%B4%E6%89%93%E5%8D%B0%E9%93%BE%E8%A1%A8
[OfferC06]: https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/

[OfferS07]: https://github.com/str818/LeetCode/blob/master/src/com/str818/offer/Solution_7.java
[OfferN07]: https://str818.github.io/2019/07/08/sword-refers-to-offer-up.html#7-%E9%87%8D%E5%BB%BA%E4%BA%8C%E5%8F%89%E6%A0%91
[OfferC07]: https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/

[OfferS08]: https://github.com/str818/LeetCode/blob/master/src/com/str818/offer/Solution_8.java
[OfferN08]: https://str818.github.io/2019/07/08/sword-refers-to-offer-up.html#8-%E4%BA%8C%E5%8F%89%E6%A0%91%E7%9A%84%E4%B8%8B%E4%B8%80%E4%B8%AA%E7%BB%93%E7%82%B9
[OfferC08]: https://www.nowcoder.com/practice/9023a0c988684a53960365b889ceaf5e?tpId=13&tqId=11210&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking

[OfferS09]: https://github.com/str818/LeetCode/blob/master/src/com/str818/offer/Solution_9.java
[OfferN09]: https://str818.github.io/2019/07/08/sword-refers-to-offer-up.html#9-%E7%94%A8%E4%B8%A4%E4%B8%AA%E6%A0%88%E5%AE%9E%E7%8E%B0%E9%98%9F%E5%88%97
[OfferC09]: https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/

[OfferS10_1]: https://github.com/str818/LeetCode/blob/master/src/com/str818/offer/Solution_10_1.java
[OfferN10_1]: https://str818.github.io/2019/07/08/sword-refers-to-offer-up.html#101-%E6%96%90%E6%B3%A2%E9%82%A3%E5%A5%91%E6%95%B0%E5%88%97
[OfferC10_1]: https://leetcode-cn.com/problems/fei-bo-na-qi-shu-lie-lcof/

[OfferS10_2]: https://github.com/str818/LeetCode/blob/master/src/com/str818/offer/Solution_10_2.java
[OfferN10_2]: https://str818.github.io/2019/07/08/sword-refers-to-offer-up.html#102-%E7%9F%A9%E5%BD%A2%E8%A6%86%E7%9B%96
[OfferC10_2]: https://www.nowcoder.com/practice/72a5a919508a4251859fb2cfb987a0e6?tpId=13&tqId=11163&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking

[OfferS10_3]: https://github.com/str818/LeetCode/blob/master/src/com/str818/offer/Solution_10_3.java
[OfferN10_3]: https://str818.github.io/2019/07/08/sword-refers-to-offer-up.html#103-%E8%B7%B3%E5%8F%B0%E9%98%B6
[OfferC10_3]: https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/

[OfferS10_4]: https://github.com/str818/LeetCode/blob/master/src/com/str818/offer/Solution_10_4.java
[OfferN10_4]: https://str818.github.io/2019/07/08/sword-refers-to-offer-up.html#104-%E5%8F%98%E6%80%81%E8%B7%B3%E5%8F%B0%E9%98%B6
[OfferC10_4]: https://www.nowcoder.com/questionTerminal/22243d016f6b47f2a6928b4313c85387

[OfferS11]: https://github.com/str818/LeetCode/blob/master/src/com/str818/offer/Solution_11.java
[OfferN11]: https://str818.github.io/2019/07/08/sword-refers-to-offer-up.html#11-%E6%97%8B%E8%BD%AC%E6%95%B0%E7%BB%84%E7%9A%84%E6%9C%80%E5%B0%8F%E6%95%B0%E5%AD%97
[OfferC11]: https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/

[OfferS12]: https://github.com/str818/LeetCode/blob/master/src/com/str818/offer/Solution_12.java
[OfferN12]: https://str818.github.io/2019/07/08/sword-refers-to-offer-up.html#12-%E7%9F%A9%E9%98%B5%E4%B8%AD%E7%9A%84%E8%B7%AF%E5%BE%84
[OfferC12]: https://leetcode-cn.com/problems/ju-zhen-zhong-de-lu-jing-lcof/

[OfferS13]: https://github.com/str818/LeetCode/blob/master/src/com/str818/offer/Solution_13.java
[OfferN13]: https://str818.github.io/2019/07/08/sword-refers-to-offer-up.html#13-%E6%9C%BA%E5%99%A8%E4%BA%BA%E7%9A%84%E8%BF%90%E5%8A%A8%E8%8C%83%E5%9B%B4
[OfferC13]: https://leetcode-cn.com/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof/

[OfferS14_1]: https://github.com/str818/LeetCode/blob/master/src/com/str818/offer/Solution_14_1.java
[OfferN14_1]: https://str818.github.io/2019/07/08/sword-refers-to-offer-up.html#14-%E5%89%AA%E7%BB%B3%E5%AD%90
[OfferC14_1]: https://leetcode-cn.com/problems/jian-sheng-zi-lcof/