/*
* In Berland, there are two types of coins, having denominations of 2 and k

        burles.

        Your task is to determine whether it is possible to represent n
        burles in coins, i. e. whether there exist non-negative integers x and y such that 2⋅x+k⋅y=n
        .
        Input

        The first line contains a single integer t

        The only line of each test case contains two integers n
        and k (1≤k≤n≤1018; k≠2

        ).
        Output

        For each test case, print YES if it is possible to represent n
        burles in coins; otherwise, print NO. You may print each letter in any case (YES, yes, Yes will all be recognized as positive answer,
        * NO, no and nO will all be recognized as negative answer).
        *

        n ---> The number to be represented
        k ---> Denomination aside from 2
        * 2⋅x+k⋅y=n.
* */




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Coins {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            if(n%2 == 0) {
                System.out.println("YES");
                continue;
            }
            else if(k%2 == 1){
                long check = n/2;
                if(k <= check){
                    System.out.println("YES");
                    continue;
                }
            }
            System.out.println("NO");
        }
    }
}
