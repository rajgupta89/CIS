import java.util.Scanner;

public class prime_in_range {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=0;
        if(n==1)
            System.out.print("2");
        else{
        for (int i = 2; i <=n*n; i++) {
            int count=0;
            for (int j = 1; j <=i; j++) {
                if(i%j==0)
                count++;
            }
            if(count==2){
            System.out.print(i+" ");
            m++;
        }
        if(m>=n)
          break;
        }
    }
    }
}
