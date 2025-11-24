import java.util.Scanner;
public class MAin
{
    public static void main(String[] arge)
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the first Number :");
        int nu1 = Sc.nextInt();
        System.out.println("Enter the Second number :");
        int nu2 = Sc.nextInt();
        int sum = nu1 + nu2;
        System.out.println(sum);

    }
}