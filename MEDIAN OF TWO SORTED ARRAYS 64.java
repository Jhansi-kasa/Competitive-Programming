import java.io.*;
import java.util.*;

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
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
        for(int i=0;i<m;i++)
            arr2[i] = sc.nextInt();
        int[] res = mergeSortedArrays(arr1, arr2);
        int low = 0;
        int high = res.length-1;
        int mid = (low+high)/2;
        double median = 0;
        if((high+1)%2==0)
            median = (res[mid]+res[mid+1])/2.0;
        else
            median = (res[mid]);
        System.out.print(median);
    }
}
