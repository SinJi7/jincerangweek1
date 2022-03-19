import java.util.Scanner;

public class q16
{
    public static void main(String[] args)
    {
        int int_num;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("정수입력: ");

        int_num = sc.nextInt();

        int_num = ~int_num;

        System.out.println(int_num);

    }
}