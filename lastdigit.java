import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Math.abs(n % 10));
        
    }
}
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int last = n % 10;

        if (last < 0) {
            last = -last;
        }

        System.out.println(last);
    }
}
