import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++)
            arr[i] = sc.nextInt();
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i < n;i++) {
            if(i-1>=0 && arr[i]<arr[i-1])
                sum = arr[i];
            else
                sum+=arr[i];
            if(sum>max)
                max = sum;
        }
        System.out.println(max);
    }
}
