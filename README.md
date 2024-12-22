# Java Collection Framework Fundamentals

![image](https://d2jdgazzki9vjm.cloudfront.net/images/java-collection-hierarchy.png)

## List Interface
> The list stores the elements in insertion order. List allows duplicates and null values. The list is implemented by following classes in Java -
1. ArrayList
2. LinkedList
3. Vector
4. Stack

LinkedList can be better suited for addition and removal of elements for its node based structure in contrast to array with its complex computation logics.
Node -> data with a address pointer.

Stack extends the Vector class. It follows a LIFO principle for data insertion and removal logic.Both stack and vector are synchronized or thread-safe.

| Feature              | ArrayList      | LinkedList         | Vector          | Stack           |
|-----------------------|----------------|--------------------|-----------------|-----------------|
| **Data Structure**   | Dynamic Array  | Doubly Linked List | Dynamic Array   | Dynamic Array   |
| **Access Time**       | O(1) (fast)    | O(n) (slow)        | O(1) (fast)     | O(1) (fast)     |
| **Insertion/Deletion**| O(n) (slow)    | O(1) (fast)        | O(n) (slow)     | O(n) (slow)     |
| **Thread-Safe**       | No             | No                 | Yes             | Yes             |
| **Best Use Case**     | Random Access  | Frequent Inserts/Deletes | Thread-safe List | LIFO Scenarios |
| **Synchronized?**     | No             | No                 | Yes             | Yes             |

## Queue Interface
> The elements stored in the queue follows the FIFO principle. Null is not allowed in Queue, duplicates allowed. Queue is implemented with below classes - 
1. LinkedList
2. ArrayDeque - Double ended queue
3. PriorityQueue
4. PriorityBlockingQueue

| Feature              | LinkedList         | ArrayDeque        | PriorityQueue    | PriorityBlockingQueue |
|----------------------|--------------------|-------------------|------------------|-----------------------|
| **Data Structure**   | Doubly Linked List | Resizable Array   | Heap             | Heap                  |
| **Access Time**      | O(1) (fast)        | O(1) (fast)       | O(log n) (fast)  | O(log n) (fast)       |
| **Insertion/Deletion**| O(1) (fast)       | O(1) (fast)       | O(log n) (fast)  | O(log n) (fast)       |
| **Thread-Safe**      | No                 | No                | No               | Yes                   |
| **Best Use Case**    | FIFO Scenarios     | Double-ended Queue| Priority Queue   | Thread-safe Priority Queue |
| **Synchronized?**    | No                 | No                | No               | Yes                   |

## Set Interface
> Set can contain unordered list of elements with no duplicates but allowing only a single null value. Set is implemented using the below classes -
1. HashSet
2. LinkedHashSet
3. TreeSet implements SortedSet interface

LinkedHashSet follows the insertion order. Hashset doesn't follow the insertion order. Treeset however follows an ascending order.

| Feature              | HashSet           | LinkedHashSet     | TreeSet          |
|----------------------|-------------------|-------------------|------------------|
| **Data Structure**   | Hash Table        | Hash Table + Linked List | Red-Black Tree  |
| **Access Time**      | O(1) (fast)       | O(1) (fast)       | O(log n) (fast)  |
| **Insertion/Deletion**| O(1) (fast)      | O(1) (fast)       | O(log n) (fast)  |
| **Thread-Safe**      | No                | No                | No               |
| **Order**            | Unordered         | Insertion Order   | Sorted (Ascending)|
| **Null Values**      | One Null Allowed  | One Null Allowed  | No Null Allowed  |
| **Best Use Case**    | Unique Elements   | Unique Elements with Order | Sorted Unique Elements |
| **Synchronized?**    | No                | No                | No               |

## Map Interface

> MapInterface is not part of collection interface. It does not allow duplicate keys but values can duplicate. It can allow one null key with multiple null values.TreeMap however does not allow null values.

1. HashMap
2. LinkedHashMap
3. TreeMap implements SortedMap interface

TreeMap is sorted in natural order of the keys

| Feature              | HashMap           | LinkedHashMap     | TreeMap          |
|----------------------|-------------------|-------------------|------------------|
| **Data Structure**   | Hash Table        | Hash Table + Linked List | Red-Black Tree  |
| **Access Time**      | O(1) (fast)       | O(1) (fast)       | O(log n) (fast)  |
| **Insertion/Deletion**| O(1) (fast)      | O(1) (fast)       | O(log n) (fast)  |
| **Thread-Safe**      | No                | No                | No               |
| **Order**            | Unordered         | Insertion Order   | Sorted (Ascending)|
| **Null Keys**        | One Null Allowed  | One Null Allowed  | No Null Allowed  |
| **Null Values**      | Multiple Allowed  | Multiple Allowed  | No Null Allowed  |
| **Best Use Case**    | Key-Value Pairs   | Key-Value Pairs with Order | Sorted Key-Value Pairs |
| **Synchronized?**    | No                | No                | No               |

