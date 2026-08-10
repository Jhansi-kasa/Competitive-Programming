import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0;i < N;i++)
            arr[i] = sc.nextInt();
        int X = sc.nextInt();
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0;i < arr.length;i++) {
            if( i > 0 && arr[i] == arr[i-1])
                continue;
            int j = i + 1;
            int k = arr.length - 1;
            while(j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if(sum == X) {
                    res.add(Arrays.asList(arr[i],arr[j],arr[k]));
                    j++;
                    k--;
                    while(j < k && arr[j] == arr[j-1]) j++;
                    while(j < k && arr[k] == arr[k-1]) k--;
                }
                else if(sum > X)
                    k--;
                else
                    j++;
            }
        }
        for(List<Integer> l : res) {
            for(int num : l)
                System.out.print(num+ " ");
            System.out.println();
        }
    }
}
