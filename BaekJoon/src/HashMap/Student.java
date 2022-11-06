package HashMap;

import java.util.HashMap;
import java.util.Scanner;

// 학급 회장 선출
public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        char result=' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c,0)+1);
        }
        int max = Integer.MIN_VALUE;
        for(char c : map.keySet()) {
            if(map.get(c) > max) {
                max = map.get(c);
                result = c;
            }
        }

        System.out.println(result);
    }
}
