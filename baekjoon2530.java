import java.util.Scanner;

public class baekjoon2530
{
	public static void main(String[] args)
	{
        final int i_dayS = (24*60*60);
        int i_user_h = 0;
        int i_user_m = 0;
        int i_user_s = 0;

        int i_cookTime_s = 0;

        int i_s = 0;

        int i_result_h = 0;
        int i_result_m = 0;
        int i_result_s = 0;

        Scanner sc = new Scanner(System.in);

        i_user_h = Integer.parseInt(sc.next());
        i_user_m = Integer.parseInt(sc.next());
        i_user_s = Integer.parseInt(sc.next());
        i_cookTime_s = sc.nextInt();
        

        i_s = ((i_user_h*60*60) + (i_user_m*60) + i_user_s) + i_cookTime_s;

        if(i_s >= i_dayS)
        {
            i_s -= i_dayS;
        }

        i_result_m = i_s / 60;
        i_result_s = i_s % 60;

        i_result_h = i_result_m / 60;
        i_result_m = i_result_m % 60;

        System.out.println(i_result_h + " " + i_result_m + " " + i_result_s);

	};
};