import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());

        // 분할 정복을 통한 A^B % C 계산
        long result = pow(a, b, c);
        
        System.out.println(result);
    }
    
    private static long pow(long a, long b, long c) {
        if (b == 0) {
            return 1; // a^0 = 1
        }
        
        long half = pow(a, b / 2, c); // A^(B/2)
        half = (half * half) % c; // (A^(B/2) * A^(B/2)) % c
        
        if (b % 2 == 1) { // B가 홀수라면
            half = (half * a) % c; // A^(B/2 * 2) * A
        }

        return half;
    }
}
