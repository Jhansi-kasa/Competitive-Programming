import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l = 0;
        int r = s.length() - 1;
        int longestlen = 0;
        String str = "";
        while(l < s.length()-1 && r > 0) {
            String prefix = s.substring(0,l+1);
            String suffix = s.substring(r,s.length());
            if(prefix.equals(suffix)){
                if(prefix.length() > longestlen){
                    str = prefix;
                    longestlen = str.length();
                }
            }
            l++;
            r--;
        }
        System.out.println(str);
    }
}
