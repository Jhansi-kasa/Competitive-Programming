import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int low =1;
        int high = n1;
        int res = 1;
        while(low<=high){
            int mid = (low+high)/2;
            int sum = 0;
            for(int i=0;i<mid;i++){
                sum+=n2;
                if(sum>n1)
                    break;
            }
            if(sum<=n1){
                res = mid;
                low = mid+1;
            }
            else 
                high = mid-1;     
        }
        System.out.print(res);
    }
}
