package HashMap;

import java.util.HashMap;
import java.util.Scanner;

// 학급 회장 선출
public class Student {
    public char solution(String str){
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
        return result;
    }
    public static void main(String[] args) {
        Student T = new Student();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
