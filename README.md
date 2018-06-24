# algs4
this place is where i take notes from book "algs4"

# chapter01 基础
* 1.1 [下压（LIFO）栈（能够动态调整数组大小的实现）](https://github.com/ejunjsh/algs4/blob/master/src/main/java/edu/princeton/cs/algs4/ResizingArrayStack.java)
* 1.2 [下压堆栈（链表实现）](https://github.com/ejunjsh/algs4/blob/master/src/main/java/edu/princeton/cs/algs4/Stack.java)
* 1.3 [先进先出队列](https://github.com/ejunjsh/algs4/blob/master/src/main/java/edu/princeton/cs/algs4/Queue.java)
* 1.4 [背包](https://github.com/ejunjsh/algs4/blob/master/src/main/java/edu/princeton/cs/algs4/Bag.java)
* 1.5 union-find的实现
    * [quick-find算法](https://github.com/ejunjsh/algs4/blob/master/src/main/java/edu/princeton/cs/algs4/QuickFindUF.java)
    * [quick-union算法](https://github.com/ejunjsh/algs4/blob/master/src/main/java/edu/princeton/cs/algs4/QuickUnionUF.java)
    * [加权quick-union算法](https://github.com/ejunjsh/algs4/blob/master/src/main/java/edu/princeton/cs/algs4/WeightedQuickUnionUF.java)
    
  算法|构造函数|union()|find()
  ----|------|-------|-------
  quick-find算法|N|N|1
  quick-union算法|N|树的高度|树的高度
  加权quick-union算法|N|lgN|lgN



# chapter02 排序
* 2.1 [选择排序](https://github.com/ejunjsh/algs4/blob/master/src/main/java/edu/princeton/cs/algs4/Selection.java)
* 2.2 [插入排序](https://github.com/ejunjsh/algs4/blob/master/src/main/java/edu/princeton/cs/algs4/Insertion.java)
* 2.3 [希尔排序](https://github.com/ejunjsh/algs4/blob/master/src/main/java/edu/princeton/cs/algs4/Shell.java)
* 2.4 归并排序
    * [自顶向下](https://github.com/ejunjsh/algs4/blob/master/src/main/java/edu/princeton/cs/algs4/Merge.java)
    * [自底向上](https://github.com/ejunjsh/algs4/blob/master/src/main/java/edu/princeton/cs/algs4/MergeBU.java)
* 2.5 快速排序
    * [基础](https://github.com/ejunjsh/algs4/blob/master/src/main/java/edu/princeton/cs/algs4/Quick.java)
    * [三向切分](https://github.com/ejunjsh/algs4/blob/master/src/main/java/edu/princeton/cs/algs4/Quick3way.java)
* 2.6 优先队列
    * [基于堆的](https://github.com/ejunjsh/algs4/blob/master/src/main/java/edu/princeton/cs/algs4/MaxPQ.java)
    * [有索引并基于堆的](https://github.com/ejunjsh/algs4/blob/master/src/main/java/edu/princeton/cs/algs4/IndexMaxPQ.java)
* 2.7 [堆排序](https://github.com/ejunjsh/algs4/blob/master/src/main/java/edu/princeton/cs/algs4/Heap.java)

算法|是否稳定|是否为原地排序|时间复杂度|空间复杂度|备注
---|-------|------------|-------|--------|-----
选择排序|否|是|N^2|1|
插入排序|是|是|介于N和N^2之间|1|取决于输入元素度排列情况
希尔排序|否|是|NlogN? or N^6/5|1|
快速排序|否|是|NlogN|lgN|运行效率由概率提供保证
三向快速排序|否|是|介于N和NlogN之间|lgN|运行效率有概率保证，同时也取决于输入元素的分布情况
归并排序|是|否|NlogN|N|
堆排序|否|是|NlogN|1|


# chapter03 查找
* 3.1 [顺序查找（基于无序链表）](https://github.com/ejunjsh/algs4/blob/master/src/main/java/edu/princeton/cs/algs4/SequentialSearchST.java)
* 3.2 [二分查找（基于有序数组）](https://github.com/ejunjsh/algs4/blob/master/src/main/java/edu/princeton/cs/algs4/BinarySearchST.java)
* 3.3 [基于二叉查找树的符号表](https://github.com/ejunjsh/algs4/blob/master/src/main/java/edu/princeton/cs/algs4/BST.java)
* 3.4 [基于红黑树的符号表](https://github.com/ejunjsh/algs4/blob/master/src/main/java/edu/princeton/cs/algs4/RedBlackBST.java)
* 3.5 [基于拉链法的散列表](https://github.com/ejunjsh/algs4/blob/master/src/main/java/edu/princeton/cs/algs4/SeparateChainingHashST.java)
* 3.6 [基于线性探测的散列表](https://github.com/ejunjsh/algs4/blob/master/src/main/java/edu/princeton/cs/algs4/LinearProbingHashST.java)

# chapter04 图
* 4.1 [深度优先搜索(DFS)查找图中的路径](https://github.com/ejunjsh/algs4/blob/master/src/main/java/edu/princeton/cs/algs4/DepthFirstPaths.java)
* 4.2 [广度优先搜索(BFS)查找图中的路径](https://github.com/ejunjsh/algs4/blob/master/src/main/java/edu/princeton/cs/algs4/BreadthFirstPaths.java)