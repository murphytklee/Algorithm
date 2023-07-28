import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short n = sc.nextShort();
        if (n%2==0){
            System.out.println(n+" is even");
        } else System.out.println(n+" is odd");
    }
}