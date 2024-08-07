import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AplusBAgain {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(n-- > 0){
            int x = Integer.parseInt(br.readLine());
            int sum = 0;
            while (x > 0) {
                sum += x%10;
                x /= 10;
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb.toString());
    }
}
