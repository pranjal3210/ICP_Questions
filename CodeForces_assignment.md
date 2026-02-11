# Competitive Programming Solutions

This repository contains solutions to multiple algorithmic problems.
Each problem is divided into two parts:

1. **Problem Explanation & Approach**
2. **Implementation (Java Code)**

---

## Question 1 — Beautiful Array

### Problem Explanation

An array is called **beautiful** if all its prefixes of length greater than or equal to 2 are good.

A prefix is considered good when the **GCD of all its elements** is less than or equal to the length of that prefix.

Since the GCD of a sequence never increases when more elements are added, smaller prefixes impose stricter conditions than larger ones.

The smallest valid prefix has length 2, making it the most important condition.

If the first two elements have a GCD greater than 2, the prefix of length 2 becomes invalid. Therefore, the array cannot be made beautiful.

Hence, the problem reduces to checking whether there exists **at least one pair** whose GCD is less than or equal to 2.

If such a pair exists, it can be placed at the beginning, and the remaining elements will automatically satisfy the condition.

### Implementation

```java
import java.util.*;
public class Main {
    static int gcd(int a, int b){
        while(b!=0){
            int t=a%b;
            a=b;
            b=t;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            boolean ok=false;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(gcd(a[i],a[j])<=2){
                        ok=true;
                        break;
                    }
                }
                if(ok) break;
            }
            if(ok) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
```

---

## Question 2 — Halloumi Boxes

### Problem Explanation

If `k > 1`, any arrangement is possible because multiple operations allow rearranging the array freely.

If `k == 1`, the array cannot be rearranged. Therefore, the array must already be sorted.

### Implementation

```java
import java.util.*;
public class HalloumiBoxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
            }
            long[] sorted = a.clone();
            Arrays.sort(sorted);
            if (k > 1) System.out.println("YES");
            else System.out.println(Arrays.equals(sorted, a) ? "YES" : "NO");
        }
    }
}
```

---

## Question 3 — Beautiful Average

### Problem Explanation

The required result is simply the maximum element of the array.

### Implementation

```java
import java.util.*;
public class Beautiful_Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int max=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                max=Math.max(max,arr[i]);
            }
            System.out.println(max);
        }
    }
}
```

---

## Question 4 — Line Trip

### Problem Explanation

The answer is the maximum distance between consecutive positions, considering that the last jump back must be doubled.

### Implementation

```java
import java.util.*;
public class line_trip {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();

            int max=arr[0];
            if(n==1) max=Math.max(max,(x-arr[0])*2);

            for(int i=1;i<n;i++){
                int cur=arr[i]-arr[i-1];
                if(i==n-1) cur=Math.max(cur,(x-arr[i])*2);
                max=Math.max(max,cur);
            }
            System.out.println(max);
        }
    }
}
```

---

## Question 5 — Cover in Water

### Problem Explanation

If three consecutive empty cells (`...`) exist, the answer is always `2`.
Otherwise, count the number of empty cells.

### Implementation

```java
import java.util.*;
public class CoverInWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            boolean ok=true;
            int count=0;

            for(int i=0;i<n;i++){
                if(i+2<n && s.charAt(i)=='.' && s.charAt(i+1)=='.' && s.charAt(i+2)=='.'){
                    ok=false;
                    break;
                }
                if(s.charAt(i)=='.') count++;
            }
            System.out.println(ok ? count : 2);
        }
    }
}
```

---

## Question 6 — Games with Integer

### Problem Explanation

If `n` is divisible by 3, the second player wins; otherwise, the first player wins.

### Implementation

```java
import java.util.Scanner;
public class game_with_integer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            System.out.println(n%3==0 ? "Second" : "First");
        }
    }
}
```

---

## Question 7 — Jagged Swaps

### Problem Explanation

The array can be made valid only if the first element is already `1`.

### Implementation

```java
import java.util.Scanner;
public class jagged_swaps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            System.out.println(arr[0]==1 ? "Yes" : "No");
        }
    }
}
```
