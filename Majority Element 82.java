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
        int el = arr[0] ,count = 1;
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        for(int i = 1;i < n;i++){
            if(count==0){
                el = arr[i];
                count = 1;
            }
            else{
                if(el == arr[i])
                    count++;
                else
                    count--;
            }
        }
        int res=0;
        for(int i=0;i<n;i++){
            if(el == arr[i])
                res++;
        }
        if(res>n/2)
            System.out.println(el);
        else
            System.out.println("-1");
    }
}
