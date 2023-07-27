import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder answer = new StringBuilder();
        for (byte i = 0; i < str.length(); i++) {
            char spell = str.charAt(i);
            if (Character.isUpperCase(spell)) {
                spell = Character.toLowerCase(spell);
            } else spell = Character.toUpperCase(spell);
            answer.append(spell);
        }
        System.out.println(answer.toString());
    }
}