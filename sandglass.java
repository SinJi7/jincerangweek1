import java.util.Scanner;

public class my
{
    public static void main(String[] args)
    {
        //입력부
        int num;

        //반복문에서 사용
        String space;
        String star;

        Scanner sc = new Scanner(System.in);
        
        System.out.print("number: ");

        num = sc.nextInt();

        int arr[] = new int[num];


        //출력할 양 만큼의 배열 생성
        for(int i = 0, j = 1; i < num; i++)
        {
            arr[i] = j;
            j += 2;
        };

        int last_index = arr[num-1];

        //절댓값 이용 배열 순회
        for(int i = num - 1 ; Math.abs(i) < num; i--)
        {
                space = " ".repeat((last_index-arr[Math.abs(i)])/2);
                star = "*".repeat(arr[Math.abs(i)]);
                System.out.println(space + star + space);
        };
    }
    
    public static void noarr(int num)
    {
        final int fin_N = num*2 - 1;

        int N = num*2 - 1;

        for(int i = num; Math.abs(i) < num + 1; i--)
        {
            if(i != 0)
            {
                System.out.println(" ".repeat((fin_N-Math.abs(N))/2) + "*".repeat(Math.abs(N)) + " ".repeat((fin_N-Math.abs(N))/2));
                N -= 2;
            }
            
        }
    }
}
