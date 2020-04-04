# 索引


## [排序算法](https://str818.github.io/2019/03/25/algorithm-sorting.html)

| NO.  | Title                      |  Description           			                   | Solution 								| Note        		|
| :---:| :------------------------: | :-------------------------------------------------:  | :-------------------------------------:| :--------------:  |
| 1    | 选择排序                    | 将最小的数交换到待排序序列的最前面                         | [Java][SortS01]                        | [Note][SortN01]	|
| 2    | 冒泡排序                    | 每轮冒泡（循环）把最小/大的数放在最后                      | [Java][SortS02]                        | [Note][SortN02]	|
| 3    | 插入排序                    | 维护一个有序列，不停把新元素插入其中                       | [Java][SortS03]                        | [Note][SortN03]	|
| 4    | 希尔排序                    | 通过粗粒度的插入排序改善数列的有序程序，逐步细化，直到间隔为 1 | [Java][SortS04]                        | [Note][SortN04]	|
| 5    | 归并排序                    | 先拆分，后按顺序合并                                     | [Java][SortS05]                        | [Note][SortN05]	|
| 6    | 快速排序                    | 选择一个基准数，使得基准数左边小右面大，左右再次迭代          | [Java][SortS06]                        | [Note][SortN06]	|
| 7    | 堆排序                      | 通过建立最大/小堆 + 下沉元素找到最值                       | [Java][SortS07]                        | [Note][SortN07]	|



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