public class MaximumPointsYouCanObtainfromCards {
    public static void main(String[] args) {
        int []cardPoints = {9,7,7,9,7,7,9};
        int k = 7;
        System.out.println(maxScore(cardPoints, k));
    }

    public static int maxScore(int[] cardPoints, int k) {
        int lsum=0,rsum=0,maxsum=0;

        for(int i=0;i<k;i++){
            lsum+=cardPoints[i];
        }
        maxsum=lsum;
        int rightindex=cardPoints.length-1;
        for(int j=k-1;j>=0;j--){
            lsum-=cardPoints[j];
            rsum+=cardPoints[rightindex];
            rightindex--;
            maxsum=Math.max(maxsum,lsum+rsum);
        }
       return  maxsum;
        
    }
    
    
}
