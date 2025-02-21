# 🚀 Data Structures and Algorithms Journey

<div align="center">
  
[![GitHub last commit](https://img.shields.io/github/last-commit/yourusername/repo-name)](https://github.com/prathameshmane019/DSA/commits/main)
[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg)](https://github.com/prathameshmane019/DSA/pulls) 

</div>

<div align="center">
  <p>Welcome to my Data Structures and Algorithms learning repository! This collection documents my journey through DSA, featuring solutions to various programming problems and implementations of fundamental algorithms.</p>
</div>

## 📚 Repository Structure

```plaintext
DSA-Journey/
├── Arrays/
│   ├── Easy/
│   │   └── README.md
│   ├── Medium/
│   │   └── README.md
│   └── Hard/
│       └── README.md
├── LinkedLists/
│   └── README.md
├── Trees/
│   └── README.md
├── Graphs/
│   └── README.md
├── Dynamic-Programming/
│   └── README.md
├── Sorting/
│   └── README.md
├── Searching/
│   └── README.md
└── README.md
```

## 🎯 Problem Categories

### Arrays and Strings
<div align="center">
  <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQYl-krx5jO0-xK5KyNMmQsJcRXjFE4arGIsQ&s" alt="Array visualization" width="400px" height="300px" style="margin: 20px 0"/>
</div>

```python
# Example: Two-pointer technique for finding pair sum
def findPairSum(arr: List[int], target: int) -> List[int]:
    left, right = 0, len(arr) - 1
    while left < right:
        current_sum = arr[left] + arr[right]
        if current_sum == target:
            return [left, right]
        elif current_sum < target:
            left += 1
        else:
            right -= 1
    return []
```

### Linked Lists
<div align="center">
  <img src="https://cdn-images-1.medium.com/max/1080/1*ubgj-p92eh6TPbga5HZMTg.jpeg" alt="Linked List visualization" width="400px" height="300px" style="margin: 20px 0"/>
</div>

```python
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def reverseList(head: ListNode) -> ListNode:
    prev = None
    current = head
    
    while current:
        next_temp = current.next
        current.next = prev
        prev = current
        current = next_temp
    
    return prev
```

### Trees and Graphs
<div align="center">
  <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQIlz_nYZGN_-GviCA4oxhN5hpuEgSqOXSE-g&s" alt="Tree and Graph visualization" width="400px" height="300px" style="margin: 20px 0"/>
</div>

```python
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def inorderTraversal(root: TreeNode) -> List[int]:
    result = []
    
    def inorder(node):
        if not node:
            return
        inorder(node.left)
        result.append(node.val)
        inorder(node.right)
    
    inorder(root)
    return result
```

### Dynamic Programming
<div align="center">
  <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT7gtz_A-xIM60abch-54YNAk3xFDdG-NxKBw&s" alt="Dynamic Programming visualization" width="400px" height="300px" style="margin: 20px 0"/>
</div>

```python
def fibonacci_dp(n: int) -> int:
    if n <= 1:
        return n
    
    dp = [0] * (n + 1)
    dp[1] = 1
    
    for i in range(2, n + 1):
        dp[i] = dp[i-1] + dp[i-2]
    
    return dp[n]
```

## 🎨 Problem-Solving Patterns

### 1. Two Pointers Technique
```python
def twoSum(numbers: List[int], target: int) -> List[int]:
    left, right = 0, len(numbers) - 1
    while left < right:
        current_sum = numbers[left] + numbers[right]
        if current_sum == target:
            return [left + 1, right + 1]
        elif current_sum < target:
            left += 1
        else:
            right -= 1
    return []
```

### 2. Sliding Window Pattern
```python
def maxSubArray(nums: List[int], k: int) -> int:
    if not nums or k <= 0:
        return 0
    
    window_sum = sum(nums[:k])
    max_sum = window_sum
    
    for i in range(k, len(nums)):
        window_sum = window_sum - nums[i-k] + nums[i]
        max_sum = max(max_sum, window_sum)
    
    return max_sum
```

## 💡 Solution Template

```python
"""
Problem Name: Two Sum
Difficulty: Easy
Source: LeetCode - 1
Tags: Array, Hash Table

Problem Description:
Given an array of integers nums and an integer target, return indices of the two numbers 
such that they add up to target. You may assume that each input would have exactly one solution, 
and you may not use the same element twice.

Approach:
- Time Complexity: O(n)
- Space Complexity: O(n)
- Pattern Used: Hash Table

Example:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
"""

def twoSum(nums: List[int], target: int) -> List[int]:
    seen = {}
    for i, num in enumerate(nums):
        complement = target - num
        if complement in seen:
            return [seen[complement], i]
        seen[num] = i
    return []

# Test cases
def test_twoSum():
    assert twoSum([2,7,11,15], 9) == [0,1]
    assert twoSum([3,2,4], 6) == [1,2]
    assert twoSum([3,3], 6) == [0,1]
```

## 📊 Progress Tracker

<div align="center">

| Platform | Problems Solved |
|----------|----------------|
| LeetCode | [Number] |
| CodeForces | [Number] |
| GeeksForGeeks | [Number] |
| Total | [Number] |

</div>

## 🛠️ Getting Started

1. Clone the repository:
```bash
git clone https://github.com/yourusername/repo-name.git
cd repo-name
```

2. Navigate to specific problem categories:
```bash
cd Arrays/Easy
```

3. Run the test cases:
```bash
python -m pytest test_solution.py
```

## 🤝 Contributing

1. Fork the repository
2. Create your feature branch:
```bash
git checkout -b feature/AmazingFeature
```
3. Commit your changes:
```bash
git commit -m 'Add some AmazingFeature'
```
4. Push to the branch:
```bash
git push origin feature/AmazingFeature
```
5. Open a Pull Request

## 🌟 Resources

- [LeetCode](https://leetcode.com/)
- [GeeksforGeeks](https://www.geeksforgeeks.org/)
- [CodeForces](https://codeforces.com/)
- [Introduction to Algorithms (CLRS)](https://en.wikipedia.org/wiki/Introduction_to_Algorithms)

## 📫 Connect With Me

<div align="center">

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/prathamesh-mane-2308a5241) 

</div>

---

<div align="center">
  <p>Happy Coding! 🎉</p>
  <p>Star ⭐ this repository if you find it helpful!</p>
</div>
