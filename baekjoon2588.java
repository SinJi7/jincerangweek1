import java.util.Scanner;

public class baekjoon2588
{
	public static void main(String[] args)
	{
		int int_num1 = 0;
		int int_num2 = 0;
		int int_result = 0;
		
		int[] arrInt_num = new int[3];
		
		Scanner sc = new Scanner(System.in);
		int_num1 = sc.nextInt();
		int_num2 = sc.nextInt();

		int_result = int_num1*int_num2;
		
		for(int i = 0; i < 3; i++)
		{
			arrInt_num[i] = int_num1 * (int_num2 % 10);
			int_num2 = int_num2/10;
		};
		
		for(int i = 0; i < 3; i++)
		{
			System.out.println(arrInt_num[i]);
		};

		System.out.println(int_result);

		
	};
};