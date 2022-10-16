package String;

import java.util.Scanner;

// 팰린드롬 - 회문
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String result = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]","");

        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equals(tmp)) result ="YES";

        System.out.println(result);
    }
}
