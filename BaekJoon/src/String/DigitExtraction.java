package String;

import java.util.Scanner;

// 숫자만 추출
public class DigitExtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int result = 0;

        for (char x : str.toCharArray()){
            if(x >= 48 && x <= 57){
                result = result * 10 + (x - 48);
            }
        }

        System.out.println(result);
    }
}
