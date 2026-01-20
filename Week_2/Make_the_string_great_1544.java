package Week_2;
import java.util.*;
public class Make_the_string_great_1544 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.isEmpty() && Character.toLowerCase(st.peek())==Character.toLowerCase(ch) && st.peek()!=ch){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        System.out.print(ans.reverse().toString());
    }
}
