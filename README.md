# ICP_Questions
 # 📅 Week 2 – DSA Problems (LeetCode)

This folder contains the problems discussed in **Week 2**, focusing on **string manipulation** and **stack-based techniques**.

---

## 🟢 EASY – Minimum String Length After Removing Substrings  
**LeetCode No. 2696**

### 🔗 Problem Link  
https://leetcode.com/problems/minimum-string-length-after-removing-substrings/submissions/1890555603/
### 🧠 Concept Used
- String manipulation  
- Stack / simulation  
- Greedy removal of substrings

### 📌 Brief Idea
Repeatedly remove `"AB"` or `"CD"` from the string until no more removals are possible, and return the final length.

---

## 🟢 EASY – Make The String Great  
**LeetCode No. 1544**

### 🔗 Problem Link  
https://leetcode.com/problems/make-the-string-great/submissions/1890571141/?page=1

### 🧠 Concept Used
- Stack  
- ASCII / character comparison

### 📌 Brief Idea
Remove adjacent characters if they are the same letter but different cases (e.g., `'a'` and `'A'`) until the string becomes stable.

---

## 🟡 MEDIUM – Sum of Subarray Minimums  
**LeetCode No. 907**

### 🔗 Problem Link  
https://leetcode.com/problems/sum-of-subarray-minimums/submissions/1890678837/?page=1

### 🧠 Concept Used
- Monotonic Stack  
- Contribution Technique  
- Prefix logic

### 📌 Brief Idea
For each element, calculate how many subarrays it is the minimum of using previous and next smaller elements, then sum all contributions.

---

## ✅ Summary

| Difficulty | Problem | Technique |
|---------|--------|-----------|
| Easy | Minimum String Length After Removing Substrings | Stack / Simulation |
| Easy | Make The String Great | Stack |
| Medium | Sum of Subarray Minimums | Monotonic Stack |

---

📌 **Note:**  
All solutions are implemented in **Java** and stored as separate files inside the `Week-2` folder, following the naming convention:



