import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        int[]A=new int[]{9,3,9,3,9,7,9};
        int score=solution(A);
        System.out.println(score);
    }
    public static int solution(int[]A){
        int score=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(map.containsKey(A[i])) map.remove(A[i]);
            else map.put(A[i],1);
        }
        for(int v:map.keySet()){
            score+=v;
        }
        return score;
    }
}