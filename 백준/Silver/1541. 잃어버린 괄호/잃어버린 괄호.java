import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static long answer;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),"-");
        
        answer = Integer.MAX_VALUE;

        while(st.hasMoreTokens()) {
            int temp = 0;
            StringTokenizer str = new StringTokenizer(st.nextToken(),"+");

            while(str.hasMoreTokens()) {
                temp += Integer.parseInt(str.nextToken());
            }

            if(answer == Integer.MAX_VALUE)
                answer = temp;
            else
                answer -= temp;
        }

        System.out.println(answer);
        br.close();
    }
}