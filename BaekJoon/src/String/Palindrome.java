package String;

import java.util.Scanner;

// 팰린드롬 - 회문
public class Palindrome {
    public String solution(String str) {
        String result = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equals(tmp)) result ="YES";

        return result;
    }
    public static void main(String[] args) {
        Palindrome T = new Palindrome();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
