package HashMap;

import java.util.HashMap;
import java.util.Scanner;

// 알파벳 나열 순서 달라도 구성이 같으면 아나그램
public class Anagram {
    public String solution(String a, String b){
        String result = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : a.toCharArray()) {
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        for (char x : b.toCharArray()) {
            if(!map.containsKey(x) || map.get(x) == 0) {
                result = "NO";
            }
            map.put(x, map.get(x) -1);
        }
        return result;
    }
    public static void main(String[] args) {
        Anagram T = new Anagram();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(T.solution(a,b));
    }
}
