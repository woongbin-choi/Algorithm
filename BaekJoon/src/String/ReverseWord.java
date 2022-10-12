package String;

import java.util.ArrayList;
import java.util.Scanner;

// 단어 뒤집기, StringBuilder
public class ReverseWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] str = new String[n];
        for(int i= 0; i<n; ++i){
            str[i] = sc.next();
        }

        ArrayList<String> result = new ArrayList<>();
        for(String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            result.add(tmp);
        }
        for(String y : result) {
            System.out.println(y);
        }
    }

}
