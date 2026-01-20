package Week_2;

import java.util.Scanner;
import java.util.Stack;
public class Minimum_String_Length_After_Removing_Substrings2696 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.isEmpty() && check(st,ch)){
                st.pop();
                continue;
            }
            else{
                st.push(ch);
            }
            
        }
        System.out.print(st.size());

    }
    public static boolean check(Stack<Character> st,char ch){
        if((st.peek()=='A' && ch=='B')||(st.peek()=='C' && ch=='D')){
            return true;
        }
        return false;
    }
}
