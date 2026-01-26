package Week_2;
import java.util.*;
public class ques2030 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
        char letter= sc.next().charAt(0);
        int repetition=sc.nextInt();
        StringBuilder ans=new StringBuilder();
        int n=s.length();
        int remainLetter=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==letter){
                remainLetter++;
            }
        }
        int usedLetter=0;
        int remainChar=n;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            //pop
            while(ans.length()>0){
                char top=ans.charAt(ans.length()-1);
                if(top<=c)break;
                if(ans.length()-1+remainChar <k)break;
                if(top==letter && usedLetter -1+remainLetter<repetition)break;
                ans.deleteCharAt(ans.length()-1);
                if(top==letter){
                    usedLetter--;
                }
            }
            if(ans.length()<k){
                if(c==letter){
                    ans.append(c);
                    usedLetter++;
                }
                else{
                    if(k-ans.length()>repetition-usedLetter){
                        ans.append(c);
                        
                    }
                }
            }
            remainChar--;
            if(c==letter)remainLetter--;
        }
        System.out.print(ans.toString());
    }
}
