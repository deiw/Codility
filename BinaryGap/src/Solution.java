import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int result=solution(1041);
        System.out.println(result);
    }
    public static int solution(int N){
        String bs=Integer.toBinaryString(N);
        String []nulls=bs.split("1");

        if(nulls.length==0) return 0;

        ArrayList<String> list=new ArrayList<>();
        list.addAll(Arrays.asList(nulls));

        if(bs.charAt(bs.length()-1)=='0'){
            list.remove(list.size()-1);
        }

        int biggest= list.stream().mapToInt(String::length).max().getAsInt();

        return biggest>0?biggest:0;
    }

}
