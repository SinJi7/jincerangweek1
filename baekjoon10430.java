import java.util.Scanner;

public class baekjoon10430
{
	public static void main(String[] args)
	{
        int int_A = 0;
        int int_B = 0;
        int int_C = 0;

        Scanner sc = new Scanner(System.in);

        int_A = Integer.parseInt(sc.next());
        int_B = Integer.parseInt(sc.next());
        int_C = Integer.parseInt(sc.next());

        System.out.println( (int_A+int_B)%int_C );
        System.out.println( ((int_A%int_C)+(int_B%int_C))%int_C );
        System.out.println( (int_A*int_B)%int_C );
        System.out.println( ((int_A%int_C)*(int_B%int_C))%int_C );

	};
};