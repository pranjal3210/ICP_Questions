package Week_2;
import java.util.*;
public class Sum_of_Subarray_Minimums_leetcode_907 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mod=1000000007;
        int arr_size=sc.nextInt();
        int[] arr=new int[arr_size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int n=arr.length;
        int[] prev=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            prev[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        int[] after=new int[n];
        Stack<Integer> st2=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st2.isEmpty() && arr[st2.peek()]>=arr[i]){
                st2.pop();
            }
            after[i]=st2.isEmpty()?n:st2.peek();
            st2.push(i);
        }
        long ans=0;
        for(int i=0;i<arr.length;i++){
            long left=i-prev[i];
            long right=after[i]-i;
            ans+=arr[i]*left*right;
        }
        ans=ans%mod;
        System.out.print((int)ans);
    }
}
