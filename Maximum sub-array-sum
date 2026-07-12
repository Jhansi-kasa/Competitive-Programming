import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] arr = new int[m];
        for(int i = 0;i < m;i++)
            arr[i] = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<m;i++){
            sum+=arr[i];
            if(sum>max)
                max = sum;
            if(sum<0)
                sum = 0;
        }
        System.out.println(max);
    }
}
