package Sorting;

import java.util.Arrays;
import java.util.Scanner;

// 이분검색
public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        int result = 0;

        Arrays.sort(arr);
        int lt=0, rt=n-1;
        while(lt <= rt) {
            int mid = (lt+rt) / 2;
            if(arr[mid] == m) {
                result = mid + 1;
                break;
            }
            if (arr[mid] > m) {
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }

        System.out.println(result);
    }
}
