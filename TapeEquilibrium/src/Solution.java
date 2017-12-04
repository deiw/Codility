class Solution {

    public static void main(String[] args) {
        int[]A=new int[]{3,1,2,4,3};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        int[]B=new int[A.length-1];
        int sum=0;
        for(int a:A){
            sum+=a;
        }
        int firstSum=0;
        for(int i=0;i<A.length-1;i++){
            firstSum+=A[i];
            B[i]=Math.abs(firstSum-(sum-firstSum));
        }
        int min=B[0];
        for(int i=0;i<B.length;i++){
            if(B[i]<min) min=B[i];
        }
        return min;
    }
}