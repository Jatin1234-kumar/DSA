# 📝 Partition a Linked List around a given value (GeeksforGeeks)

🔗 [Problem Link](https://www.geeksforgeeks.org/problems/partition-a-linked-list-around-a-given-value/1)

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-orange) ![Language](https://img.shields.io/badge/Language-Java-blue)

### 💡 Tags
Linked List

### 🚀 Performance
- **Runtime:** Successfully Evaluated
- **Memory:** N/A

---

### 📜 Problem Description

Given the head of a linked list and an integer  **x** , rearrange the list such that:

- All nodes with values  **less**  than x appear  **first** ,

- Followed by nodes with values  **equal**  to x,

- Followed by nodes with values  **greater**  than x.

The relative order of nodes within each partition must remain unchanged, and the rearrangement should be performed  **in-place** .

 
 **Examples:** 

```
Input: head: 1->4->2->10, x = 3
 
Output: 1->2->4->10

Explanation: Nodes with value less than 3 come first, then equal to 3 and then greater than 3.
```

```
Input: head: 1->4->3->2->5->2->3, x = 3
 
Output: 1->2->2->3->3->4->5
 
Explanation: Nodes with a value less than 3 come first, then equal to 3 and then greater than 3.

```

 **Constraints:** 
1 ≤ size of linked list ≤ 105
1 ≤ data of node ≤ 105
1 ≤ x ≤ 105