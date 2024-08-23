import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class DoremysPaintThree{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int l = Integer.parseInt(br.readLine());
            HashMap<Integer, Integer> hash = new HashMap<>();
            boolean flag = false;

            String[] input = br.readLine().split(" ");
            for(int i = 0 ; i < l ; i++){
                int num = Integer.parseInt(input[i]);
                hash.put(num, hash.getOrDefault(num, 0)+1);
                if(hash.size() > 2){
                    System.out.println("No");
                    flag = true;
                    break;
                }
            }
            if (flag) {
                continue;
            }
            if(hash.size() == 1){
                System.out.println("Yes");
                continue;
            }
            int key1 = hash.get(hash.keySet().toArray()[0]);
            int key2 = hash.get(hash.keySet().toArray()[1]);

            if(key1 == key2 || Math.abs(key1-key2) == 1){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
