package Sorting;

import java.util.Arrays;
import java.util.Scanner;

// 마구간  - 결정 알고리즘
public class Stable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        int result = 0;
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n-1];
        while(lt<rt) {
            int mid = (lt + rt) / 2;
            if(count(arr,mid) >= c) {
                result = mid;
                lt = mid+1;
            } else {
                rt = mid-1;
            }
        }
        System.out.println(result);
    }
    public static int count(int[] arr, int dist) {
        int cnt = 1;
        int ep = arr[0];
        for(int i = 1; i < arr.length; ++i) {
            if(arr[i] - ep >= dist) {
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }
}
