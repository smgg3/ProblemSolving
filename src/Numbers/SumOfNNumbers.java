/*
 * @author Sravani Murakonda
 * */
package Numbers;

public class SumOfNNumbers {

    public static int sumOfNNumbers(int n, int sum) {
        if (n == 0)
            return sum;
        else
            return sumOfNNumbers(n - 1, sum + n);

    }

    public static int sumOfNNumbers1(int n) {
        if (n == 0)
            return 0;
        else
            return n + sumOfNNumbers1(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sumOfNNumbers(10, 0));
        System.out.println(sumOfNNumbers1(10));
        int[] a = new int[10];

    }
    /*
     * maxSum(int[][] matrix){ int[] positive=new int[matrix[0].length]; int[]
     * negative=new int[matrix[0].length]; Arrays.fill(positive, 0);
     * Arrays.fill(negative,0); int[] flag=new int[matrix[0].length];
     * Arrays.fill(flag, 0); int minPos=0; int minNeg=0; for(int
     * i=0;i<matrix[0].length;i++) { for(int j=0;j<matrix.length;j++) {
     * if(matrix[j][i]>=0) positive[i]+=matrix[j][i]; else
     * negative[i]+=matrix[j][i]; } if(positive[minPos]>positive[i]) minPos=i;
     * if(negative[minPos]<negative[i]) minNeg=i;
     * if(positive[i]>(-1*negative[i])) flag[i]=1; } ArrayList<Integer> a=new
     * ArrayList<Integer>(); for(int i=0;i<matrix[0].length;i++) {
     * if(flag[i]==0) a.add(i); } if(a.size()%2!=0) {
     * if((positive[minPos]+negative[minPos])<((-1*negative[minNeg])+-1*positive
     * [minNeg]) {
     * 
     * 
     * a.add(minPos); }
     * 
     * else a.remove(minNeg); } int maxSum=0; for(int
     * i=0;i<matrix[0].length;i++) { if(a.contains(i)) {
     * maxSum+=(-1*negative[i]); maxSum+=
     * 
     * } else { maxSum+=positive[i]; maxSum+=negative[i]; } }
     * 
     * 
     * }
     */
}
