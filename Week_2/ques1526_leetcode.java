package Week_2;
import java.util.*;
public class ques1526_leetcode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] target=new int[n];
        for(int i=0;i<n;i++){
            target[i]=sc.nextInt();
        }
        int ans=0;
        int prev=0;
        for(int i=0;i<target.length;i++){
            if(target[i]>prev){
                ans+=target[i]-prev;
            }
            prev=target[i];
        }
        System.out.print(ans);
    }
}
