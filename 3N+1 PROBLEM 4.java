import java.io.*;
import java.util.*;

public class Solution {
    static int[] num = new int[1000001];
    public static int cyclelength(int n) {
        if(n == 1)
            return 1;
        if(num[(int)n]!=0)
            return num[(int)n];
        int ans;
        if(n%2 == 0)
            ans = 1+cyclelength(n/2);
        else    
            ans = 1+cyclelength(3*n+1);
        num[(int)n] = ans;
        return ans;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        if(i > j){
            j = i+j;
            i = j-i;
            j = j-i;
        }
        int maxcount = 0;
        for(int k = i;k <= j;k++){
            maxcount = Math.max(maxcount,cyclelength(k));
        }
        System.out.println(i+" "+j+" "+maxcount);
    }
}
