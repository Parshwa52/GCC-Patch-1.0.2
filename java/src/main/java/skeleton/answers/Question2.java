package skeleton.answers;

public class Question2 {

    public static int riskAndReward(int[] risk, int[] bonus, int[] trader) {
        // TODO Auto-generated method stub
        int doub[][]=new int[risk.length][2];
        int sum=0,m=0;
        for(int i=0;i<risk.length;i++)
        {
            doub[i][0]=bonus[i];
            doub[i][1]=risk[i];
        }
         java.util.Arrays.sort(doub, new java.util.Comparator<int[]>() {
    public int compare(int[] a, int[] b) {
        return Integer.compare(a[0], b[0]);
    }
});
        for(int j=0;j<trader.length;j++)
        {
            m=trader[j];
        for(int i=trader.length-1;i>=0;i--)
        {
            if(m>=doub[i][1])
            {
                sum+=doub[i][0];
                break;
            }
            
        }
        }
        return sum;
    }
}
