public class Solution {
    public static void main(String[] args) {
        int[]A=new int[]{3,8,9,7,6};
        solution(A,3);
        for(int a:A){
            System.out.print(a+" ");
        }
    }
    public static int[] solution(int[]A,int K){
        if(A.length==0) return A;
        for(int i=0;i<K;i++){
            int a=A[A.length-1];
            for(int j=A.length-2;j>=0;j--){
                A[j+1]=A[j];
            }
            A[0]=a;
        }
        return A;
    }
}
