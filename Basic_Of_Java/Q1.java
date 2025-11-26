// Program to count frequency of each character in a given string

import java.util.*;
public class Q1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String Input = sc.nextLine();
        Map<Character, Integer> freq = new HashMap<>();
        for(char c: Input.toCharArray())
        {
            freq.put(c, freq.getOrDefault(c, 0) + 1 );
        } 
        System.out.println(freq);
    }
}
