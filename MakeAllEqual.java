import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class MakeAllEqual {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int l = Integer.parseInt(br.readLine());
            int[] arr = new int[l];
            StringTokenizer st = new StringTokenizer(br.readLine().trim());
            HashMap<Integer, Integer> map =  new HashMap<>();
            for(int i = 0 ; i < l ; i++){
                arr[i] = Integer.parseInt(st.nextToken());
                map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            }
            int max = 0;
            for(int i : map.keySet()){
                max = Math.max(max, map.get(i));
            }
            System.out.println(l-max);
        }
    }
}
