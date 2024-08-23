import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class HalloumiBoxes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine().trim());
        
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine().trim());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            
            int[] a = new int[n];
            st = new StringTokenizer(br.readLine().trim());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            
            if (k >= 2) {
                result.append("YES").append("\n");
            } else {
                boolean canSort = true;
                int x = a[0];
                for(int i : a){
                    if(i < x)
                        canSort = false;
                    x = i;
                }
                result.append(canSort ? "YES" : "NO").append("\n");
            }
        }
        System.out.print(result);
    }
}
