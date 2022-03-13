import java.util.Scanner;

public class baekjoon2884
{
	public static void main(String[] args)
	{
        final int i_dayM = 24*60;
        int i_user_h = 0;
        int i_user_m = 0;

        int i_m = 0;

        int i_result_h = 0;
        int i_result_m = 0;

        Scanner sc = new Scanner(System.in);

        i_user_h = Integer.parseInt(sc.next());
        i_user_m = Integer.parseInt(sc.next());

        i_m = (i_user_m + i_user_h*60) - 45;

        if(i_m < 0)
        {
            i_m = i_dayM + i_m;
        }

        i_result_h = i_m / 60;
        i_result_m = i_m % 60;

        System.out.println(i_result_h + " " + i_result_m);

	};
};