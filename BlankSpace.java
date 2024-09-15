/*
    You are given a binary array a of n elements, a binary array is an array consisting only of 0s and 1s.
    A blank space is a segment of consecutive elements consisting of only 0s.
    Your task is to find the length of the longest blank space.
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BlankSpace {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int maxCount = 0, currCount = 0, curr = 1, prev=Integer.MAX_VALUE;
            while(st.hasMoreTokens()){
                curr = Integer.parseInt(st.nextToken());
                if(prev == 0 && curr == 0){
                    currCount++;
                }
                else if(curr == 0){
                    currCount = 1;
                }
                maxCount = Math.max(maxCount, currCount);
                prev = curr;
            }
            System.out.println(maxCount);
        }
    }
}
