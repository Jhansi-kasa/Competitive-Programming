import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int carry = 0;
        while(b != 0) {
            carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        System.out.print(a);
    }
}
