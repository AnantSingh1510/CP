import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class CardGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine().trim());
        
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine().trim());
            int a1 = Integer.parseInt(st.nextToken());
            int a2 = Integer.parseInt(st.nextToken());
            int b1 = Integer.parseInt(st.nextToken());
            int b2 = Integer.parseInt(st.nextToken());
            
            int winCount = 0;
            
            if (countWins(a1, a2, b1, b2) > countWins(b1, b2, a1, a2)) {
                winCount++;
            }
            if (countWins(a1, a2, b2, b1) > countWins(b2, b1, a1, a2)) {
                winCount++;
            }
            if (countWins(a2, a1, b1, b2) > countWins(b1, b2, a2, a1)) {
                winCount++;
            }
            if (countWins(a2, a1, b2, b1) > countWins(b2, b1, a2, a1)) {
                winCount++;
            }
            
            result.append(winCount).append("\n");
        }
        
        System.out.print(result);
    }
    
    private static int countWins(int a1, int a2, int b1, int b2) {
        int suneetWins = 0;
        
        if (a1 > b1) suneetWins++;
        if (a2 > b2) suneetWins++;
        
        return suneetWins;
    }
}
