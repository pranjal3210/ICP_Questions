package Week_2;
import java.util.*;
public class maximum_subarray_min_product {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        long mod=1000000007;
        int[] left=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[st.peek()]>nums[i]){
                st.pop();
            }
            left[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        int[] right=new int[n];
        Stack<Integer> st2=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st2.isEmpty() && nums[st2.peek()]>=nums[i]){
                st2.pop();
            }
            right[i]=st2.isEmpty()?n:st2.peek();
            st2.push(i);
        }
        long[] prefixSum=new long[n];
        prefixSum[0]=nums[0];
        for(int i=1;i<n;i++){
            prefixSum[i]=nums[i]+prefixSum[i-1];
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            int L=left[i] + 1;
            int R=right[i] - 1;
            long sum = prefixSum[R]-(L>0?prefixSum[L-1]:0);
            long minProduct=sum*nums[i];
            ans = Math.max(ans,minProduct);
        }
        System.out.print((int)(ans%mod));
    }
}
