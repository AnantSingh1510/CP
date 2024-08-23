import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Forked {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int xK = Integer.parseInt(st.nextToken());
            int yK = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int xQ = Integer.parseInt(st.nextToken());
            int yQ = Integer.parseInt(st.nextToken());

            Set<String> kingAttacks = new HashSet<>();
            Set<String> queenAttacks = new HashSet<>();

            int[][] knightMoves = {
                {a,b}, {-a,b}, {a,-b}, {-a,-b},
                {b,a}, {-b,a}, {b,-a}, {-b,-a}
            };

            for(int[] move : knightMoves){
                kingAttacks.add(xK + move[0] + "," + (yK + move[1]));
                queenAttacks.add(xQ + move[0] + "," + (yQ + move[1]));
            }

            kingAttacks.retainAll(queenAttacks);
            System.out.println(kingAttacks.size());
        }
    }
}
