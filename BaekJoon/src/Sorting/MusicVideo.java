package Sorting;

import java.util.Arrays;
import java.util.Scanner;

// 뮤직비디오 - 결정 알고리즘
public class MusicVideo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        int result = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while(lt<=rt) {
            int mid = (lt + rt) / 2;
            if(count(arr, mid) <= m) {
                result = mid;
                rt = mid-1;
            } else {
                lt = mid+1;
            }
        }
        System.out.println(result);
    }
    public static int count(int[] arr, int capacity) {
        int cnt = 1;
        int sum = 0;
        for(int x : arr) {
            if (sum + x > capacity) {
                cnt++;
                sum = x;
            } else {
                sum += x;
            }
        }
        return cnt;
    }

}


