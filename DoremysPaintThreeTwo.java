import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class DoremysPaintThreeTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int l = Integer.parseInt(br.readLine());
            HashMap<Integer, Integer> freqMap = new HashMap<>();

            String[] input = br.readLine().split(" ");
            for (int i = 0; i < l; i++) {
                int num = Integer.parseInt(input[i]);
                freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            }
            if (freqMap.size() > 2) {
                System.out.println("No");
                continue;
            }
            if (freqMap.size() == 1) {
                System.out.println("Yes");
                continue;
            }
            Object[] keys = freqMap.keySet().toArray();
            int freq1 = freqMap.get(keys[0]);
            int freq2 = freqMap.get(keys[1]);

            if (Math.abs(freq1 - freq2) <= 1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
