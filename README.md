# 📅 Week 2 – DSA Problems (LeetCode)

This folder contains the problems discussed in **Week 2**, focusing on **string manipulation**, **stack-based techniques**, and **monotonic stack patterns**.

---

## 🟢 EASY – Minimum String Length After Removing Substrings  
**LeetCode No. 2696**

### 🔗 Solution Link  
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

### 🔗 Solution Link  
https://leetcode.com/problems/make-the-string-great/submissions/1890571141/

### 🧠 Concept Used
- Stack  
- ASCII / character comparison

### 📌 Brief Idea
Remove adjacent characters if they are the same letter but different cases (e.g., `'a'` and `'A'`) until the string becomes stable.

---

## 🟡 MEDIUM – Sum of Subarray Minimums  
**LeetCode No. 907**

### 🔗 Solution Link  
https://leetcode.com/problems/sum-of-subarray-minimums/submissions/1890678837/

### 🧠 Concept Used
- Monotonic Stack  
- Contribution Technique  
- Prefix logic

### 📌 Brief Idea
For each element, calculate how many subarrays it is the minimum of using previous and next smaller elements, then sum all contributions.

---

## 🟡 MEDIUM – Maximum Subarray Min-Product  
**LeetCode No. 1856**

### 🔗 Solution Link  
https://leetcode.com/problems/maximum-subarray-min-product/submissions/1890736833/

### 🧠 Concept Used
- Monotonic Stack  
- Prefix Sum  
- Contribution Technique

### 📌 Brief Idea
For each element, consider it as the minimum of a subarray, find the largest valid range, compute the subarray sum, and maximize  
`minimum × subarray sum`.

---

## 🔴 HARD – Minimum Number of Increments on Subarrays to Form a Target Array  
**LeetCode No. 1526**

### 🔗 Solution Link  
https://leetcode.com/problems/minimum-number-of-increments-on-subarrays-to-form-a-target-array/submissions/1890810834/

### 🧠 Concept Used
- Greedy  
- Difference array logic  
- Stack-like observation

### 📌 Brief Idea
Whenever the current element is greater than the previous one, add the difference to the answer. The total increments required form the result.

---

## 🔴 HARD – Smallest K-Length Subsequence With Occurrences of a Letter  
**LeetCode No. 2030**

### 🔗 Solution Link  
https://leetcode.com/problems/smallest-k-length-subsequence-with-occurrences-of-a-letter/submissions/1891116706/

### 🧠 Concept Used
- Monotonic Stack  
- Greedy strategy  
- Character frequency tracking

### 📌 Brief Idea
Construct the lexicographically smallest subsequence of length `k` while ensuring the required number of occurrences of a given letter.

---

## ✅ Summary

| Difficulty | Problem | Technique |
|----------|--------|-----------|
| Easy | Minimum String Length After Removing Substrings | Stack / Simulation |
| Easy | Make The String Great | Stack |
| Medium | Sum of Subarray Minimums | Monotonic Stack |
| Medium | Maximum Subarray Min-Product | Monotonic Stack + Prefix Sum |
| Hard | Minimum Number of Increments on Subarrays | Greedy |
| Hard | Smallest K-Length Subsequence With Occurrences of a Letter | Greedy + Stack |

---

📌 **Note:**  
All solutions are implemented in **Java** and stored as separate files inside the `Week-2` folder, following the required naming convention.
