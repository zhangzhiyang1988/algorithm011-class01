﻿Array-数组
•	最为基础的数据结构，后续很多高级数据结构会用到数组来做实现
•	数组定义时，硬件层面会维护一个内存控制器，达到随机访问数据O（1）的时间复杂度
•	查找速度很快，但相对应的插入和删除操作就比较慢了，是O(n)的时间复杂度
LinkedList-链表
•	链表由一个个的节点连接组成，每个节点包含Value和next指针
•	最开头的节点称为Head，最尾的节点为Tail。除了tail的的next指向null以外，其余节点都指向的下一个节点的next地址
•	链表的插入删除操作时间复杂度为O(1)
DoubleLinkedList-双向链表
•	链表增加了一个previous指针，可以快速查找头和尾的节点
•	对双向链表的插入更新操作时间复杂度为O(1)，查找还是O(n)
SkipList-跳表
•	只能针对元素有序的情况
•	对标的是平衡树和二分查找。且实现原理简单，容易实现
•	是对有序链表的添加索引操作
•	跳表查询任意数据的时间复杂度时O(logn)，空间复杂度是O(n)
Stack-栈
•	LIFO 特性
•	添加删除时间复杂度O(1)
Queue-队列
•	LILO FIFO
•	添加删除时间复杂度O(1)
Deque-双端队列
•	两端都可以进出的Queue
•	插入和删除时间复杂度为O(1)
PriorityQueue-优先队列
•	插入操作O(1)
•	取出操作O(logn)
•	底层的实现 heap bst treap
解题方法方法：
首先看能不能暴力求解，先用暴力求解的方式将代码写出来，成功运行；
再看其他的好的解题思路和代码，方法尽量写的短小有意义；
每个题至少写5遍以上，而且要不断的刻意联系。

