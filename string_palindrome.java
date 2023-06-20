import java.util.Scanner;

public class string_palindrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        // String s1="";
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        // for (int i = 0; i < s.length(); i++) {
        //     s1=s.charAt(i)+s1;
        // }
        // System.out.println(s1);
        if(s.equals(sb.toString()))
          System.out.println("palindrome");
        else
          System.out.println("not palindrome");
    }
}
