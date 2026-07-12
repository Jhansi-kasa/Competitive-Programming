import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int[] mergeSortedArrays(int[] arr1,int[] arr2){
        int[] res = new int[arr1.length+arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j])
                res[k++] = arr1[i++];
            else if(arr1[i]>arr2[j])
                res[k++] = arr2[j++];
            else{
                res[k++] = arr1[i++];
                res[k++] = arr2[j++];
            }     
        }
        while(i<arr1.length)
            res[k++] = arr1[i++];
        while(j<arr2.length)
            res[k++] = arr2[j++];
        return res;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for(int i=0;i<m;i++)
            arr2[i] = sc.nextInt();
        int[] res = mergeSortedArrays(arr1,arr2);      
        for(int i=0;i<res.length;i++)
            System.out.print(res[i]+" ");
    }
}
