public class right_1_23_345_4567 {
    public static void main(String args[])
	{
		int n=5,k;
		for (int i = 1; i <= n; i++) {
             k=i;
             for (int j = 2*i; j <=2*n-1; j++) {
                 System.out.print(" ");
             }
			for (int j = 1; j <= i; j++,k++) {
				System.out.print(k+" ");
			}

			System.out.println();
		}
	}
}
