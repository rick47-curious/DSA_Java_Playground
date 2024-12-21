# Java Collection Framework Fundamentals

![image](https://d2jdgazzki9vjm.cloudfront.net/images/java-collection-hierarchy.png)

## List Interface
> The list stores the elements in insertion order. The list is implemented by following classes in Java -
1. ArrayList
2. LinkedList
3. Vector
4. Stack

### Generally we have couple of operations to perform through List - 

1. It has **add()** method to add elements to the end of the list or at any position with provided index

   Ex - add(1) - add element 1 at the end of the list

   add (1,3) - add element 3 at index 1

2. It has the **set()** method to update the element at a given index

   Ex - set(1,5) - setting the element at index 1 with data 5

3. It has the **remove()** method to remove a element from the list

   Ex- remove(1) - removes the element from the list based on the index

    remove("Geeks")  - simply remove the element from the list or the first occurence of the element

4. It has the **get()** method to retreive a element by its index from the list

    Ex - get(1) - gets the element at the 1st index of the list

5. It has the **indexOf()** and **lastIndexOf()** methods to find/search the the element based on index.

    indexOf() - Gets the first occurence index of the element or -1 if not found

    lastIndexOf() - Gets the last occurence index of the element or -1 if not found

6. It has the **contains()** method to check whether the list contains the element or not. It returns true or false

LinkedList can be better suited for addition and removal of elements for its node based structure in contrast to array with its complex computation logics.
Node -> data with a address pointer.

Stack extends the Vector class. It follows a LIFO principle for data insertion and removal logic. 
