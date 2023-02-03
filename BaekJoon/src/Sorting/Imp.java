package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// 장난꾸러기
public class Imp {
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        int[] tmp = arr.clone();
        Arrays.sort(tmp);

        for(int i = 0; i < n; ++i) {
            if(arr[i] != tmp[i]) {
                result.add(i+1);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Imp T = new Imp();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        for(int x : T.solution(n, arr)) {
            System.out.println(x + " ");
        }
    }
}
