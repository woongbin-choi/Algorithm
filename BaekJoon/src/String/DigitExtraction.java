package String;

import java.util.Scanner;

// 숫자만 추출
public class DigitExtraction {
    public int solution(String str){
        int result = 0;
        String s = "";
        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) {
                s += x;
            }
        }
//        for (char x : str.toCharArray()){
//            if(x >= 48 && x <= 57){
//                result = result * 10 + (x - 48);
//            }
//        }
        result = Integer.parseInt(s);
        return result;
    }
    public static void main(String[] args) {
        DigitExtraction T = new DigitExtraction();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}
