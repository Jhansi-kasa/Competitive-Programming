import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = 0;
        int seen = 0;
        while(i < s.length()) {
            int pos = s.charAt(i) - 'a';
            int mask = 1 << pos;
            if((seen&mask) != 0)
                System.out.print(s.charAt(i)+" ");
            else
                seen |= mask;
            i++;
        }
        
    }
}
