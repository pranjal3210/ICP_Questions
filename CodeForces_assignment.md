An array is called beautiful if all its prefixes of length greater than or equal to 2 are good.

A prefix is considered good when the greatest common divisor (GCD) of all its elements is less than or equal to the length of that prefix.

The GCD of a sequence never increases when more elements are added. Therefore, smaller prefixes impose stricter conditions than larger prefixes.

The smallest valid prefix has length 2, so it becomes the most important condition to satisfy.

If the first two elements of the array have a GCD greater than 2, the prefix of length 2 becomes invalid, and no further rearrangement can make the array beautiful.

Hence, the problem reduces to checking whether there exists at least one pair of elements whose GCD is less than or equal to 2.

If such a pair exists, these elements can be placed at the beginning of the array, and the remaining elements can be arranged afterward since the GCD of longer prefixes will not increase.

If no such pair exists, every possible ordering will fail at the first prefix itself, and the array cannot be made beautiful.


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
