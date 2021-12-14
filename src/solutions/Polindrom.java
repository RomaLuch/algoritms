package solutions;

import java.util.ArrayList;
import java.util.List;

public class Polindrom {

    public static void main(String[] args) {

        System.out.println(isPalindrome(121121));
    }

    public static boolean isPalindrome(int x) {

        int check = x;
        int reverse = 0;
        while (x > 0) {
            reverse = reverse * 10 + x % 10;
            x = x / 10;
        }
        return check == reverse;
    }
}
