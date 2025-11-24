// Here is a String programs
import java.util.Scanner;
/*
public class Str1 {
    public static void main(String[] arge)
    {
        Scanner Sc = new  Scanner(System.in);
        System.out.println("Enter the String :");
        String Input = Sc.nextLine();
        String Reversed = "";
        for(int i = Input.length()-1; i >= 0; i--)
        {
            Reversed += Input.charAt(i);
        }
        System.out.println("Reversed : " + Reversed);
    }
    
} */

public class Str1
{
    public static void main(String[] arge)
    {
        Scanner Sc = new Scanner(System.in);
        String Input = "Hii";
        String Reversed = "";
        for(int i = Input.length()-1; i>=0; i--)
        {
            Reversed += Input.charAt(i);
        }

        System.out.println("Reversed :" + Reversed);

    }
}
