
// This program checks whether the given string is a palindrome or not


import java.util.Scanner;

public class Pal_St {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        String Input = sc.nextLine();
        String reversed = new StringBuilder(Input).reverse().toString();
        System.out.println("IS Palindrom :" + Input.equals(reversed));
        
    }
}
