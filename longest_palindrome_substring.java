import java.util.*;
public class longest_palindrome_substring {  
    public String longestpalindrome(String s){      
        int maxx=0;
        String newString="";
        for (int i = 0; i < s.length(); i++) {
            String s1="";
            int count=0;
            for (int j = i; j < s.length(); j++) {
                s1+=s.charAt(j);
                StringBuilder sb=new StringBuilder(s1);
                sb.reverse();
                if(s1.equals(sb.toString()))
                    count=s1.length();
                    if(count>maxx){
                        maxx=count;
                        newString=s1;
                    }
            }
        }
        return newString;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        longest_palindrome_substring obj=new longest_palindrome_substring();;
        System.out.println(obj.longestpalindrome(s));
    }
}
