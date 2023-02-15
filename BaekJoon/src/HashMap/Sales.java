package HashMap;

import javax.swing.plaf.SliderUI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

// 매출액의 종류
public class Sales {
    public ArrayList<Integer> solution(int n, int k, int[] arr){
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> HM = new HashMap<>();

        for(int i = 0; i < k-1; ++i) {
            HM.put(arr[i], HM.getOrDefault(arr[i], 0) + 1);
        }
        int lt = 0;
        for(int rt= k-1; rt < n; ++rt) {
            HM.put(arr[rt], HM.getOrDefault(arr[rt], 0) + 1);
            result.add(HM.size());
            HM.put(arr[lt], HM.get(arr[lt]) -1);
            if(HM.get(arr[lt]) == 0) {
                HM.remove(arr[lt]);
            }
            lt++;
        }
        return result;
    }
    public static void main(String[] args) {
        Sales T = new Sales();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n,k,arr));
    }
}
