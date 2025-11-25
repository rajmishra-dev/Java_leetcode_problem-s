

import java.util.Scanner;
public class Str_sort_rev
{
    public static void main(String[] args)
    {
        Scanner  Sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String Input = Sc.nextLine();
        String reversed = "";
        for(int i = Input.length() -1 ; i >=0; i-- )
        {
            reversed += Input.charAt(i);
            if(Input.charAt(i) == 'e' ){
                System.out.println(i);
            }
        }
        System.out.println("Reversed :" + reversed + " !");
    }
}

