package HashMap;

import java.util.HashMap;
import java.util.Scanner;

// 모든 아나그램 찾기
public class AllAnagram {
    public int solution(String a, String b) {
        int answer = 0;
        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();

        for(char x : b.toCharArray()) {
            bm.put(x, bm.getOrDefault(x,0) + 1);
        }
        int L = b.length() - 1;
        for(int i = 0; i < L; ++i) {
            am.put(a.charAt(i), am.getOrDefault(a.charAt(i),0) + 1);
        }

        int lt = 0;
        for(int rt=L; rt < a.length(); ++rt) {
            am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0) + 1);
            if(am.equals(bm)) {
                answer++;
            }
            am.put(a.charAt(lt), am.get(a.charAt(lt)) -1);
            if(am.get(a.charAt(lt)) == 0) {
                am.remove(a.charAt(lt));
            }
            lt++;
        }
        return answer;
    }
    public static void main(String[] args) {
        AllAnagram T = new AllAnagram();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(T.solution(a,b));
    }
}
